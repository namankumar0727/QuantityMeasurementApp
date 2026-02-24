# UC8 – Refactoring Unit Enum to Standalone with Conversion Responsibility

## 📌 Description

Refactors the architecture from UC1–UC7 by extracting `LengthUnit` into a standalone top-level enum.

Conversion responsibility is moved entirely to `LengthUnit`, while `QuantityLength` focuses only on value comparison and arithmetic operations.

This improves cohesion, reduces coupling, eliminates circular dependency risk, and establishes a scalable design pattern for future measurement categories.

---

## 🏗 Architectural Change

### Before

- `LengthUnit` embedded inside `QuantityLength`
- Conversion logic partially handled in `QuantityLength`

### After

#### `LengthUnit` → Standalone Enum

Handles:
- `convertToBaseUnit(double)`
- `convertFromBaseUnit(double)`

#### `QuantityLength`

- Delegates conversion to unit
- Handles equality and arithmetic only

---

## 🧩 Responsibilities

### 🔹 LengthUnit

- Stores conversion factor relative to base unit (`FEET`)
- Converts value → base unit
- Converts base unit → specific unit
- Immutable and thread-safe

### 🔹 QuantityLength

- Holds `value + LengthUnit`
- Delegates conversions to unit
- Implements:
  - `equals()`
  - `convertTo()`
  - `add()`
- Maintains immutability

---

## ✅ Example

```java
Quantity(1.0, FEET).convertTo(INCHES)
// → Quantity(12.0, INCHES)

Quantity(36.0, INCHES).equals(Quantity(1.0, YARDS))
// → true

LengthUnit.INCHES.convertToBaseUnit(12.0)
// → 1.0

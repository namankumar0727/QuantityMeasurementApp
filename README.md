# UC9 – Weight Measurement (Kilogram, Gram, Pound)

## 📌 Description

Extends the Quantity Measurement Application to support a new measurement category: **Weight**.

### Supported Features

- Equality comparison
- Unit conversion
- Addition (implicit & explicit target unit)

### Weight Units

- `KILOGRAM` (base unit)
- `GRAM` → *(1 g = 0.001 kg)*
- `POUND` → *(1 lb ≈ 0.453592 kg)*

> Length module (UC1–UC8) remains fully functional and independent.

---

## 🏗 Architecture

### 🔹 WeightUnit (Standalone Enum)

- Stores conversion factor relative to `KILOGRAM`
- `convertToBaseUnit(double)`
- `convertFromBaseUnit(double)`
- Immutable and thread-safe

### 🔹 QuantityWeight

- `private final double value`
- `private final WeightUnit unit`
- `equals()` based on base-unit normalization
- `convertTo(targetUnit)`
- `add(other)`
- `add(other, targetUnit)`
- Immutable value object

---

## ✅ Equality Examples

```java
Quantity(1.0, KILOGRAM).equals(Quantity(1000.0, GRAM))
// → true

Quantity(1.0, KILOGRAM).equals(Quantity(~2.20462, POUND))
// → true (within epsilon)

Quantity(1.0, KILOGRAM).equals(Quantity(1.0, FOOT))
// → false (category mismatch)

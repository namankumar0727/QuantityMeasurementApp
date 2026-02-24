# UC3 – Generic Quantity Class (DRY Principle)

## 📌 Description
Refactors UC1 and UC2 by replacing separate `Feet` and `Inches` classes with a single generic `QuantityLength` class.

Eliminates code duplication and follows the **DRY (Don't Repeat Yourself)** principle while preserving all previous functionality.

## 🎯 Objective

- Support equality comparison across units (Feet, Inches)
- Convert values to a common base unit (feet)
- Maintain clean, scalable, and maintainable design

## 🛠 Implementation

### `LengthUnit` Enum
- Contains conversion factors for each unit
- Enables standardized conversion to a base unit (feet)

### `QuantityLength` Class

- `private final double value`
- `private final LengthUnit unit`
- Converts value to base unit before comparison
- Overridden `equals()` using `Double.compare()`
- Null safety checks
- Type safety checks

## ✅ Example

### Example 1

**Input:**  
`Quantity(1.0, FEET)` and `Quantity(12.0, INCH)`

**Output:**  
`Equal: true`

### Example 2

**Input:**  
`Quantity(1.0, INCH)` and `Quantity(1.0, INCH)`

**Output:**  
`Equal: true`

## 🧠 Concepts Covered

- DRY Principle
- Enum Usage
- Polymorphism
- Abstraction
- Encapsulation
- Equality Contract
- Cross-Unit Comparison
- Single Responsibility Principle
- Scalable Design

## 🚀 Benefits Over UC1 & UC2

- No duplicated code
- Centralized conversion logic
- Easier to add new units
- Improved maintainability
- Backward compatibility preserved

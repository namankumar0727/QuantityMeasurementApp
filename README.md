# UC7 – Addition with Target Unit Specification

## 📌 Description
Extends UC6 by allowing the caller to explicitly specify the target unit for the addition result.

Instead of defaulting to the unit of the first operand, the result can be expressed in any supported `LengthUnit` (`FEET`, `INCHES`, `YARDS`, `CENTIMETERS`).

**Example:**  
`1 FEET + 12 INCHES in YARDS ≈ 0.667 YARDS`

---

## 🎯 Objective

- Add two length measurements
- Allow explicit target unit specification
- Preserve immutability
- Maintain floating-point precision
- Keep backward compatibility with UC6

---

## ➕ Addition Logic

1. Validate operands and target unit (non-null, finite values)
2. Convert both operands to base unit
3. Add base values
4. Convert sum to explicitly specified target unit
5. Return new `QuantityLength` object

---

## ✅ Example

```java
add(Quantity(1.0, FEET), Quantity(12.0, INCHES), FEET)
// → Quantity(2.0, FEET)

add(Quantity(1.0, FEET), Quantity(12.0, INCHES), INCHES)
// → Quantity(24.0, INCHES)

add(Quantity(1.0, FEET), Quantity(12.0, INCHES), YARDS)
// → Quantity(~0.667, YARDS)

add(Quantity(36.0, INCHES), Quantity(1.0, YARDS), FEET)
// → Quantity(6.0, FEET)

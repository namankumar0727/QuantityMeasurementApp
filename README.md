# UC1 – Feet Measurement Equality

## 📌 Description
Implements equality comparison between two numerical values measured in feet using proper `equals()` method implementation.

## 🎯 Objective
Return:

- `true` if both feet values are equal  
- `false` otherwise  

## 🛠 Implementation

### Inner Class: `Feet`

- Encapsulated `private final double value`
- Immutable design
- Overridden `equals()` using `Double.compare()`
- Null safety checks
- Type safety checks

## ✅ Example

**Input:**  
`1.0 ft` and `1.0 ft`

**Output:**  
`Equal: true`

## 🧠 Concepts Covered

- Equality Contract
- Floating-point comparison
- Null safety
- Type safety
- Encapsulation
- Unit testing basics

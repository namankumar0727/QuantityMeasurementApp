# UC5 – Unit-to-Unit Conversion (Same Measurement Type)

## 📌 Description
Extends UC4 by adding explicit unit-to-unit conversion support.

Provides a public API:

static double convert(double value, LengthUnit source, LengthUnit target)

Supports conversion across:

- FEET
- INCHES
- YARDS
- CENTIMETERS

## 🎯 Objective

- Convert between any supported length units
- Normalize to a base unit before conversion
- Preserve mathematical accuracy within floating-point precision

## 🛠 Implementation

### Conversion Strategy

1. Convert source value to base unit (feet or meters internally)
2. Convert base unit value to target unit
3. Return converted result

### Example Method

```java
public static double convert(double value, LengthUnit source, LengthUnit target) {
    double baseValue = source.toBaseUnit(value);
    return target.fromBaseUnit(baseValue);
}

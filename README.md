📌 **Exercise Statement**

This module covers three core Java features aimed at writing clearer, safer, and more modern code: enums for controlled finite values, the Java Time API for date and time handling, and records for defining immutable data classes with minimal boilerplate.

**Level 1 — Enums**

Enums are used to define a fixed set of constant values with semantic meaning. They improve type safety compared to primitive types or strings and can encapsulate behavior through methods.

This level focuses on enum creation, usage in control flow and classes, and extracting behavior from enum values.

**Level 1 — Exercises**

An enum named `Day` is created containing the days of the week. A function receives a `Day` value and prints whether it represents a weekday or a weekend.

An enum named `Level` is created with the values `LOW`, `MEDIUM`, and `HIGH`. A `Task` class includes a `Level` property, and behavior changes depending on the assigned level.

Methods are added to the enum to demonstrate that enums can contain logic, such as returning a color based on the level.

A `String` value is converted to an enum using `valueOf`, and invalid values are handled appropriately.

<br>

✨ **Features**

Use of enums for controlled values, behavior encapsulation within enums, enum-based control flow, safe conversion from strings, and error handling for invalid enum values.

<br>

🛠 **Technologies**

Backend: Java 25

## 📌 Exercise Statement

This module focuses on **Java enums**, a feature that allows defining a fixed set of meaningful constants. Each exercise has been completed and documented following the **Conventional Commits** standard.

- Enums improve code **readability, safety, and maintainability**.
- They can include **methods and logic**, and are safer than using strings or integers for fixed sets of values.

---

### Level 1 — Exercise 1: Days of the Week

- Created an enum `Day` with all days of the week.
- Implemented a method that receives a `Day` and prints whether it is a **workday** or **weekend**.
- Demonstrates how enums can be used in **conditions and classes** to control behavior.

---

### Level 1 — Exercise 2: Task Levels

- Created an enum `Level` with values `LOW`, `MEDIUM`, and `HIGH`.
- Implemented a `Task` class with a `Level` property.
- Behavior of the `Task` class changes depending on the assigned **level**.

---

### Level 1 — Exercise 3: Enums with Methods and String Conversion

- Added methods inside enums, such as `getColor()`, to demonstrate that enums **can contain logic**.
- Converted strings to enum values using `valueOf()`, including **error handling** for invalid input.

---

## ✨ Features

- Defining and using **enums** for fixed sets of values
- Adding **methods and logic** inside enums
- Using enums in **classes and conditional logic**
- Converting **strings to enums** safely with error handling

---

## 🛠 Technologies

- **Backend**: Java 21 (LTS)

---

## 🚀 Installation & Execution

1. Clone the repository by running `git clone <repository-url>` and navigate to the project folder.
2. Compile all Java source files using `javac -d out src/**/*.java`. This will create `.class` files in the `out` directory.
3. Run the program with `java -cp out Main`. This executes the main program demonstrating the enums exercises.

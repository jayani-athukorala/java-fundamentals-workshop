# 🧮 Calculator Application - Java Console + Java Swing

A simple desktop calculator built using **Java**.  
Supports addition, subtraction, multiplication, division, and handles invalid inputs and Provide JUnit tests.

1. **Console-based version**: `Calculator.java`
2. **GUI-based (Java Swing) version**: `Main.java` with `Model`, `View`, and `Controller` architecture.

---

# ✨ Features

- Basic operations: `+  −  ×  ÷`
- Decimal input
- Negative toggle `(±)`
- Delete (backspace)
- Clear (reset)
- Chained calculations
- Error handling:
    - Invalid input
    - Divide by zero
- MVC design pattern (separate Model, View, Controller)
- JUnit Tests

---

# 📁 Project Structure
java-fundamentals-workshop/
├── src
│ ├── main
│ │ └── java
│ │     └── se/lexicon
│ │         ├── model/CalculatorModel.java
│ │         ├── view/CalculatorView.java
│ │         ├── controller/CalculatorController.java
│ │         ├── Main.java           # Run GUI-based Calculator
│ │         └── Calculator.java     # Run Console-based Calculator
│ └── test
│   └── java
│       └── se/lexicon/model/CalculatorModelTest.java
├── pom.xml
└── README.md


---

# 🚀 How to Run

## ▶ Option 1 — Run Console-based Version

Compile and run:

```bash
javac Calculator.java
java Calculator
```

## ▶ Option 2 — Run GUI(MVC) Version

Compile all classes and run the Main class:

```bash
javac se/lexicon/**/*.java
java se.lexicon.Main
```

---

# 🚀 Running JUnit Tests (Test Model Functions)

Run :
```bash
mvn clean test
```
- This will compile the project and run all JUnit tests in ```text src/test/java ```

Example output:
```text
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

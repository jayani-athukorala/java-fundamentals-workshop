# 🧮 Calculator Application - Java Swing

A desktop calculator built using **Java Swing**.  
This project demonstrates both a **single-file implementation** and a **MVC architecture** and JUnit tests.

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

---

# 📁 Project Structure
java-fundamentals-workshop/
├── src
│ ├── main
│ │ └── java
│ │     └── se/lexicon
│ │         ├── model/CalculatorModel.java
│ │         ├── view/CalculatorView.java
│ │         └── controller/CalculatorController.java
│ └── test
│   └── java
│       └── se/lexicon/model/CalculatorModelTest.java
├── pom.xml
└── README.md


---

# 🚀 How to Run

## ▶ Option 1 — Run Single File Version

Compile and run:

```bash
javac Calculator.java
java Calculator
```

## ▶ Option 2 — Run MVC Version

Compile all classes and run the Main class:

```bash
javac se/lexicon/**/*.java
java se.lexicon.Main
```

---

# 🚀 Running JUnit Tests (MVC Version)

Run :
```bash
mvn clean test
```
- This will compile the project and run all JUnit tests in src/test/java

Example output:
```text
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

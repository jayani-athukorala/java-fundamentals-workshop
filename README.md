# 🧮 Calculator Application - Java Swing

A desktop calculator built using **Java Swing**.  
This project demonstrates both a **single-file implementation** and a **MVC architecture**.

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
se.lexicon
│
├── Calculator.java          # Single-file version
├── Main.java                # Entry point for MVC version
├── model
│   └── CalculatorModel.java
├── view
│   └── CalculatorView.java
└── controller
    └── CalculatorController.java


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
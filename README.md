# Simple Calculator
This is a simple calculator app made using Java with OOP that can do basic arithmetic operations.

## Features
-It takes input and offers choice to perform which calculation
- It can do basic calculations:
  - Addition
  - Subtraction
  - Multiplication
  - Division 
- Follows OOP
- Modular and easy-to-understand code
- CLI based interface

## Requirenments
Either:
- [JAVA JDK](https://www.oracle.com/java/technologies/downloads/?er=221886) and an IDE like [VS CODE](https://code.visualstudio.com/download)
- Use [Java Online Compiler](https://www.programiz.com/java-programming/online-compiler/) to run.
- [Git](https://git-scm.com/downloads)

## 🚀 Running the App
### Method#1
1. Go to Java Online Compiler.
2. Paste the `Calculator.java` code in there.
3. Then click, 'Run'.

### Method#2
Clone the repo using the following command:
`git clone https://github.com/ch-arslanahmad/simple-calculator`

Now in Git bash, use the following command,\
`javac Calculator.java` \
`java Calculator`


## 📚 Documentation 
### Structure
The main class is `Calculator`
- There are 3 types of main methods:
  - getInput() method which takes input of numbers and choice
  - Arithmetic methods like `add()`, `subtract()`, `divide()`, `multiply()`
  - `Choose` method which is simply a method to choose which arithmetic method to execute.
- Main Object is `calculator` on which the method are applied.

### Program flow
- User Enters 1st & 2nd number
- A numbered list of of arithmetic operations is shown like addition, division etc.
- User enters the choice in integer.
- Based on the choice number given from 1-4, the particular method is executed.









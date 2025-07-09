import java.util.Scanner;
class Calculator {
    float a;
    float b;
    Calculator(float x, float y) {
        this.a = x;
        this.b = y;
    }
    void getInput(Scanner input) {
        System.out.print("Enter 1st value: ");
        a = input.nextFloat();
        System.out.print("Enter 2nd value: ");
        b = input.nextFloat();
    }
    void add() {
        System.out.println("The sum is " + (a+b));
    }
    void subtract() {
        System.out.println("The subtraction is " + (a-b));
        
    }
    void multiply() {
        System.out.println("The multiplication is " + (a*b));
    }
    
    void divide() {
        System.out.println("The division is " + (a/b));
    }

    public static void main(String[] args) {
        float a = 0;
        float b = 0;
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator(a,b);
        calculator.getInput(input);
        
        calculator.add();
        calculator.subtract();
        calculator.multiply();
        calculator.divide();
    }
}

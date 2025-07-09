import java.util.Scanner;
class Calculator {
    float a;
    float b;
    int c;
    Calculator(float x, float y, int z) {
        this.a = x;
        this.b = y;
        this.c = z;
    }
    void getInput(Scanner input) {
        System.out.print("Enter 1st value: ");
        a = input.nextFloat();
        System.out.print("Enter 2nd value: ");
        b = input.nextFloat();
        System.out.println("\n1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        System.out.print("Enter choice: ");
        c = input.nextInt();
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
    
    void Choose() {
        switch (c) {
            case 1:
                add();
                break;
            case 2:
                subtract();
                break;
            case 3:
                multiply();
                break;
            case 4:
                divide();
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }

    public static void main(String[] args) {
        float a = 0;
        float b = 0;
        int c = 0;
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator(a,b,c);
        calculator.getInput(input);
        calculator.Choose();
    }
}

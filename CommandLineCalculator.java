package assament;

public class CommandLineCalculator {
    public static void main(String[] args) {

        if (args.length < 3) {
            System.out.println("Usage: <operation number> <num1> <num2>");
            System.out.println("Operation numbers:");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            return;
        }

        int operation = Integer.parseInt(args[0]);
        double num1 = Double.parseDouble(args[1]);
        double num2 = Double.parseDouble(args[2]);

        switch (operation) {
            case 1:
                System.out.println("Addition Result: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction Result: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication Result: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Division Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation number. Please use 1 for Addition, 2 for Subtraction, 3 for Multiplication, and 4 for Division.");
        }
    }
}

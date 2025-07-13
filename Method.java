public class Method {
    public static void main(String[] args) {
        // Example of a method call
        greet("Alice");
        int sum = add(5, 10);
        System.out.println("Sum: " + sum);
    }

    // Method to greet a user
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    public static double vatcalculation(double price, double vatRate) {
        return price + (price * vatRate / 100);
    }
    public static void printVatCalculation(double price, double vatRate) {
        double result = vatcalculation(100, 15);
        System.out.println("VAT Calculation: " + result);
    }

    
}

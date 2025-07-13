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

    
}

public class ScopeExample {
    int classLevel = 10; // Class scope

    public void methodScopeDemo(int param) { // param: parameter scope
        int methodLevel = 20; // Method scope

        if (param > 0) {
            int blockLevel = 30; // Block scope
            System.out.println("Block scope: " + blockLevel);
        }
        // blockLevel is NOT accessible here
        System.out.println("Method scope: " + methodLevel);
        System.out.println("Class scope: " + classLevel);
    }

    // Recursive example: calculates factorial
    public int recursiveFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * recursiveFactorial(n - 1);
    }

    public static void main(String[] args) {
        ScopeExample ex = new ScopeExample();
        ex.methodScopeDemo(5);

        // Recursive example usage
        int num = 5;
        int fact = ex.recursiveFactorial(num);
        System.out.println("Factorial of " + num + " is: " + fact);
    }
}

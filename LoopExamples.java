public class LoopExamples {
    public static void main(String[] args) {
        // 1. For loop: Counting apples in a basket
        System.out.println("For loop: Counting apples");
        int apples = 5;
        for (int i = 1; i <= apples; i++) {
            System.out.println("Apple " + i);
        }

        // 2. While loop: Waiting for the bus to arrive
        System.out.println("\nWhile loop: Waiting for the bus");
        boolean busArrived = false;
        int minutesWaited = 0;
        while (!busArrived && minutesWaited < 10) {
            System.out.println("Waiting... minute " + minutesWaited);
            minutesWaited++;
            if (minutesWaited == 5) {
                busArrived = true;
                System.out.println("Bus has arrived!");
            }
        }

        // 3. Do-while loop: Asking for password until correct
        System.out.println("\nDo-while loop: Entering password");
        String correctPassword = "java123";
        String enteredPassword;
        int attempts = 0;
        do {
            enteredPassword = (attempts == 2) ? "java123" : "wrong"; // Simulate user input
            System.out.println("Attempt " + (attempts + 1) + ": Entered password = " + enteredPassword);
            attempts++;
        } while (!enteredPassword.equals(correctPassword));

        // 4. Enhanced for loop (for-each): Listing groceries
        System.out.println("\nEnhanced for loop: Listing groceries");
        String[] groceries = {"Milk", "Bread", "Eggs"};
        for (String item : groceries) {
            System.out.println("Buy: " + item);
            // Nested loop: Spell out each item letter by letter
            for (int i = 0; i < item.length(); i++) {
            System.out.println("  Letter: " + item.charAt(i));
            }
        }
    }
}
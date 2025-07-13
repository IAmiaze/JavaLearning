public class TrueOrFalse {
    public static void main(String[] args) {
        int age = 10;
        int voterEligibility = 18;

        if (age >= voterEligibility) {
            System.out.println("Eligible for Voted");
        } else {
            System.out.println("Not Eligible for Voted");
        }
        int day = 3;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println("Day " + day + " is " + dayName);

        int count = 1;
        while (count <= 5) {
            System.out.println("Count is: " + count);
            count += 2;
        }
        int countdown = 20;
        // Countdown from 3 to 1
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
        int num = 1;
        do {
            System.out.println("Do-While Loop Number: " + num);
            num++;
        } while (num <= 5);

        int dice = 1;

        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("No Yatzy.");
            } else {
                System.out.println("Yatzy!");
            }
            dice = dice + 1;
        }
        // For loop example: Print names of students in a class
        String[] students = {"Alice", "Bob", "Charlie", "Diana", "Ethan"};
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals("Charlie")) {
            // Skip "Charlie"
            continue;
            }
            if (students[i].equals("Diana")) {
            // Stop the loop when "Diana" is found
            break;
            }
            System.out.println("Student " + (i + 1) + ": " + students[i]);
        }
        System.out.println("Happy New Year!!");
        System.out.println(age >= voterEligibility ? "Eligible for Voting" : "Not Eligible for Voting");
    }
}
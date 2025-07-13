public class Method {

    // Method to calculate VAT
    public static double calculateVAT(double amount, double vatRate) {
        return amount * vatRate / 100.0;
    }

    // Method to get Grade based on GPA
    public static String getGrade(double gpa) {
        int gradeCase = (int) (gpa * 10);
        switch (gradeCase) {
            case 40: case 41: case 42: case 43: case 44:
            case 45: case 46: case 47: case 48: case 49: case 50:
                return "A+";
            case 37: case 38: case 39:
                return "A";
            case 33: case 34: case 35: case 36:
                return "A-";
            case 30: case 31: case 32:
                return "B+";
            case 27: case 28: case 29:
                return "B";
            case 23: case 24: case 25: case 26:
                return "B-";
            case 20: case 21: case 22:
                return "C+";
            case 17: case 18: case 19:
                return "C";
            case 10: case 11: case 12: case 13: case 14: case 15: case 16:
                return "D";
            default:
                return "F";
        }
    }

    // Method to print student GPA and Grade
    public static void printStudentGrade(double gpa) {
        String grade = getGrade(gpa);
        System.out.println("Student GPA: " + gpa + ", Grade: " + grade);
    }

    // Method to calculate Float Share
    public static float findFloatShare(int amt, int floatRate, int noOfDays, int Yeardays) {
        return (amt * floatRate * (noOfDays + 1)) / (Yeardays * 100.0f);
    }

    // Main Method
    public static void main(String[] args) {
        // Example for GPA and Grade
        double gpa = 4.5;
        printStudentGrade(gpa);

        // Example for Float Share
        int amt = 10000;
        int floatRate = 5;
        int noOfDays = 30;
        int Yeardays = 360;

        float floatShare = findFloatShare(amt, floatRate, noOfDays, Yeardays);
        System.out.printf("Float Share: %.2f\n", floatShare);

        // Example for VAT calculation
        double amount = 1000.0;
        double vatRate = 15.0;
        double vat = calculateVAT(amount, vatRate);
        System.out.println("VAT: " + vat);
    }
}

public class Method {
    // Method to calculate VAT
    public static double calculateVAT(double amount, double vatRate) {
        return amount * vatRate / 100.0;
    }

    public static String getGrade(double gpa) {
        if (gpa >= 4.0) {
            return "A+";
        } else if (gpa >= 3.7) {
            return "A";
        } else if (gpa >= 3.3) {
            return "A-";
        } else if (gpa >= 3.0) {
            return "B+";
        } else if (gpa >= 2.7) {
            return "B";
        } else if (gpa >= 2.3) {
            return "B-";
        } else if (gpa >= 2.0) {
            return "C+";
        } else if (gpa >= 1.7) {
            return "C";
        } else if (gpa >= 1.0) {
            return "D";
        } else {
            return "F";
        }
    }

    // Example usage: print student grade
    public static void printStudentGrade(double gpa) {
        String grade = getGrade(gpa);
        System.out.println("Student GPA: " + gpa + ", Grade: " + grade);
    }

    public static void main(String[] args) {
        double amount = 1000.0;
        double vatRate = 15.0; // 15% VAT
        double vat = calculateVAT(amount, vatRate);
        System.out.println("VAT: " + vat);
    }
}
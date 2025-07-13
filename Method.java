public class Method {
    // Method to calculate VAT
    public static double calculateVAT(double amount, double vatRate) {
        return amount * vatRate / 100.0;
    }

    public static String getGrade(double gpa) {
        int gradeCase = (int) (gpa * 10);
        switch (gradeCase) {
            case 40: // 4.0 and above
            case 41: case 42: case 43: case 44: case 45: case 46: case 47: case 48: case 49: case 50:
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

    // Example usage: print student grade
    
    public static void printStudentGrade(double gpa) {
        String grade = getGrade(gpa);
        System.out.println("Student GPA: " + gpa + ", Grade: " + grade);
    }

    public static void main(String[] args) {
        double gpa = 4.5;
        printStudentGrade(gpa);
        double amount = 1000.0;
        double vatRate = 15.0; // 15% VAT
        double vat = calculateVAT(amount, vatRate);
        System.out.println("VAT: " + vat);
    }
}
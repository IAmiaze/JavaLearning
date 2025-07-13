public class ArrayExamples {
    public static void main(String[] args) {
        // 1. Integer array
        int[] numbers = {1, 2, 3, 4, 5};

        // 2. String array
        String[] fruits = {"Apple", "Banana", "Cherry"};

        // 3. Double array
        double[] prices = new double[3];
        prices[0] = 10.5;
        prices[1] = 20.75;
        prices[2] = 30.0;

        // 4. Loop through an array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number: " + numbers[i]);
        }

        // 5. Enhanced for loop
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // Print two-dimensional array
        twoDimensionalArrayExample();
    }

    public static void twoDimensionalArrayExample() {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Two Dimensional Array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
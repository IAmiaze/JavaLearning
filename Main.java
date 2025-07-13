import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();

        System.out.print("Enter item price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double totalCost = price * quantity;

        System.out.println("Item: " + itemName);
        System.out.println("Total cost: " + totalCost);

        scanner.close();
    }
}
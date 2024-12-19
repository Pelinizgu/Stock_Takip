
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StockManager stockManager = new StockManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Stock Management System ---");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. List Products");
            System.out.println("4. Find Product");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    if (name == null || name.isBlank()) {
                        System.out.println("Ürün ismi boş bırakılamaz!");
                        break; // Exit the case if validation fails
                    }
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    if (price < 0 || quantity < 0) {
                        System.out.println("Price and quantity must be positive!");
                        break; // Exit the case if validation fails
                    }
                    System.out.print("Ürün Eklendi,Teşekkürler");
                    stockManager.addProduct(new Product(name, price, quantity));
                    break;
                case 2:
                    System.out.print("Enter product name to remove: ");
                    String removeName = scanner.nextLine();
                    stockManager.removeProduct(removeName);
                    break;
                case 3:
                    stockManager.listProducts();
                    break;
                case 4:
                    System.out.print("Enter product name to find: ");
                    String findName = scanner.nextLine();
                    Product foundProduct = stockManager.findProduct(findName);
                    System.out.println(foundProduct != null ? foundProduct : "Product not found!");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

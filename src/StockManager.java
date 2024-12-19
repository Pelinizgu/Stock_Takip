
import java.util.*;

public class StockManager {
    private Map<String, Product> stock = new HashMap<>();
    private List<Product> products = new ArrayList<>();


    public void addProduct(Product product) {

        stock.put(product.getProductName(), product);
    }

    public void removeProduct(String productName) {
        stock.remove(productName);
    }

    public void listProducts() {
        stock.values().forEach(System.out::println);
    }

    public Product findProduct(String productName) {
        return stock.get(productName);
    }
}



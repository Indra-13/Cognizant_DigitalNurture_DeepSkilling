import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Mobile", "Electronics"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Bag", "Fashion")
        };

        System.out.println("Linear Search for 'Mobile':");
        Product foundLinear = ProductSearch.linearSearch(products, "Mobile");
        System.out.println(foundLinear != null ? foundLinear : "Product not found");

        
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        System.out.println("\nBinary Search for 'Mobile':");
        Product foundBinary = ProductSearch.binarySearch(products, "Mobile");
        System.out.println(foundBinary != null ? foundBinary : "Product not found");
    }
}

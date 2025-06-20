import java.util.*;
public class ECommerce{
    public static void main(String[] args){
        Product[] productsLinear = {
            new Product(101, "Laptop", "Electronics"),
            new Product(205, "Shoes", "Footwear"),
            new Product(150, "Phone", "Electronics"),
            new Product(350, "Shirt", "Apparel"),
            new Product(120, "Book", "Stationery")
        };

        Product[] productsBinary = {
            new Product(101, "Laptop", "Electronics"),
            new Product(120, "Book", "Stationery"),
            new Product(150, "Phone", "Electronics"),
            new Product(205, "Shoes", "Footwear"),
            new Product(350, "Shirt", "Apparel")
        };

        int targetId = 150;

        // Linear Search
        System.out.println("\nLinear Search: \n");
        Product linear = linearSearch(productsLinear, targetId);
        if(linear!=null)
        System.out.println("Product found in Linear Search: " + linear);
        else
        System.out.println("\nProduct not found in Linear Search\n");

        //Binary Search
        System.out.println("\nBinary Search: \n");
        Product binary = binarySearch(productsBinary, targetId);
        if (binary!=null)
        System.out.println("Product found in Binary Search: " + binary);
        else
        System.out.println("\nProduct not found in Binary Search\n");
    }
    
    public static Product linearSearch(Product[] products, int targetId){
        for(Product p : products){
            if(p.productId == targetId){
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int targetId){
        int low = 0, high = products.length - 1;

        while(low <= high){
            int mid = low+(high-low)/2;
            if(products[mid].productId == targetId)
                return products[mid];
            else if(products[mid].productId < targetId)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }
}


class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String toString() {
        return "ID: " + productId + ", Name: " + productName + ", Category: " + category;
    }
}




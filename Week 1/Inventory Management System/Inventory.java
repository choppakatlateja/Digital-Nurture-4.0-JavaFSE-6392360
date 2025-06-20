import java.util.*;

public class Inventory{
    static Scanner sc = new Scanner(System.in);
    static List<Product> products = new ArrayList<>();
    public static void main(String[] args){
        boolean exit = false;
        System.out.println("\nChoose an option:");
        System.out.println("1. Add Product");
        System.out.println("2. Perform Linear Search");
        System.out.println("3. Perform Binary Search");
        System.out.println("4. Delete");
        System.out.println("5. Exit\n");
        while(!exit){
            System.out.println("Enter Choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    addProduct();
                    break;
                case 2:
                    linearSearch();
                    break;
                case 3:
                    binarySearch();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    System.out.println("\nExiting... Thank You :)\n");
                    exit = true;
                    break;
                default:
                System.out.println("\nInvalid Choice, Please try again :(\n");
            }
        }
    }

    static void deleteProduct(){

        if(products.isEmpty()){
            System.out.println("\nNo Products Available\n");
            return;
        }
        System.out.println("Enter the Product ID to Delete");
        int id = sc.nextInt();
        int idx = -1;
        boolean found = false;
        for(int i=0;i<products.size();i++){
            Product curr = products.get(i);
            if(curr.productID==id){
                idx = i;
                found = true;
                break;
            }
        }
        if(found){
            products.remove(idx);
            System.out.println("\nProduct "+id+" is being deleted.\n");
        }
        else
        System.out.println("\nProduct "+id+" is not found in the Inventory.\n");
        
    }

    static void addProduct(){

        System.out.println("Enter Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Product Name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter Product Quantity");
        String quantity = sc.nextLine();

        System.out.println("Enter Product Price");
        int price = sc.nextInt();

        products.add(new Product(id, name, quantity, price));
        System.out.println("\nProduct Added Successfully :)\n");
    }

    static void linearSearch(){
        if(products.isEmpty()){
            System.out.println("No Products Available\n");
            return;
        }
        System.out.println("Enter Product ID to Search");
        int id = sc.nextInt();
        for(Product p: products){
            if(p.productID == id){
                System.out.println("\nProduct is Found in Linear Search :)\n");
                return;
            }
        }
        System.out.println("\nProduct not Found in Linear Search :(\n");
    }

    static void binarySearch(){
        if(products.isEmpty()){
            System.out.println("\nNo Products Available\n");
            return;
        }
        System.out.println("Enter Product ID to Search");
        int id = sc.nextInt();

        products.sort(Comparator.comparingInt(p -> p.productID));

        int low = 0, high = products.size()-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            Product midProduct = products.get(mid);
            if(midProduct.productID == id){
                System.out.println("\nProduct is Found in Binary Search :)\n");
                return;
            }
            else if(midProduct.productID < id){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println("\nProduct not Found in Binary Search :(\n");
    }
}

class Product{
    int productID;
    String productName;
    String quantity;
    int price;
    public Product(int productID, String productName, String quantity, int price){
        this.productID = productID;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
}
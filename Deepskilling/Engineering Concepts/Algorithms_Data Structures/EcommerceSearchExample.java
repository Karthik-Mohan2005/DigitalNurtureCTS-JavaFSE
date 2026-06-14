
class Product {

    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    void display() {
        System.out.println(productId + " " + productName + " " + category);
    }
}

class LinearSearch {

    public static Product search_with_id(Product[] products, int target_id) {
        for (Product prod : products) {
            if (prod.productId == target_id) {
                return prod;
            }
        }
        return null;
    }

    public static Product search_with_productName(Product[] products, String targetName) {
        for (Product prod : products) {
            if (prod.productName.equals(targetName)) {
                return prod;
            }
        }
        return null;
    }
}

class BinarySearch {

    public static Product search_with_id(Product[] products, int target_id) {
        int low = 0;
        int high = products.length - 1;
        while (low <= high) {
            int mid = (low + (high - low)) / 2;
            if (products[mid].productId == target_id) {
                return products[mid];
            } else if (products[mid].productId > target_id) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null;
    }

    public static Product search_with_productName(Product[] products, String targetName) {
        int low = 0;
        int high = products.length - 1;
        while (low <= high) {
            int mid = low+(high - low)/ 2;
            if (products[mid].productName.equals(targetName)) {
                return products[mid];
            }
            int ans = products[mid].productName.compareTo(targetName);
            if (ans > 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null;
    }
}

public class EcommerceSearchExample {

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Bag", "Fashion"),
            new Product(102, "Laptop", "Electronics"),
            new Product(103, "Phone", "Electronics"),
            new Product(104, "Shoes", "Fashion"),
            new Product(105, "Watch", "Accessories")
        };

        Product result1 = LinearSearch.search_with_id(products, 104);
        if (result1 != null) {
            System.out.println("LinearSearch results for searchId: ");
            result1.display();
        } else {
            System.out.println("Results not found");
        }

        Product result2 = LinearSearch.search_with_productName(products, "Watch");
        if (result2 != null) {
            System.out.println("LinearSearch results for searchProductName: ");
            result2.display();
        } else {
            System.out.println("Results not found");
        }

        Product result3 = BinarySearch.search_with_id(products, 101);
        if (result3 != null) {
            System.out.println("BinarySearch results for searchId: ");
            result3.display();
        } else {
            System.out.println("Results not found");
        }

        Product result4 = BinarySearch.search_with_productName(products, "Laptop");
        if (result4 != null) {
            System.out.println("BinarySearch results for searchProductName: ");
            result4.display();
        } else {
            System.out.println("Results not found");
        }
    }
}

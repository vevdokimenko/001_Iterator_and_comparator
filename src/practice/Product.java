package practice;

public class Product implements Comparable<Product> {
    public String productName;
    public int productPrice;
    public int productNumber;

    public Product(String productName, int productPrice, int productNumber) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productNumber = productNumber;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productNumber=" + productNumber +
                '}';
    }


    @Override
    public int compareTo(Product o) {
        return this.productPrice - o.productPrice;
    }
}

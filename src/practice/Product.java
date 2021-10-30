package practice;

public class Product {
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
}

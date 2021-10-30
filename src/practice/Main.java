package practice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Computer", 5000, 3);
        Product product2 = new Product("Notebook", 8000, 5);
        Product product3 = new Product("Monitor", 1250, 4);

        Product[] productsArray = {product1, product2, product3};

        List<Product> productsList = new ArrayList<>();
        productsList.add(product1);
        productsList.add(product2);
        productsList.add(product3);

//        Arrays.sort(productsArray, new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                return o1.productPrice - o2.productPrice;
//            }
//        });

        Arrays.sort(productsArray);
        for (Product item : productsArray) {
            System.out.println(item);
        }

        System.out.println("========================================");

//        Collections.sort(productsList, new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                return o1.productNumber - o2.productNumber;
//            }
//        });

        Collections.sort(productsList);
        Iterator<Product> iter = productsList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}

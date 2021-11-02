package extra;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(190, 8000, "BMW", "Red");
        Car c2 = new Car(190, 8000, "BMW", "Black");
        Car c3 = new Car(190, 8000, "BMW", "White");
        Car c4 = new Car(190, 8000, "BMW", "Silver");
        Car[] c = {c1, c2, c3, c4};

        Arrays.sort(c);   // ClassCastException
        for (Car temp : c) {
            System.out.println(temp);
        }
    }
}

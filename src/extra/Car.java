package extra;

public class Car implements Comparable { //<Car>{
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене
    public int compareTo(Object o) {    // public int compareTo(Car o) {
        int temp = this.speed - ((Car)o).speed;   // int temp = this.speed - o.speed;
        if (temp == 0) {
            if (this.price == ((Car) o).price) {
                if (this.model.compareTo(((Car) o).model) == 0) {
                    if (this.color.compareTo(((Car) o).color) == 0) {
                        return 0;
                    } else {
                        return this.color.compareTo(((Car) o).color);
                    }
                } else {
                    return this.model.compareTo(((Car) o).model);
                }
            } else {
                return this.price - ((Car)o).price;
            }
        } else {
            return temp;
        }
    }

    // Сравнение 2-х строковых значений
    // return this.model.compareTo((Car)o).model);
}
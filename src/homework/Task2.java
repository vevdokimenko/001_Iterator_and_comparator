package homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}

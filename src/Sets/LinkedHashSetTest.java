package Sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
    public static void main(String[] args) {

        Set<Integer> set1 = new LinkedHashSet<>(10, 5);

        for (int i = 0; i < 50; i++) {
            set1.add(i);
        }
        System.out.println(set1.add(1));
        System.out.println(set1);
        System.out.println(set1.size());
        System.out.println(set1.isEmpty());
        set1.clear();
        System.out.println(set1.isEmpty());
    }
}

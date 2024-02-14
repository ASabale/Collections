package Sets;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        for (int i = 10; i < 20; i++) {
            ts.add(i);
        }
        System.out.println(ts.size());
        System.out.println(ts.ceiling(15));
        System.out.println(ts.floor(15));
        System.out.println(ts);
        System.out.println(ts.descendingSet());
        System.out.println(ts.first());
        System.out.println(ts.headSet(15));
        System.out.println(ts.headSet(15, true));
        System.out.println(ts.isEmpty());
        System.out.println(ts.last());
        System.out.println(ts.lower(15));
        System.out.println(ts.tailSet(15, true));
        System.out.println(ts.subSet(12,true, 15, true));
    }
}

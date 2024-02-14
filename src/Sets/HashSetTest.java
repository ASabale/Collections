package Sets;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        //initialization
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>(10);
        HashSet<Integer> hs3 = new HashSet<>(5, 2);

        for (int i = 0; i < 50; i++) {
            hs1.add(i);
        }
        hs1.add(1);
        System.out.println(hs1);
        System.out.println(hs1.contains(1));
        System.out.println(hs1.remove(1));
        hs1.iterator().forEachRemaining(System.out::println);
        System.out.println(hs1.size());
        System.out.println(hs1.isEmpty());
        System.out.println(hs2.isEmpty());
        System.out.println(hs1.clone());

        for (int i = 0; i < 50; i++) {
            hs3.add(i);
        }
        System.out.println(hs3);
        System.out.println(hs3.size());
    }
}

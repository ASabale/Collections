package Lists;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        //initialization
        Vector<Integer> v1 = new Vector<>(20,20);

        //add examples
        v1.add(1);
        v1.add(2);
        v1.add(4);
        v1.add(2,3);

        Vector<Integer> v2 = new Vector<>(Arrays.asList(5,6,7));
        Vector<Integer> v3 = new Vector<>(Arrays.asList(8,9,0));

        v1.addAll(v2);
        v1.addAll(0,v3);

        v1.addElement(10);

        System.out.println(v1);

        System.out.println("capacity of v1 is: "+ v1.capacity());

        v3.clear();
        System.out.println(v3);

        v3 = (Vector<Integer>) v2.clone();
        System.out.println(v3);

        System.out.println(v3.contains(4));

        System.out.println(v1.containsAll(v3));

        System.out.println(v1.elementAt(0));

        v1.elements().asIterator().forEachRemaining(System.out::print);
        System.out.println();

        v1.ensureCapacity(20);

        System.out.println(v1.firstElement());

        v1.forEach((n) -> System.out.print(n));
        System.out.println();

        System.out.println(v1.get(2));

        System.out.println(v1.indexOf(10));

        System.out.println(v1.indexOf(0,2));

        v1.insertElementAt(20, 5);

        System.out.println(v1.isEmpty());

        System.out.println(v1.lastElement());

        v1.listIterator().next();

        v1.remove(4);

        v2.removeAllElements();

        v3.add(1);
        v3.removeElementAt(0);
        System.out.println(v3);

        v3.retainAll(Arrays.asList(1,6));

        v3.set(0, 1);
        System.out.println(v3);

        v3.setElementAt(2,0);
        System.out.println(v3);

        v3.setSize(22);
        System.out.println(v3.size());

        v1.sort(Comparator.naturalOrder());
        System.out.println(v1);

        Object[] arr = v3.toArray();

        System.out.println(v3.toString());

        System.out.println(v1.size());
        v1.trimToSize();
        System.out.println(v1.size());






    }
}

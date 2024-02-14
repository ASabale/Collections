package Lists;

import java.util.*;
import java.util.function.Consumer;

public class ArrayListTest {
    public static void main(String[] args) {

        //initialisation
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(20);
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list4 = new ArrayList<>(list3);
        ArrayList<Integer> list5 = new ArrayList<>();

        //adding to the list
        list1.add(1);
        list1.add(2);
        list2.add(0,3);
        list2.add(1,1);
        list2.add(0,2);
        list5.add(1);
        list5.add(2);
        list5.add(3);
        list5.add(4);
        list5.add(5);

        //clear list
        list1.clear();

        //check if list contains element
        System.out.println("check if list contains element:");
        System.out.println(list1.contains(1));
        System.out.println(list2.contains(3));

        //shallow clone list
        ArrayList<Integer> clone = (ArrayList<Integer>) list2.clone();

        //check if list contains collection
        System.out.println("check if list contains collection:");
        System.out.println(list4.containsAll(list3));

        //compare objects
        System.out.println("compare objects:");
        System.out.println(list3.equals(list4));
        System.out.println(list3.equals(list5));
        System.out.println(list3.get(0).equals(list5.get(0)));

        //for each element of the list, perform action
        System.out.println("for each element of the list, perform action:");
        list5.forEach((n) -> System.out.print(n + " "));
        System.out.println();
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        list4.forEach(method);

        //retrive element from list
        System.out.println("retrieval:");
        System.out.println(list2.get(0));

        //print class name of list
        System.out.println("get class of list:");
        System.out.println(list3.getClass());

        //get hashcode of list
        System.out.println("get hashcode");
        System.out.println(list4.hashCode());
        System.out.println(list3.hashCode());
        System.out.println(list5.hashCode());

        //check if list is empty
        System.out.println("check empty:");
        System.out.println(list1.isEmpty());
        System.out.println(list2.isEmpty());

        //get iterator for list
        System.out.println("iterator usecase:");
        Iterator<Integer> iter = list3.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        //check index of value
        System.out.println("check index of value:");
        System.out.println(list4.indexOf(3));

        //print last index of provided value
        System.out.println("get last index of value:");
        System.out.println(list3.lastIndexOf(5));

        //get list iterator
        System.out.println("print using list iterator");
        list5.listIterator().forEachRemaining(System.out::print);
        System.out.println();

        //get list iterator for index
        System.out.println("print using list iterator from index");
        list5.listIterator(2).forEachRemaining(System.out::print);
        System.out.println();

        //use parallel stream
        System.out.println("use parallel stream to print element and thread name");
        list3.parallelStream().forEach((n) -> System.out.println(n + " " + Thread.currentThread().getName()));

        //remove element from list
        System.out.println("remove element from list");
        System.out.println(list5.remove(4));

        //remove collection of elements from list
        System.out.println("remove collection from list");
        System.out.println(list5.removeAll(new ArrayList<>(Arrays.asList(1,7))));
        System.out.println(list5);

        //replace element at index with value
        list5.set(2, 5);

        //get list size
        System.out.println("list size");
        System.out.println(list5.size());

        //split iterator
        System.out.println("split iterator of list");
        list5.spliterator().forEachRemaining((n) -> System.out.println(n + " " + Thread.currentThread().getName()));

        //sequencial stream
        System.out.println("stream list");
        list5.stream().forEach((n) -> System.out.println(n + " " + Thread.currentThread().getName()));

        //sort list
        System.out.println("sort list");
        list5.sort(Comparator.reverseOrder());
        System.out.println(list5);

        //get sublist from list
        System.out.println("sublist from index to index");
        System.out.println(list5.subList(1,2));

        //convert to array
        System.out.println("convert to array");
        Object[] arr = list5.toArray();
        System.out.println(Arrays.stream(arr).count());

        //reduce capacity based on size
        System.out.println("trim list size");
        list5.trimToSize();
        System.out.println(list5.size());
    }
}

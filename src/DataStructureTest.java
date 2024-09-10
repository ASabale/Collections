import java.util.*;
import java.util.concurrent.*;

public class DataStructureTest {

    // Test data
    static final int ELEMENTS_COUNT = 100000;
    static final int[] TEST_DATA = new int[ELEMENTS_COUNT];

    static {
        Random random = new Random();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            TEST_DATA[i] = random.nextInt(ELEMENTS_COUNT);
        }
    }

    public static void main(String[] args) {
        // Testing Lists
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> stack = new Stack<>();
        List<Integer> vector = new Vector<>();
        List<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

        // Testing Sets
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<>();

        // Testing Maps
        Map<Integer, Integer> hashMap = new HashMap<>();
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, Integer> treeMap = new TreeMap<>();
        Map<Integer, Integer> concurrentHashMap = new ConcurrentHashMap<>();

        // Testing Deques
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        Deque<Integer> linkedListDeque = new LinkedList<>();

        // Testing Queues
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        Queue<Integer> linkedBlockingQueue = new LinkedBlockingQueue<>();
        Queue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>();

        // Performing operations
        performOperations("ArrayList", arrayList);
        performOperations("LinkedList", linkedList);
        performOperations("Vector", vector);
        performOperations("CopyOnWriteArrayList", copyOnWriteArrayList);

        performOperations("HashSet", hashSet);
        performOperations("LinkedHashSet", linkedHashSet);
        performOperations("TreeSet", treeSet);
        performOperations("CopyOnWriteArraySet", copyOnWriteArraySet);

        performOperations("HashMap", hashMap);
        performOperations("LinkedHashMap", linkedHashMap);
        performOperations("TreeMap", treeMap);
        performOperations("ConcurrentHashMap", concurrentHashMap);

        performOperations("ArrayDeque", arrayDeque);
        performOperations("LinkedListDeque", linkedListDeque);

        performOperations("PriorityQueue", priorityQueue);
        performOperations("LinkedBlockingQueue", linkedBlockingQueue);
        performOperations("PriorityBlockingQueue", priorityBlockingQueue);
    }

    private static void performOperations(String name, Collection<Integer> collection) {
        long startTime, endTime;

        // Insertion
        startTime = System.currentTimeMillis();
        for (int data : TEST_DATA) {
            collection.add(data);
        }
        endTime = System.currentTimeMillis();
        System.out.println(name + " - Insertion: " + (endTime - startTime) + " ms");

        // Searching
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            collection.contains(TEST_DATA[i]);
        }
        endTime = System.currentTimeMillis();
        System.out.println(name + " - Searching: " + (endTime - startTime) + " ms");

        // Deletion
        startTime = System.currentTimeMillis();
        collection.clear();
        endTime = System.currentTimeMillis();
        System.out.println(name + " - Deletion: " + (endTime - startTime) + " ms");
    }

    private static void performOperations(String name, Map<Integer, Integer> map) {
        long startTime, endTime;

        // Insertion
        startTime = System.currentTimeMillis();
        for (int data : TEST_DATA) {
            map.put(data, data);
        }
        endTime = System.currentTimeMillis();
        System.out.println(name + " - Insertion: " + (endTime - startTime) + " ms");

        // Searching
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            map.containsKey(TEST_DATA[i]);
        }
        endTime = System.currentTimeMillis();
        System.out.println(name + " - Searching: " + (endTime - startTime) + " ms");

        // Deletion
        startTime = System.currentTimeMillis();
        map.clear();
        endTime = System.currentTimeMillis();
        System.out.println(name + " - Deletion: " + (endTime - startTime) + " ms");
    }

    private static void performOperations(String name, Queue<Integer> queue) {
        long startTime, endTime;

        // Insertion
        startTime = System.currentTimeMillis();
        for (int data : TEST_DATA) {
            queue.add(data);
        }
        endTime = System.currentTimeMillis();
        System.out.println(name + " - Insertion: " + (endTime - startTime) + " ms");

        // Searching
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            queue.contains(TEST_DATA[i]);
        }
        endTime = System.currentTimeMillis();
        System.out.println(name + " - Searching: " + (endTime - startTime) + " ms");

        // Deletion
        startTime = System.currentTimeMillis();
        queue.clear();
        endTime = System.currentTimeMillis();
        System.out.println(name + " - Deletion: " + (endTime - startTime) + " ms");
    }

    private static void performOperations(String name, Deque<Integer> deque) {
        long startTime, endTime;

        // Insertion
        startTime = System.currentTimeMillis();
        for (int data : TEST_DATA) {
            deque.add(data);
        }
        endTime = System.currentTimeMillis();
        System.out.println(name + " - Insertion: " + (endTime - startTime) + " ms");

        // Searching
        startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            deque.contains(TEST_DATA[i]);
        }
        endTime = System.currentTimeMillis();
        System.out.println(name + " - Searching: " + (endTime - startTime) + " ms");

        // Deletion
        startTime = System.currentTimeMillis();
        deque.clear();
        endTime = System.currentTimeMillis();
        System.out.println(name + " - Deletion: " + (endTime - startTime) + " ms");
    }
}

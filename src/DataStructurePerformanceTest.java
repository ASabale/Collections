import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class DelayedElement implements Delayed {
    private final long delayTime;
    private final long creationTime;

    public DelayedElement(long delayTime) {
        this.delayTime = delayTime;
        this.creationTime = System.currentTimeMillis();
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = creationTime + delayTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if (this.getDelay(TimeUnit.MILLISECONDS) < o.getDelay(TimeUnit.MILLISECONDS)) {
            return -1;
        }
        if (this.getDelay(TimeUnit.MILLISECONDS) > o.getDelay(TimeUnit.MILLISECONDS)) {
            return 1;
        }
        return 0;
    }
}

public class DataStructurePerformanceTest {

    private static final int ELEMENTS = 100_000;
    private static final Map<String, Long[]> results = new HashMap<>();

    public static void main(String[] args) {
        testList(new ArrayList<>());
        testList(new Vector<>());
        testList(new Stack<>());
        testList(new LinkedList<>());

        testQueue(new PriorityQueue<>());
        testQueue(new ConcurrentLinkedQueue<>());
        testQueue(new ArrayBlockingQueue<>(ELEMENTS));
        testDelayQueue(); // Updated for DelayQueue
        testQueue(new LinkedBlockingQueue<>());
        testQueue(new LinkedTransferQueue<>());

        testDeque(new ArrayDeque<>());
        testDeque(new ConcurrentLinkedDeque<>());

        testSet(new HashSet<>());
        testSet(new LinkedHashSet<>());
        testSet(new CopyOnWriteArraySet<>());
        testEnumSet(); // Updated for EnumSet
        testSet(new TreeSet<>());
        testSet(new ConcurrentSkipListSet<>());

        testMap(new HashMap<>());
        testMap(new LinkedHashMap<>());
        testMap(new TreeMap<>());
        testMap(new ConcurrentHashMap<>());
        testMap(new IdentityHashMap<>());
        testEnumMap(); // Updated for EnumMap
        testMap(new Hashtable<>());
        testProperties(); // Updated for Properties

        printResults();
        System.out.println("Performance testing completed.");
    }

    private static void testList(List<Integer> list) {
        String className = list.getClass().getSimpleName();
        System.out.println("Testing " + className);
        Long[] times = new Long[3];

        long startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS; i++) {
            list.add(i);
        }
        long endTime = System.nanoTime();
        times[0] = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS; i++) {
            list.get(i);
        }
        endTime = System.nanoTime();
        times[1] = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = ELEMENTS - 1; i >= 0; i--) {
            list.remove(i);
        }
        endTime = System.nanoTime();
        times[2] = endTime - startTime;

        results.put(className, times);
        System.out.println("Add: " + times[0] + " ns");
        System.out.println("Get: " + times[1] + " ns");
        System.out.println("Remove: " + times[2] + " ns");
        System.out.println();
    }

    private static void testQueue(Queue<Integer> queue) {
        String className = queue.getClass().getSimpleName();
        System.out.println("Testing " + className);
        Long[] times = new Long[2];

        long startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS; i++) {
            queue.add(i);
        }
        long endTime = System.nanoTime();
        times[0] = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS; i++) {
            queue.poll();
        }
        endTime = System.nanoTime();
        times[1] = endTime - startTime;

        results.put(className, times);
        System.out.println("Add: " + times[0] + " ns");
        System.out.println("Poll: " + times[1] + " ns");
        System.out.println();
    }

    private static void testDelayQueue() {
        String className = "DelayQueue";
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        System.out.println("Testing " + className);
        Long[] times = new Long[2];

        long startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS; i++) {
            queue.add(new DelayedElement(1000));
        }
        long endTime = System.nanoTime();
        times[0] = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS; i++) {
            queue.poll();
        }
        endTime = System.nanoTime();
        times[1] = endTime - startTime;

        results.put(className, times);
        System.out.println("Add: " + times[0] + " ns");
        System.out.println("Poll: " + times[1] + " ns");
        System.out.println();
    }

    private static void testDeque(Deque<Integer> deque) {
        String className = deque.getClass().getSimpleName();
        System.out.println("Testing " + className);
        Long[] times = new Long[2];

        long startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS; i++) {
            deque.add(i);
        }
        long endTime = System.nanoTime();
        times[0] = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS; i++) {
            deque.poll();
        }
        endTime = System.nanoTime();
        times[1] = endTime - startTime;

        results.put(className, times);
        System.out.println("Add: " + times[0] + " ns");
        System.out.println("Poll: " + times[1] + " ns");
        System.out.println();
    }

    private static void testSet(Set<Integer> set) {
        String className = set.getClass().getSimpleName();
        System.out.println("Testing " + className);
        Long[] times = new Long[3];

        long startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS; i++) {
            set.add(i);
        }
        long endTime = System.nanoTime();
        times[0] = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS; i++) {
            set.contains(i);
        }
        endTime = System.nanoTime();
        times[1] = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS; i++) {
            set.remove(i);
        }
        endTime = System.nanoTime();
        times[2] = endTime - startTime;

        results.put(className, times);
        System.out.println("Add: " + times[0] + " ns");
        System.out.println("Contains: " + times[1] + " ns");
        System.out.println("Remove: " + times[2] + " ns");
        System.out.println();
    }

    private static void testEnumSet() {
        String className = "EnumSet";
        EnumSet<Element> set = EnumSet.noneOf(Element.class);
        System.out.println("Testing " + className);
        Long[] times = new Long[3];

        long startTime = System.nanoTime();
        for (Element e : Element.values()) {
            set.add(e);
        }
        long endTime = System.nanoTime();
        times[0] = endTime - startTime;

        startTime = System.nanoTime();
        for (Element e : Element.values()) {
            set.contains(e);
        }
        endTime = System.nanoTime();
        times[1] = endTime - startTime;

        startTime = System.nanoTime();
        for (Element e : Element.values()) {
            set.remove(e);
        }
        endTime = System.nanoTime();
        times[2] = endTime - startTime;

        results.put(className, times);
        System.out.println("Add: " + times[0] + " ns");
        System.out.println("Contains: " + times[1] + " ns");
        System.out.println("Remove: " + times[2] + " ns");
        System.out.println();
    }

    private static void testMap(Map<Integer, Integer> map) {
        String className = map.getClass().getSimpleName();
        System.out.println("Testing " + className);
        Long[] times = new Long[3];

        long startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS; i++) {
            map.put(i, i);
        }
        long endTime = System.nanoTime();
        times[0] = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS; i++) {
            map.get(i);
        }
        endTime = System.nanoTime();
        times[1] = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS; i++) {
            map.remove(i);
        }
        endTime = System.nanoTime();
        times[2] = endTime - startTime;

        results.put(className, times);
        System.out.println("Put: " + times[0] + " ns");
        System.out.println("Get: " + times[1] + " ns");
        System.out.println("Remove: " + times[2] + " ns");
        System.out.println();
    }

    private static void testEnumMap() {
        String className = "EnumMap";
        EnumMap<Element, Integer> map = new EnumMap<>(Element.class);
        System.out.println("Testing " + className);
        Long[] times = new Long[3];

        long startTime = System.nanoTime();
        for (Element e : Element.values()) {
            map.put(e, e.ordinal());
        }
        long endTime = System.nanoTime();
        times[0] = endTime - startTime;

        startTime = System.nanoTime();
        for (Element e : Element.values()) {
            map.get(e);
        }
        endTime = System.nanoTime();
        times[1] = endTime - startTime;

        startTime = System.nanoTime();
        for (Element e : Element.values()) {
            map.remove(e);
        }
        endTime = System.nanoTime();
        times[2] = endTime - startTime;

        results.put(className, times);
        System.out.println("Put: " + times[0] + " ns");
        System.out.println("Get: " + times[1] + " ns");
        System.out.println("Remove: " + times[2] + " ns");
        System.out.println();
    }

    private static void testProperties() {
        String className = "Properties";
        Properties properties = new Properties();
        System.out.println("Testing " + className);
        Long[] times = new Long[3];

        long startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS; i++) {
            properties.setProperty("key" + i, "value" + i);
        }
        long endTime = System.nanoTime();
        times[0] = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS; i++) {
            properties.getProperty("key" + i);
        }
        endTime = System.nanoTime();
        times[1] = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS; i++) {
            properties.remove("key" + i);
        }
        endTime = System.nanoTime();
        times[2] = endTime - startTime;

        results.put(className, times);
        System.out.println("Put: " + times[0] + " ns");
        System.out.println("Get: " + times[1] + " ns");
        System.out.println("Remove: " + times[2] + " ns");
        System.out.println();
    }

    private static void printResults() {
        System.out.println("Performance Results:");
        System.out.println("Class Name         | Add Time (ns)      | Get Time (ns)      | Remove Time (ns)");
        System.out.println("--------------------------------------------------------------------------");
        for (Map.Entry<String, Long[]> entry : results.entrySet()) {
            String className = entry.getKey();
            Long[] times = entry.getValue();
            if (times.length == 3) {
                System.out.printf("%-20s | %-18d | %-18d | %-18d\n", className, times[0], times[1], times[2]);
            } else if (times.length == 2) {
                System.out.printf("%-20s | %-18d | %-18d | %-18s\n", className, times[0], times[1], "N/A");
            }
        }
    }

    enum Element {
        ONE, TWO, THREE
    }
}

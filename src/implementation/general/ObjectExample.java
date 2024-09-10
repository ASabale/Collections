package implementation.general;

public class ObjectExample {
    public static void main(String[] args) {
        // Creating two objects
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 30);
        Person person3 = new Person("Alice", 30);

        // Demonstrating equals() method
        System.out.println("person1 equals person2: " + person1.equals(person2));
        System.out.println("person1 equals person3: " + person1.equals(person3));

        // Demonstrating hashCode() method
        System.out.println("person1 hashCode: " + person1.hashCode());
        System.out.println("person2 hashCode: " + person2.hashCode());
        System.out.println("person3 hashCode: " + person3.hashCode());

        // Demonstrating toString() method
        System.out.println("person1 toString: " + person1.toString());
        System.out.println("person2 toString: " + person2.toString());

        // Demonstrating getClass() method
        System.out.println("person1 class: " + person1.getClass().getName());

        // Demonstrating clone() method (requires implementation of Cloneable interface)
        try {
            Person clonedPerson = (Person) person1.clone();
            System.out.println("Cloned person: " + clonedPerson.toString());
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported: " + e.getMessage());
        }
    }
}

// Custom class extending Object
class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override equals() to compare Person objects based on name and age
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

    // Override hashCode() to provide a hash code based on name and age
    @Override
    public int hashCode() {
        return 31 * name.hashCode() + age;
    }

    // Override toString() to provide a meaningful string representation
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    // Override clone() to create a copy of this Person
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

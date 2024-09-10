package implementation.general;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // Creating an Optional with a non-null value
        Optional<String> nonEmptyOptional = Optional.of("Hello, World!");
        System.out.println("Non-empty Optional: " + nonEmptyOptional);

        // Creating an Optional that may be empty
        Optional<String> emptyOptional = Optional.empty();
        System.out.println("Empty Optional: " + emptyOptional);

        // Creating an Optional with a nullable value
        String nullableString = null;
        Optional<String> nullableOptional = Optional.ofNullable(nullableString);
        System.out.println("Nullable Optional: " + nullableOptional);

        // Checking if Optional contains a value
        System.out.println("Non-empty Optional is present: " + nonEmptyOptional.isPresent());
        System.out.println("Empty Optional is present: " + emptyOptional.isPresent());

        // Retrieving the value from Optional with or without a default
        String value = nonEmptyOptional.get();
        System.out.println("Value from non-empty Optional: " + value);

        // Using ifPresent to perform an action if the value is present
        nonEmptyOptional.ifPresent(v -> System.out.println("Value present: " + v));

        // Providing a default value if Optional is empty
        String defaultValue = emptyOptional.orElse("Default Value");
        System.out.println("Default value from empty Optional: " + defaultValue);

        // Using orElseGet with a Supplier to provide a default value
        String defaultValueWithSupplier = emptyOptional.orElseGet(() -> "Default Value from Supplier");
        System.out.println("Default value from empty Optional using Supplier: " + defaultValueWithSupplier);

        // Throwing an exception if Optional is empty
        try {
            String valueOrException = emptyOptional.orElseThrow(() -> new RuntimeException("Value is not present"));
            System.out.println("Value from empty Optional: " + valueOrException);
        } catch (RuntimeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Mapping the value in the Optional
        Optional<Integer> lengthOptional = nonEmptyOptional.map(String::length);
        System.out.println("Length of value in non-empty Optional: " + lengthOptional.get());

        // FlatMapping the value in the Optional
        Optional<String> flatMappedOptional = nonEmptyOptional.flatMap(v -> Optional.of(v.toUpperCase()));
        System.out.println("FlatMapped value: " + flatMappedOptional.get());

        // Filtering the value in the Optional
        Optional<String> filteredOptional = nonEmptyOptional.filter(v -> v.contains("World"));
        System.out.println("Filtered Optional: " + filteredOptional);

        // Filtering the Optional with no matching value
        Optional<String> filteredEmptyOptional = emptyOptional.filter(v -> v.contains("World"));
        System.out.println("Filtered empty Optional: " + filteredEmptyOptional);
    }
}

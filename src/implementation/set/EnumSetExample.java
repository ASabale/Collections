package implementation.set;

import java.util.EnumSet;

public class EnumSetExample {
    public static void main(String[] args) {
        // Define an enum for access levels
        enum AccessLevel {
            ADMIN,
            EDITOR,
            VIEWER,
            GUEST
        }

        // Creating an EnumSet containing all enum constants
        EnumSet<AccessLevel> allAccessLevels = EnumSet.allOf(AccessLevel.class);
        System.out.println("All Access Levels: " + allAccessLevels);

        // Creating an EnumSet containing specific enum constants
        EnumSet<AccessLevel> specificAccessLevels = EnumSet.of(AccessLevel.ADMIN, AccessLevel.EDITOR);
        System.out.println("Specific Access Levels: " + specificAccessLevels);

        // Creating an EnumSet containing a range of enum constants
        EnumSet<AccessLevel> rangeAccessLevels = EnumSet.range(AccessLevel.EDITOR, AccessLevel.VIEWER);
        System.out.println("Range Access Levels: " + rangeAccessLevels);

        // Creating an EnumSet containing all constants except the specified ones
        EnumSet<AccessLevel> complementAccessLevels = EnumSet.complementOf(specificAccessLevels);
        System.out.println("Complement Access Levels: " + complementAccessLevels);

        // Checking if a specific enum constant is present
        System.out.println("Contains ADMIN? " + specificAccessLevels.contains(AccessLevel.ADMIN));
        System.out.println("Contains GUEST? " + specificAccessLevels.contains(AccessLevel.GUEST));

        // Adding and removing elements
        specificAccessLevels.add(AccessLevel.GUEST);
        System.out.println("Specific Access Levels after adding GUEST: " + specificAccessLevels);
        specificAccessLevels.remove(AccessLevel.ADMIN);
        System.out.println("Specific Access Levels after removing ADMIN: " + specificAccessLevels);

        // Iterating over EnumSet
        System.out.println("Iterating over specific access levels:");
        for (AccessLevel level : specificAccessLevels) {
            System.out.println("Access Level: " + level);
        }

        // Clearing the EnumSet
        specificAccessLevels.clear();
        System.out.println("Specific Access Levels after clearing: " + specificAccessLevels);
    }
}


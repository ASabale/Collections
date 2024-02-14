package Sets;

import java.util.EnumSet;

public class EnumSetTest {
    public static void main(String[] args) {
        enum days {Monday, Tuesday, Wednesday, Thursday}
        EnumSet<days> es;

        es = EnumSet.of(days.Monday, days.Wednesday);
        System.out.println(es);
        System.out.println(EnumSet.complementOf(es));
        System.out.println(EnumSet.allOf(days.class));
        System.out.println(EnumSet.noneOf(days.class));
        System.out.println(EnumSet.range(days.Tuesday, days.Thursday));
    }
}

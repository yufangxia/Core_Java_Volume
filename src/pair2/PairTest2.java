package pair2;

import java.time.*;

public class PairTest2 {
    public static void main(String[] args) {
        LocalDate[] birthdays = {
                LocalDate.of(1906, 12, 9),
                LocalDate.of(1933, 12, 9),
                LocalDate.of(1910, 12, 9),
                LocalDate.of(1903, 12, 9)
        };
        Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}

class ArrayAlg {
    public static <T extends Comparable> Pair<T> minmax(T[] a) {
        if(a.length == 0 || a == null) return null;
        T min = a[0];
        T max = a[0];
        for(int i = 1; i < a.length; i++) {
            if(max.compareTo(a[i]) > 0) max = a[i];
            if(min.compareTo(a[i]) < 0) min = a[i];
        }
        return new Pair<>(min, max);
    }
}

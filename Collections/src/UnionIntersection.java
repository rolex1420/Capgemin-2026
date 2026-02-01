import java.util.*;

public class UnionIntersection {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> b = new HashSet<>(Set.of(3, 4, 5));

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);

        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);

        System.out.println(union);
        System.out.println(intersection);
    }
}

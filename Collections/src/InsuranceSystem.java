import java.time.LocalDate;
import java.util.*;

class Policy {
    int number;
    String holder;
    LocalDate expiry;
    String type;
    double premium;

    Policy(int n, String h, LocalDate e, String t, double p) {
        number = n;
        holder = h;
        expiry = e;
        type = t;
        premium = p;
    }
}

public class InsuranceSystem {
    public static void main(String[] args) {
        Set<Policy> hashSet = new HashSet<>();
        Set<Policy> linkedSet = new LinkedHashSet<>();
        Set<Policy> treeSet =
                new TreeSet<>(Comparator.comparing(p -> p.expiry));

        Policy p1 = new Policy(1, "Amit", LocalDate.now().plusDays(20), "Health", 5000);
        Policy p2 = new Policy(2, "Ravi", LocalDate.now().plusDays(40), "Auto", 3000);

        hashSet.add(p1);
        linkedSet.add(p1);
        treeSet.add(p1);

        hashSet.add(p2);
        linkedSet.add(p2);
        treeSet.add(p2);

        treeSet.forEach(p -> System.out.println(p.number));
    }
}

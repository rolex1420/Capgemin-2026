import java.io.*;
import java.util.*;

public class DetectDuplicateCSV {
    public static void main(String[] args) throws Exception {
        Set<String> set = new HashSet<>();
        BufferedReader br = new BufferedReader(new FileReader("data.csv"));
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {
            String id = line.split(",")[0];
            if (!set.add(id)) {
                System.out.println("Duplicate record: " + line);
            }
        }
        br.close();
    }
}

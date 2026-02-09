import java.io.*;
import java.util.*;

public class MergeCSVFiles {
    public static void main(String[] args) throws Exception {
        Map<String, String[]> map = new HashMap<>();

        BufferedReader br1 = new BufferedReader(new FileReader("students1.csv"));
        br1.readLine();
        String line;

        while ((line = br1.readLine()) != null) {
            String[] s = line.split(",");
            map.put(s[0], s);
        }

        BufferedReader br2 = new BufferedReader(new FileReader("students2.csv"));
        br2.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter("merged.csv"));
        bw.write("ID,Name,Age,Marks,Grade\n");

        while ((line = br2.readLine()) != null) {
            String[] s2 = line.split(",");
            String[] s1 = map.get(s2[0]);
            if (s1 != null) {
                bw.write(s1[0] + "," + s1[1] + "," + s1[2] +
                        "," + s2[1] + "," + s2[2] + "\n");
            }
        }

        br1.close();
        br2.close();
        bw.close();
    }
}

import java.io.*;

public class FilterStudentsCSV {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {
            String[] s = line.split(",");
            if (Integer.parseInt(s[3]) > 80) {
                System.out.println(line);
            }
        }
        br.close();
    }
}

import java.io.*;

public class LargeCSVReader {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("large.csv"));
        int count = 0;
        String line;

        while (true) {
            int batch = 0;
            while (batch < 100 && (line = br.readLine()) != null) {
                batch++;
                count++;
            }
            if (batch == 0) break;
            System.out.println("Processed records: " + count);
        }
        br.close();
    }
}

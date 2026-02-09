import java.io.*;

public class JsonToCsv {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("students.json"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("students.csv"));

        bw.write("id,name\n");
        String line;
        while ((line = br.readLine()) != null) {
            line = line.replaceAll("[\\[\\]{}\"]", "");
            String[] p = line.split(",");
            bw.write(p[0].split(":")[1] + "," + p[1].split(":")[1] + "\n");
        }
        br.close();
        bw.close();
    }
}

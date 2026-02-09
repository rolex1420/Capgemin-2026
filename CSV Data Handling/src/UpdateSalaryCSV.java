import java.io.*;

public class UpdateSalaryCSV {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("updated_employees.csv"));

        bw.write(br.readLine() + "\n"); // header
        String line;

        while ((line = br.readLine()) != null) {
            String[] e = line.split(",");
            if (e[2].equalsIgnoreCase("IT")) {
                double salary = Double.parseDouble(e[3]);
                e[3] = String.valueOf(salary * 1.10);
            }
            bw.write(String.join(",", e) + "\n");
        }

        br.close();
        bw.close();
    }
}

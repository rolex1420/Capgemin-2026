import java.io.*;

public class SearchEmployeeCSV {
    public static void main(String[] args) throws Exception {
        String searchName = "Riya";
        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {
            String[] e = line.split(",");
            if (e[1].equalsIgnoreCase(searchName)) {
                System.out.println("Department: " + e[2]);
                System.out.println("Salary: " + e[3]);
            }
        }
        br.close();
    }
}

import java.io.*;

public class ValidateCSVData {
    public static void main(String[] args) throws Exception {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        String phoneRegex = "\\d{10}";

        BufferedReader br = new BufferedReader(new FileReader("users.csv"));
        br.readLine();
        String line;

        while ((line = br.readLine()) != null) {
            String[] u = line.split(",");
            if (!u[2].matches(emailRegex) || !u[3].matches(phoneRegex)) {
                System.out.println("Invalid row: " + line);
            }
        }
        br.close();
    }
}

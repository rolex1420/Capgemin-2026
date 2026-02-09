import java.io.*;

public class WriteCSV {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("employees.csv"));

        bw.write("ID,Name,Department,Salary\n");
        bw.write("1,Amit,IT,60000\n");
        bw.write("2,Riya,HR,50000\n");
        bw.write("3,John,IT,70000\n");
        bw.write("4,Sara,Finance,65000\n");
        bw.write("5,Tom,IT,80000\n");

        bw.close();
    }
}

import java.io.*;
import java.sql.*;

public class DBToCSV {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "password");

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM employee");

        BufferedWriter bw = new BufferedWriter(new FileWriter("report.csv"));
        bw.write("ID,Name,Department,Salary\n");

        while (rs.next()) {
            bw.write(rs.getInt(1) + "," + rs.getString(2) + "," +
                    rs.getString(3) + "," + rs.getDouble(4) + "\n");
        }

        bw.close();
        con.close();
    }
}

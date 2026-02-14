import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ValidateJson {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.readTree(new File("data.json"));
            System.out.println("Valid JSON");
        } catch (Exception e) {
            System.out.println("Invalid JSON");
        }
    }
}

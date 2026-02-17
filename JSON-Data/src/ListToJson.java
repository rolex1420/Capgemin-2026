public class ListToJson {
}

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

class User {
    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ListToJson {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        List<User> users = Arrays.asList(
                new User("A", 20),
                new User("B", 30)
        );

        String jsonArray = mapper.writeValueAsString(users);
        System.out.println(jsonArray);
    }
}

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.util.List;

public class SerializeDemo {

    public static void main(String[] args) throws IOException {
        Employee employee = new Employee(
                "E001",
                "Kasun",
                "Panadura",
                List.of("011-1234567", "033-1234567"),
                new Spouse("Ruwani", "011-1234567")
        );
        ObjectMapper mapper = new ObjectMapper();
        //mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(System.out, employee);
    }
}

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeserializeDemo {

    public static void main(String[] args) throws JsonProcessingException {
        String json = "{\"id\":\"E001\",\"name\":\"Kasun\",\"address\":\"Panadura\",\"contacts\":[\"011-1234567\",\"033-1234567\"],\"spouse\":{\"name\":\"Ruwani\",\"contact\":\"011-1234567\"}}";
        ObjectMapper mapper = new ObjectMapper();
        Employee employee = mapper.readValue(json, Employee.class);
        System.out.println(employee);
    }
}

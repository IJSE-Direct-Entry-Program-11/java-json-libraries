import com.google.gson.Gson;

public class DeserializeDemo {

    public static void main(String[] args) {
        String json = "{\"id\":1,\"name\":\"Kasun\",\"contacts\":[\"011-123\",\"044-123\"]}";
        Customer customer = new Gson().fromJson(json, Customer.class);
        System.out.println(customer);
    }
}

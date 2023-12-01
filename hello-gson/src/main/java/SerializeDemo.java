import com.google.gson.Gson;

import java.util.List;

public class SerializeDemo {

    public static void main(String[] args) {
        Customer customer = new Customer(1, "Kasun", List.of("011-123", "044-123"));
        System.out.println(new Gson().toJson(customer));
    }
}

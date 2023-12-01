import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String id;
    private String name;
    private String address;
    private List<String> contacts;
    private Spouse spouse;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Spouse{
    private String name;
    private String contact;
}

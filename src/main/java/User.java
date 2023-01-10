import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class User {
    public int id;
    public String firstName;
    public String lastName;
    public String userName;
    public String password;
    public Date dob;
    public String address;

}
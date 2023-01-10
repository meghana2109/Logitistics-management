import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CourierPartner {
    public int id;
    public String name;
    public String contactDetails;
    public String[] Zones;
    public double amountPerKg;
}

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Order {
    public int id;
    public Date dateOfOrder;
    public Date dateOfShipment;
    public boolean deliveryStatus;
    public double orderAmount;
    public double weightOfPackage;
    public User user;
    public CourierPartner courierPartner;
}

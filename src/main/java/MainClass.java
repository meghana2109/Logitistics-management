import java.util.Date;

public class MainClass {
    public static void main(String[] args) {
        User u1 = new User(01,"Meghana","M","meghana12","123meg123",new Date(1993,10,9),"HMS Hisar");
        User u2 = new User(02,"Pawan","Kumar","pawan123","pawan2910",new Date(1992,07,21),"HMS Hisar");

        CourierPartner c1 = new CourierPartner(01,"Professional Courier","998877665",new String[]{"South","Northwest","North"}, 168.90);

        Order o1 = new Order(01,new Date(2022,12,14), new Date(2023,01,10),false,340,2,u1,c1);
        Order o2 = new Order(01,new Date(2023,01,03),new Date(2023,01,23),false,510,3,u2,c1);

        System.out.println("Order Details : "+ o1.id);
        System.out.println("Order Date : "+o1.dateOfOrder);
        System.out.println("Shipment Date: "+o1.dateOfShipment);
        System.out.println("Amount : "+o1.orderAmount + " Rs");
        System.out.println("Weight of package : "+o1.weightOfPackage + " kg");
    }
}

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Apartment extends RealProperty{
    ArrayList<Person> tenants;
    private int rooms;

    public Apartment(String cadastralNumber, String address,
                     double price, Person owner, double area, int rooms, LocalDate dateOfPurchase) {
        super(cadastralNumber,address, price, owner, area,dateOfPurchase);
        this.tenants = new ArrayList<Person>();
        this.rooms = rooms;
    }

    public void getNewTenants(){
        int numberOfTenants = new Random().nextInt(0, 5);
        for (int i = 0; i < numberOfTenants; i++) {
            tenants.add(new Person("Tenant"));
        }
    }



    public int getRooms() {
        return rooms;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "number of tenants=" + tenants.size() +
                ", rooms=" + rooms +
                ", cadastralNumber='" + cadastralNumber + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", owner=" + owner +
                ", area=" + area +
                '}';
    }

    @Override
    public double getPropertyTax() {
        return price*0.01;
    }
}

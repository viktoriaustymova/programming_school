import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class House extends RealProperty{
    ArrayList<Person>tenants;
    private int floors;

    public House(String cadastralNumber, String address, double price,
                 Person owner, double area, int floors,LocalDate dateOfPurchase) {
        super(cadastralNumber,address, price, owner, area, dateOfPurchase);
        this.tenants = new ArrayList<Person>();
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void getNewTenants(){
        int numberOfTenants = new Random().nextInt(0, 10);
        for (int i = 0; i < numberOfTenants; i++) {
            tenants.add(new Person("Tenant"));
        }
    }


    @Override
    public String toString() {
        return "House{" +
                "number of tenants=" + tenants.size() +
                ", floors=" + floors +
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

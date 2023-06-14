import java.time.LocalDate;

public class Garage  extends RealProperty{
    private int carPlaces;

    public Garage(String cadastralNumber, String address, double price, Person owner,
                  double area, int carPlaces, LocalDate dateOfPurchase) {
        super(cadastralNumber,address,price, owner, area,dateOfPurchase);
        this.carPlaces = carPlaces;
    }

    public int getCarPlaces() {
        return carPlaces;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "carPlaces=" + carPlaces +
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

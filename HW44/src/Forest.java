import java.time.LocalDate;

public class Forest extends RealProperty {
    private boolean isProtectedZone;

    public Forest(String cadastralNumber, String address, double price, Person owner, double area,
                  boolean isProtectedZone, LocalDate dateOfPurchase) {
        super(cadastralNumber,address, price, owner, area,dateOfPurchase);
        this.isProtectedZone = isProtectedZone;
    }

    public boolean isProtectedZone() {
        return isProtectedZone;
    }

    @Override
    public String toString() {
        return "Forest{" +
                "isProtectedZone=" + isProtectedZone +
                ", cadastralNumber='" + getCadastralNumber() + '\'' +
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

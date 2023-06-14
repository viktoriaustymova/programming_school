import java.time.LocalDate;

public class Land  extends RealProperty{
    private String purpose;

    public Land(String cadastralNumber, String address, double price, Person owner,
                double area, String purpose, LocalDate dateOfPurchase) {
        super(cadastralNumber,address, price, owner, area,dateOfPurchase);
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }

    @Override
    public String toString() {
        return "Land{" +
                "purpose='" + purpose + '\'' +
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

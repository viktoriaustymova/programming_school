import java.time.LocalDate;

public abstract class RealProperty implements RealEstate{
    String cadastralNumber;
    String address;
    double price;
    Person owner;
    double area;
    LocalDate dateOfPurchase;


    public RealProperty(String cadastralNumber, String address, double price,
                        Person owner, double area,LocalDate dateOfPurchase) {
        this.cadastralNumber = cadastralNumber;
        this.price = price;
        this.owner = owner;
        this.area = area;
        this.address = address;
        this.dateOfPurchase = dateOfPurchase;

    }

    public String getCadastralNumber() {
        return cadastralNumber;
    }

    public double getPrice() {
        return price;
    }

    public Person getOwner() {
        return owner;
    }

    public double getArea() {
        return area;
    }
}

public class Car {
    String numberPlate;
    int gas;
    String brand;
    String owner;
    String telephone;

    Car(String numberPlate, int gas, String brand, String owner, String telephone) {
        this.numberPlate = numberPlate;
        this.gas = gas;
        this.brand = brand;
        this.owner = owner;
        this.telephone = telephone;
    }
    public String toString() {
        return numberPlate + " " + gas + " " + brand + " " + owner + " " + telephone;
    }

}

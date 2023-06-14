public class Car {
    String brand;
    int horsePowers;
    boolean isElectric;

    Car(String brand,int horsePowers,boolean isElectric){
        this.brand = brand;
        this.horsePowers = horsePowers;
        this.isElectric = isElectric;
    }

    public String toString(){
        return brand + " " + horsePowers + " " + isElectric;
    }

    public void drive(){
        if(isElectric){
            System.out.println("Zzzzz");
        } else {
            System.out.println("Brr-brr-brr");
        }
    }
}

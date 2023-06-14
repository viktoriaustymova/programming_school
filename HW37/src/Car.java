import java.util.LinkedList;

public class Car {
    public String brand;
    public int year;

    public double price;

    public static int counter=0;


    public Car(String brand, int year, double price) {
        this.brand = brand;
        this.year = year;
        int totalNumberOfCars = counter++;
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "Brand - " + brand  +
                ", year - " + year +
                ", price - " + price;
    }
    public static void printTotalNumberOfCars(){
        System.out.printf("Количество машин : %d \n", counter);
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }



    public static void endPrice(LinkedList<Car> cars){
        for (Car car: cars){
            if (car.getYear()<2010){
                car.price-=500;
            }
        }
    }
}

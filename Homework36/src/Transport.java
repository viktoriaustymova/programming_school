import java.util.ArrayList;
import java.util.List;

public class Transport {
    private String title;
    private int capacity;
    private ArrayList<Passenger> passengers = new ArrayList<>();
    private int speed;

    public Transport(String title, int capacity, int speed) {
        this.title = title;
        this.capacity = capacity;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "title='" + title + '\'' +
                ", capacity=" + capacity +
                ", speed=" + speed +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public int getSpeed() {
        return speed;
    }

    public void printPassengers(){
        System.out.println("Список пассажиров: ");
        for (Passenger passenger: passengers){
            System.out.println(passenger.getName());

        }

    }

    public void setPassengers(Passenger passenger) {
        if (passengers.size()<capacity ) {
           passengers.add(passenger);
            System.out.println("Пассажир: " + passenger.getName() + " добавлен на корабль " + getTitle());
        }
    }

    public void dropPassenger(String passengerName){
        for (Passenger passenger: passengers){
            if (passengerName.equalsIgnoreCase(passenger.getName())){
                passengers.remove(passenger.getName());
                System.out.println("Пассажир: " + passenger.getName() + " высажен из корабля " + getTitle());
            }
        }
    }
}

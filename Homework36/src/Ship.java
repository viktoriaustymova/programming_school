import java.util.List;

public class Ship extends Transport{
    private String captainName;

    public Ship(String title, int capacity, int speed,String captainName) {
        super(title, capacity, speed);
        this.captainName = captainName;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "captainName='" + captainName + '\'' +
                '}';
    }

    public String getCaptainName() {
        return captainName;
    }

    public void captainGreeting(){
        System.out.println("Капитан " + captainName +
                " приветствует вас на борту " + getTitle());
    }
}

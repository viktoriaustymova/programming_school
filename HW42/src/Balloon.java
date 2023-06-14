public class Balloon extends Transport {
    double height;
    double passedDistance;

    @Override
    public void takeOff() {
        height+=1500;
        System.out.println("Воздушный шар поднялся на высоту " + height + "м");
    }

    @Override
    public void land() {
        height = 0;
        passedDistance = 0;
        System.out.println("Воздушный шар приземлился");
    }

    @Override
    public void fly(double distance) {
        passedDistance += distance;
        System.out.println("Воздушный шар пролетел " + passedDistance + "км");
    }

    @Override
    public String toString() {
        return "Balloon{" +
                "height=" + height +
                ", distance=" + passedDistance +
                '}';
    }
}

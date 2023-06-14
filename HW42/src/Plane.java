public class Plane extends Transport{
   double height;
   double passedDistance;


    @Override
    public void takeOff() {
       height+=7500;
        System.out.println("Самолет поднялся на высоту " + height + "м");
    }

    @Override
    public void land() {
        height = 0;
        passedDistance = 0;
        System.out.println("Самолет приземлился");
    }

    @Override
    public void fly(double distance) {
        passedDistance += distance;
        System.out.println("Самолет пролетел" + passedDistance + "км");

    }

    @Override
    public String toString() {
        return "Plane{" +
                "height=" + height +
                ", distance=" + passedDistance +
                '}';
    }
}

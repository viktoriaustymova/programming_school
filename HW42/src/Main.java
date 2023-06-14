import java.util.ArrayList;
import java.util.List;

public class Main {
    /*Задание 1
    Создайте интерфейс летающее средство (подумайте, как его правильнее назвать), с методами:

    takeOff() - взлететь, оторваться от земли
    land() - приземлиться
    fly(double distance) - лететь
    Сделайте классы:

    Balloon - воздушный шар, пусть при взлете он отрывается от земли на 1500 метров.
    Plane - самолет, пусть при взлете он отрывается от земли на 7500 метров.
    Пусть у этих классов будет поля:
    высота
    пройденное расстояние в км

    Задание 2 * дополнительно
    Ваш код работает, его можно немного перестроить - сделать рефакторинг.
    Вынесите повторяющуюся в классах, общую информацию в отдельный абстрактный класс.*/
    public static void main(String[] args) {

        List<FlyingVehicle> flyingVehicleList = new ArrayList<>();
        flyingVehicleList.add(new Balloon());
        flyingVehicleList.add(new Plane());
        for (FlyingVehicle flyingVehicle: flyingVehicleList){
            flyingVehicle.takeOff();
            System.out.println(flyingVehicle);
        }

        for (FlyingVehicle flyingVehicle: flyingVehicleList){
            flyingVehicle.fly(100);
            System.out.println(flyingVehicle);
        }


        for (FlyingVehicle flyingVehicle: flyingVehicleList){
            flyingVehicle.land();
            System.out.println(flyingVehicle);
        }


    }
}
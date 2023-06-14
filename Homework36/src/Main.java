import java.util.ArrayList;
import java.util.List;

public class Main {

   /* Создайте класс Passenger с полями:

    name;
    Создайте базовый класс Transport c приватными полями:

    title
    capacity - вместимость транспортного средства
    List<Passenger> passengers = new ArrayList<>(); -
    speed - максимальная скорость работы
    Пусть в классе будет метод:

    printPassengers(), который выводит всех пассажиров в печать.
    pickPassenger(Passenger passenger) - метод добавляет пассажира на борт,
    если транспорт не заполнен (см. capacity).
    dropPassenger(String passengerName) - метод высаживает пассажира c указанным именем.
    Создайте производный от Transport класс Ship (корабль) с полями:

    captainName - имя капитана.
    И методом:

    captainGreeting() - метод выводит в консоль фразу "Капитан <имя капитана>
    приветствует вас на борту <название транспортного средства>"*/
    public static void main(String[] args) {

        Passenger passenger1 = new Passenger("Alex");
        Passenger passenger2 = new Passenger("Max");
        Passenger passenger3 = new Passenger("Jack");
        Passenger passenger4 = new Passenger("Maria");
        Passenger passenger5 = new Passenger("Julia");

        List<Passenger> passengers = new ArrayList<>();


        Ship ship1 = new Ship("Star",7, 50,"John");
        ship1.captainGreeting();
        ship1.setPassengers(passenger1);
        ship1.setPassengers(passenger2);
        ship1.setPassengers(passenger3);
        ship1.setPassengers(passenger4);
        ship1.setPassengers(passenger5);


        ship1.printPassengers();

        ship1.dropPassenger("Julia");















    }

}
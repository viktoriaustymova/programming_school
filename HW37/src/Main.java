import java.util.LinkedList;
import java.util.List;

public class Main {
 /*   Создайте класс автомобиль с полями:

    бренд,
    год.
    И статическими полями:

    всего выпущено машин - totalNumberOfCars;
    цена;
    Сделайте так, чтобы автоматически осуществлялся подсчет созданных машин(объектов).

    (подсказка: это нужно сделать в конструкторе) Создайте несколько машин, выведите totalNumberOfCars в печать.

    Дополнительно * , придумайте методы, которые бы каким-нибудь образом взаимодействовали бы с ценой.*/

    public static void main(String[] args) {

        Car car1 = new Car("BMW",2008,7000);
        Car car2 = new Car("Audi",2015,10000);
        Car car3 = new Car("Seat",2007,6000);

        LinkedList<Car> cars = new LinkedList<>(List.of(car1,car2,car3));

        Car.printTotalNumberOfCars();

        Car.endPrice(cars); //скидка 500 на машины, которые были выпущены до 2010 года
        System.out.println(cars);




    }




}
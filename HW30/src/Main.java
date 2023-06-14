import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        //Задание 1
        //Представим, что мы создаем программу для автосервиса.
        //
        //Создайте класс Car с полями:
        //
        //String numberPlate; - это автомобильный номер например "d812ce"
        //int gas; - это бензин, например: 98
        //brand; - это марка машины
        //String owner; - имя владельца
        //String telephone; - номер телефона владельца
        //Создайте в main словарь HashMap<String, Car>
        //
        //Тип ключа string - это номер знака "d812ce".
        //Тип значения - это Car.
        //Заполните словарь парами ключ-значение
        //
        //Создайте в классе Main метод public static void printCarInfo(HashMap<String, Car> carsMap)
        //
        //Метод должен спрашивать у клиента номер автомобиля
        //Метод должен выводить в консоль информации про этот автомобиль в следующем виде:
        // Машина марки <brand> с собственником <owner> с телефоном <telephone>, бензин: <gas>
        //Вызовите метод


        HashMap<String, Car> carsMap = new HashMap<>();
        carsMap.put("d812ce",new Car("d812ce",95,"Audi","Alex","01753434"));
        carsMap.put("a123ct",new Car("a123ct",98,"BMW","Max","0176565347"));
        carsMap.put("c475re",new Car("c475re",92,"Volkswagen","Sven","0172756436"));
        printCarInfo(carsMap);

    }
    public static void printCarInfo(HashMap<String,Car> carsMap) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите номер автомобиля");
        String numberPlate = reader.readLine();
        Car car = carsMap.get(numberPlate);
        System.out.println("Машина марки " + car.brand + " с собственником " +
                car.owner + " с телефоном " + car.telephone + " бензин: " + car.gas);
    }
}
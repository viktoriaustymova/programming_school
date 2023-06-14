import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //В ходе разговора с заказчиком было выяснено,
    // что он хочет построить модель города для своей компании по кадастровым расчетам,
    // связанным с землепользованием.
    // Заказчик сказал, что существуют всего несколько типов недвижимости (RealProperty):
    //
    //земельный участок (Land),
    //лесной массив(Forest),
    //дом(House),
    //квартира(Apartment),
    //гараж(Garage) и т.д.
    //Любой из этих объектов имеет атрибуты:
    //
    //кадастровый номер (cadastralNumber),
    //стоимость(double price),
    //собственника(Person owner)
    //площадь (double area).
    //Земля имеет такой атрибут как назначение (String purpose):
    //
    //земли сельскохозяйственного назначения;
    //земли населенных пунктов;
    //земли промышленности;
    //Лесной массив обладает свойством: -boolean isProtectedZone - является природоохранной зоной или нет.
    //
    //House - обладает полями:
    //
    //ArrayList - жильцы,
    //количество этажей
    //Квартира - обладает полями:
    //
    //ArrayList - жильцы,
    //количество комнат.
    //Гараж обладает полями:
    //
    //количество машиномест.
    //Релиз 1
    //Подумайте о том как сделать модель для данных объектов, понадобятся ли вам абстрактные классы или интерфейсы? Сделайте модель из классов, пропишите отношения наследования. Можете сделать это на бумаге или в графическом редакторе.
    //
    //Релиз 2
    //Нужно создать метод, который бы рассчитывал налог на имущество. В общем случае налог на имущество рассчитывается в размере 0.1 % рыночной стоимости. (меньше одного процента). Вы можете уточнить налог, в зависимости от класса, используя Override.
    //
    //Релиз 3
    //Создайте массив объектов - и отсортируйте его:
    //
    //сначала по общей стоимости
    //по сумме налога
    //по площади
    //по адресу (в алфавитном порядка)
    // Дополнительно можете вынести сортировки в отдельные методы, например, getSortedByPriceList(ArrayList) ...
    //Релиз 4
    //Подойдите творчески к заданию. Добавьте функционал на ваше усмотрение.


    public static void main(String[] args) {

        Apartment apartment = new Apartment("23gz5","Berliner Strasse 5",
                35000,new Person("Alex"),75,2, LocalDate.of(2019,4,2));
        Forest forest = new Forest("32zt5","Hochdorf",
                18000,new Person("John"),18,false,LocalDate.of(2021,12,8));
        Garage garage = new Garage("5565f","Blumenstrasse 7",5000,
                new Person("Max"),12,1,LocalDate.of(2015,2,15));
        House house = new House("fgf46","Prager Strasse 23",
                120000,new Person("Nick"),90,2,LocalDate.of(2020,3,22));
        Land land = new Land("543sl","Luckendorf",300000,new Person("Devid"),
                150,"agricultural land",LocalDate.of(2023,1,2));

        ArrayList<RealProperty> properties = new ArrayList<>();
        properties.add(apartment);
        properties.add(house);
        properties.add(forest);
        properties.add(land);
        properties.add(garage);

        System.out.println(properties);

        chooseAndSort(properties);

    }

    public static void getSortedByPriceList(ArrayList<RealProperty> properties){
        properties.sort(new ComparatorByPrice());
    }

    public static void getSortedByPropertyTax(ArrayList<RealProperty> properties){
        properties.sort(new ComparatorByTax());
    }
    public static void getSortedByArea(ArrayList<RealProperty> properties){
        properties.sort(new ComparatorByArea());
    }

    public static void getSortedByAddress(ArrayList<RealProperty> properties){
        properties.sort(new ComparatorByAddress());
    }

    public static void getSortedByDate(ArrayList<RealProperty> properties){
        properties.sort(new ComparatorByDate());
    }

    public static void chooseAndSort(ArrayList<RealProperty> properties){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как отсортировать?");
        System.out.println("\n 1 - по общей стоимости "+
                "\n 2 - по сумме налога" +
                "\n 3 - по площади " +
                "\n 4 - по адресу" +
                "\n 5 - по дате приобретения");
        int answer = scanner.nextInt();
        switch (answer) {
            case  1 : getSortedByPriceList(properties);
                System.out.println("Список недвижимости после сортировки по общей стоимости : " + properties);
                break;
            case  2 :getSortedByPropertyTax(properties);
                System.out.println("Список недвижимости после сортировки по сумме налога : " + properties);
                break;
            case 3 : getSortedByArea(properties);
                System.out.println("Список недвижимости после сортировки по  площади : " + properties);
                break;
            case 4 :getSortedByAddress(properties);
                System.out.println("Список недвижимости после сортировки по адресу : " + properties);
                break;
            case 5 : getSortedByDate(properties);
                System.out.println("Список недвижимости после сортировки по дате приобретения : " + properties);
                break;
            default : System.out.println("Нет такого варианта сортировки");
        }

    }
}
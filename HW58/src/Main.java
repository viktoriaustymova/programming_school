import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    //Задание 1 Varargs *
    //Создайте класс скрипка. Пусть у скрипки будут поля:
    //
    //String имя мастера,
    //LocalDate дата производства
    //Создайте в Майне метод,
    // который должен принимать произвольное число скрипок
    // и возвращать имя мастера самой старой скрипки
    // из переданных. То есть метод должен быть статическим и возвращать String.
    public static void main(String[] args) {

        Violin violin1 = new Violin("Master1", LocalDate.of(1960,4,19));
        Violin violin2 = new Violin("Master2", LocalDate.of(1987, 2,1));
        Violin violin3 = new Violin("Master3", LocalDate.of(1900, 5,11));
        Violin violin4 = new Violin("Master4", LocalDate.of(2000, 3,21));

        System.out.println(getMastersNameOfTheOldestViolin(violin1,violin2,violin3,violin4));

    }
    public static String getMastersNameOfTheOldestViolin(Violin...violins){
        List<Violin> violins1 = new ArrayList<>(List.of(violins));
        violins1.sort(new ComparatorByDate());
        return violins1.get(0).nameOfMaster;
    }

}
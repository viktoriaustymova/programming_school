import java.time.Month;

public class Main {

    /*Задание 1
    Реализуйте enum Month с перечислением всех месяцев.
    Реализуйте enum Season с названием сезонов (WINTER, SPRING, SUMMER, AUTUMN)
    Напишите метод, который принимает Month, а соответствующий возвращает Season

    Задание 2
    Добавьте в enum Month поле, с названием месяца по-русски, и поле номер месяца.
    Сделайте соответствующий конструктор.
    Реализуйте метод, который распечатает все месяцы строками вида „Месяц 1 – январь”, „Месяц 2 – февраль” ……


    */

    public static void main(String[] args) {
        System.out.println(seasonForMonth(Months.APRIL));
        System.out.println(seasonForMonth(Months.JANUARY));
        System.out.println(seasonForMonth(Months.AUGUST));
        System.out.println(seasonForMonth(Months.SEPTEMBER));

        printAllMonths();

    }

    public static Seasons seasonForMonth(Months month) {
        switch (month){
            case DECEMBER, JANUARY, FEBRUARY:
                return Seasons.WINTER;
            case MARCH, APRIL, MAY:
                return Seasons.SPRING;
            case JUNE, JULY, AUGUST:
                return Seasons.SUMMER;
        }
        return Seasons.AUTUMN;
    }

    public static void printAllMonths(){
        Months[] allMonths = Months.values();
        for (Months months: allMonths){
            System.out.println(months.toString());
        }
    }
}
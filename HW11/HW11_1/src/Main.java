import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Пользователь вводит с клавиатуры месяц (строкой), ваша программа должна выводить строку вида:
        //"название_месяца это сезон"
        //Например, если пользователь ввел февраль, то
        //"февраль это зима"
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название месяца");
        String month = scanner.next();
        String winter = "зима";
        String spring = "весна";
        String summer = "лето";
        String autumn = "осень";

        switch (month.toLowerCase()) {
            case "январь":
                System.out.printf("%s это %s", month,winter); break;
            case "февраль":
                System.out.printf("%s это %s", month,winter); break;
            case "март":
                System.out.printf("%s это %s", month,spring); break;
            case "апрель":
                System.out.printf("%s это %s", month,spring); break;
            case "май":
                System.out.printf("%s это %s", month,spring); break;
            case "июнь":
                System.out.printf("%s это %s", month,summer); break;
            case "июль":
                System.out.printf("%s это %s", month,summer); break;
            case "август":
                System.out.printf("%s это %s", month,summer); break;
            case "сентябрь":
                System.out.printf("%s это %s", month,autumn); break;
            case "октябрь":
                System.out.printf("%s это %s", month,autumn); break;
            case "ноябрь":
                System.out.printf("%s это %s", month,autumn); break;
            case "декабрь":
                System.out.printf("%s это %s", month,winter); break;

        }
    }
}
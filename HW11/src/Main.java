import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Пользователь вводит с клавиатуры номер месяца (числом), ваша программа должна выводить строку вида:
        //"Месяц № __ это название_месяца"
        //Например, если пользователь ввел 2, то
        //"Месяц №2 это февраль"
        //Для вывода строки используйте printf
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();
        char number = '№';
        switch (month) {
            case 1:
                System.out.printf("Месяц %c %d это январь", number, month); break;
            case 2:
                System.out.printf("Месяц %c %d это февраль", number, month); break;
            case 3:
                System.out.printf("Месяц %c %d это март", number, month); break;
            case 4:
                System.out.printf("Месяц %c %d это апрель", number, month); break;
            case 5:
                System.out.printf("Месяц %c %d это май", number, month); break;
            case 6:
                System.out.printf("Месяц %c %d это июнь", number, month); break;
            case 7:
                System.out.printf("Месяц %c %d это июль", number, month); break;
            case 8:
                System.out.printf("Месяц %c %d это август", number, month); break;
            case 9:
                System.out.printf("Месяц %c %d это сентябрь", number, month); break;
            case 10:
                System.out.printf("Месяц %c %d это октябрь", number, month); break;
            case 11:
                System.out.printf("Месяц %c %d это ноябрь", number, month); break;
            case 12:
                System.out.printf("Месяц %c %d это декабрь", number, month); break;
            default:
                System.out.println("Число введено неверно");
        }

    }
}
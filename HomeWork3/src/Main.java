import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Имя: ");
        String name = scanner.nextLine();

        System.out.println("Возраст: ");
        int age = scanner.nextInt();

        System.out.println("Город: ");
        scanner.nextLine();
        String city = scanner.nextLine();
        String space= " ";

        System.out.println(name + space + "(" +  "г." + city + ")" + "," + space+ "Возраст:" + space + age);

        //Решение 1 задания заняло 27 минут

        int year = 2023;
        int birth = 1998;
        int now = year-age;
        System.out.println("Сейчас" + space + year + space + "год." + space + "Год рождения:" + space + now);
        System.out.println("Верно?");


        //Решение 2 задания заняло 8 минут

    }
}
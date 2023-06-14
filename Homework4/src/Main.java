import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Ваше полное имя: ");
        String name = scanner.nextLine();

        System.out.println("Введите Ваш вес: ");
        double weight = scanner.nextDouble();

        System.out.println("Введите Ваш возраст: ");
        int age = scanner.nextInt();

        System.out.println("Введите Ваш пол: ");
        scanner.nextLine();
        String gender = scanner.nextLine();

        System.out.println("Количество детей: ");
        int children = scanner.nextInt();

        System.out.println("Введите Ваш месячный доход: ");
        int monthlyIncome = scanner.nextInt();

        int annualIncome = monthlyIncome*12;

        String space= " ";

        System.out.println(name + "," + space + "Вес: " + weight + "." + space + "Возраст: " + age
                + space+ "лет." + space+ "Пол: " + gender + "." + space +
                "Количество детей: " + children + "." + space + "Годовой доход: " + annualIncome + space +"евро");

    }
}
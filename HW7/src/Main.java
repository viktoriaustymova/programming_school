import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Задание 1

        Пусть пользователь введет свою температуру: например, 38.8.
        Если температура больше 39, выведите в консоль фразу: «Нужно срочно обратиться к врачу».
        Если температура меньше, то выведите фразу: «Лечитесь дома» */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру: ");
        double temperature = scanner.nextDouble();
        if (temperature > 39) {
            System.out.println("Нужно срочно обратиться к врачу");
        } else {
            System.out.println("Лечитесь дома");
        }

        /*Пользователь вводит слово, если слово не начинается на букву ‘Q’, выведите в консоль фразу:
        «А я уже начал бояться”, в противном случае - «Не повезло».
        Сохраните результат проверки условия в переменную типа boolean и выведите ее в консоль. */

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = scanner2.nextLine();
        char first = word.charAt(0);
        boolean b1 = first != 'Q';
        if (b1) {
            System.out.println("А я уже начал бояться");
        } else {
            System.out.println("Не повезло");
        }
    }
}
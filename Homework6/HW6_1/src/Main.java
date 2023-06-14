import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Напишите программу, которая просит пользователя ввести слово, после чего выводит на экран,
        первые три символа введенного слова, а оставшуюся часть слова в строку. */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word1 = scanner.nextLine();
        System.out.println(word1.charAt(0));
        System.out.println(word1.charAt(1));
        System.out.println(word1.charAt(2));
        System.out.println(word1.substring(3));

    }
}
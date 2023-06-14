import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Задача аналогичная предыдущей, но сначала выводится часть строки без последних 3х символов,
        а потом выводятся последние три символа строки в столбик. Например, ввели слово "Программирование";*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word2 = scanner.nextLine();
        int length = word2.length();
        System.out.println(word2.substring(0,length-3));
        System.out.println(word2.charAt(length-3));
        System.out.println(word2.charAt(length-2));
        System.out.println(word2.charAt(length-1));
    }
}
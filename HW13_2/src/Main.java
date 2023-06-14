import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задача 3
        //Напишите метод, который получает две строки
        // и возвращает длину строки (т.е. int), которая длиннее.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String firstStr = scanner.nextLine();
        System.out.println("Введите вторую строку");
        String secondStr = scanner.nextLine();
        int lengthOfFirst = firstStr.length();
        int lengthOfSecond = secondStr.length();
        int result = lengthOfStrings(lengthOfFirst,lengthOfSecond);
        System.out.println("Длина самой длинной строки составляет " + result + " символов");


    }
    public static int lengthOfStrings(int lengthOfFirst, int lengthOfSecond ) {
        return (lengthOfFirst>lengthOfSecond)?lengthOfFirst:lengthOfSecond;

    }
}
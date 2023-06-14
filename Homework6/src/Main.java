import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Слово: "Программирование"
        //Количество букв: 15
        //Начинается на: П
        //Заканчивается на е
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = scanner.nextLine();
        System.out.println("Слово: \""+ word +"\"");
        int length = word.length();
        System.out.println("Количество букв: " + length);
        System.out.println("Начинается на: " + word.charAt(0));
        System.out.println("Заканчивается на: " + word.charAt(length-1));

    }
}
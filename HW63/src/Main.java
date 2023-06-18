import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Подготовка к заданию
        //Дана строка "Apple is my favourite of 10 others fruits".

        String text = "Apple is my favourite of 10 others fruits";

        //Задание 1
        //Замените любое первое слово на Orange.

        String text1 = text.replaceAll("^Apple","Orange");
        System.out.println(text1);

        //Задание 2
        //Замените любое последнее слово на "vegetables".
        String text2 = text.replaceAll("fruits$","vegetables");
        System.out.println(text2);

        //Задание 3
        //Замените цифры на слово many
        String text3 = text.replaceAll("\\d\\d", "many");
        System.out.println(text3);

        //Задание 4
        //Замените все слова из двух букв на "@@"
        String text4 = text.replaceAll("\\b[A-Za-z]{2}\\b","@@");
        System.out.println(text4);

        //Задание 5
        //Пользователь вводит текст в консоль.
        // Проверьте правильный ли текст он вводит.
        // Текст должен быть такой: несколько латинских букв,
        // потом несколько цифр, потом несколько латинских букв и заканчивается на !
        //
        //Дополнительно выведите в консоль цифры из тех, что он ввел.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text");
        String text5 = scanner.nextLine();
        boolean result = text5.matches("[A-Za-z] + [0-9] + [A-Za-z]+!");
        System.out.println(result);
        String text6 = text5.replaceAll("[A-Za-z+!]","");
        System.out.println(text6);














    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Напишите программу, которая просит пользователя ввести строку, после чего выводит на экран, введенную строку,
        в две строчки (причем строчки должны быть равны, или вторая строчка может быть короче на 1 символ).
         Например, ввели "Java современный язык программирования" */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку : ");
        String word = scanner.nextLine();
        int length = word.length();
        int mid = length/2 + length % 2;

        System.out.println(word.substring(0,mid));
        System.out.println(word.substring(mid));

        /*System.out.println(word.substring(0,(length/2)));
        System.out.println(word.substring(length/2));

        int Length1 = (word.length()+1)/2;
        System.out.println(word.substring(0,Length1));
        System.out.println(word.substring(Length1)); */



    }
}
import java.util.HashSet;
import java.util.Scanner;

public class Main {
//    Задача 1
//    Написать программу, которая:
//
//    прочитает с клавиатуры(получит от пользователя) количество чисел
//    прочитает с клавиатуры сами числа и соберёт их в множество
//    удалит из множества числа, которые больше чем 10
//    выведет полученные результаты на экран
//    Все числа, которые подаются на вход, целые.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int numberOfNumbers = Integer.parseInt(scanner.nextLine());
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i < numberOfNumbers;i++){
            System.out.println("Введите число " + (i+1));
            numbers.add(Integer.parseInt(scanner.nextLine()));
        }
        System.out.println(numbers);



        for (int i: numbers) {
            if (i >10){
                numbers.remove(i);
            }
        }
        System.out.println(numbers);

    }


}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        //Напишитте метод, который получает три целых числа и возвращает true,
        // первое и второе число в сумме дают третье числу, иначе false.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int number2 = scanner.nextInt();
        System.out.println("Введите третье число");
        int number3 = scanner.nextInt();
        boolean result = getMaxNumber( number1, number2,number3);
        System.out.println(result);
    }
    public static boolean getMaxNumber(int number1, int number2, int number3) {

        return (number3==(number1+number2))?true:false;
    }
}
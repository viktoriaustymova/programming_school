import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задача 2
        //Напишитте метод, который получает три целых числа и возвращает true,
        //если среди этих чисел есть такое, которое равно сумме двух оставшихся чисел.
        //Например:
        //(12,15,7) -> false;
        //(8,15,7) -> true;
        //Подсказка: используйте метод, написанный в задаче 1.
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
    public static boolean getMaxNumber(int number1,int number2,int number3) {
        boolean a = (number1+number2)==number3;
        boolean b = (number1+number3)==number2;
        boolean c = (number2+number3)==number1;
        return (a || b || c)?true:false;
    }
}
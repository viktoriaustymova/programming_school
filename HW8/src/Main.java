import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Задание 1
Есть прибор у которого есть 2 колбы. В программе дано две переменных,
которые содержат температуру каждой колбы
(значение для этих переменных можно задать со Scanner, можно просто присвоить значение в программе).
Считается, что прибор работает корректно если разница температуры между кобами не более 10 градусов
и в одной из колб (в любой из двух) температура
больше 70 градусов.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру первой колбы: ");
        int flask1 = scanner.nextInt();
        System.out.println("Введите температуру второй колбы: ");
        int flask2 = scanner.nextInt();

        boolean temperature1 = (flask1-flask2) <=10;
        boolean temperature2 = (flask2-flask1) <=10;
        boolean temperature = temperature1 | temperature2;
        boolean temperature3 = flask1 > 70;
        boolean temperature4 = flask2 > 70;
        boolean temperature5 = temperature3 | temperature4;

        boolean isDeviceWorkCorrect = (temperature & temperature5);
        if(isDeviceWorkCorrect){
            System.out.println("Прибор работает корректно");
        } else {
            System.out.println("Прибор работает не корректно");
        }

    }
}
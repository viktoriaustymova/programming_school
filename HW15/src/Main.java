public class Main {
    public static void main(String[] args) {
        //Задание 1
        //Напишите метод, который возвращает сумму чисел от - 100 до -200.
        // Метод не принимает никаких параметров. И ничего не выводит в печать.
    }
    public static int sumOfNumbers() {
        int sum  = 0;
        for (int i = -100; i >= -200; i--) {
            sum += i;
        }
        return sum;
    }
}
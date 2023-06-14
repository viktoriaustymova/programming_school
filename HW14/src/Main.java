public class Main {
    public static void main(String[] args) {
        //Задание 1
        //Напишите метод. Каждый раз когда мы его вызываем
        // - он печатает числа 7 14 21 28 35 ... 98.
        // Метод ничего не принимает.
        numbersPlusSeven();

    }
    public static void numbersPlusSeven() {
        int i = 7;
        while (i<99) {
            System.out.println(i);
            i +=7;
        }
    }




}
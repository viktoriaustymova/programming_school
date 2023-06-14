import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        // Создайте метод, который ничего не принимает в качестве параметров,
        // выводит в консоль: "Кажется я начинаю понимать".
        //
        //Назовите этот метод understand. Вызовите метод внутри main.
        understand();

        //Задача 2
        //Создайте метод c именем powOfThree, метод принимает int, возвращает int.
        // Пусть метод возводит число в третью степень. Вызовите метод в main.

        int result = powOfThree(5);
        System.out.println(result);


        //Задача 3
        //Создайте метод, который принимает в качестве параметра String - возвращает новый String.
        //Пусть метод переводит первые три символа в upper case (верхний регистр),
        // а все остальные символы в lower case (нижний регистр). Назовите метод firstToUpper.

        System.out.println(firstToUpper("Аквариум"));

    }
    public static void understand() {
        System.out.println("Кажется я начинаю понимать");
    }
    public static int powOfThree(int number) {
        return (int) Math.round(Math.pow(number,3));

    }
    public static String firstToUpper(String word) {
        String toUpper = word.substring(0,3);
        String toLower = word.substring(3);
        return toUpper.toUpperCase() + toLower.toLowerCase();
    }

}
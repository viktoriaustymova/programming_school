import java.util.ArrayList;

public class Main {
    //Задание 2
    //Создайте ArrayList стрингов.
    //Добавьте туда произвольное число слов на ваше усмотрение.
    //Используя цикл, объедините все элементы в одну большую строку String (используйте для этого промежуточную переменную "аккумулятор") и выведите получившийся результат в консоль.
    //Например, для ["Apple", "Orange", "Grape"] должна получится строка "AppleOrangeGrape".
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Lime");
        fruits.add("Lemon");

        String accumulator = "";
        for (int i = 0; i< fruits.size();i++) {
            accumulator += fruits.get(i);
        }
        System.out.println(accumulator);

    }
}
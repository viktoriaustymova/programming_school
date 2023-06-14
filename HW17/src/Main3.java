public class Main3 {
    public static void main(String[] args) {
        //Задание 3 *
        //Создайте массив чисел от 1 до 97.
        // После создания выведите все элементы массива в консоль.

        int[] numbers;
        numbers = new int[98];
        for (int i = 1;i<numbers.length;i++) {
            numbers[i] = i;
            System.out.println(numbers[i]);
        }
    }
}

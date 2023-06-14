public class Main2 {

    /*
    3
    Напишите метод, который принимает массив целых чисел и возвращает сумму всех элементов
    {5,9,1} -> 15
     */
    public static void main(String[] args) {
        int[] numbers = {5,9,1};
        System.out.println(sum(numbers));;
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i< numbers.length;i++) {
            sum +=numbers[i];
        }
        return sum;
    }
}

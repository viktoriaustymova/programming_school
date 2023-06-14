public class Main3 {
    /*
    Напишите метод , который считает сумму всех элементов из массива целых чисел,
    которые делятся и на 3 и на 5
    {15,9,1,30,5} -> 45 т.е. 15+30
     */
    public static void main(String[] args) {
        int[] numbers = {15,9,1,30,5};
        System.out.println(sum(numbers));
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i =0; i< numbers.length; i++) {
            if (numbers[i]%3==0 && numbers[i]%5==0 ) {
                sum += numbers[i];
            }
        }
        return sum;
    }
}

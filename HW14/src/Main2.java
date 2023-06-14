public class Main2 {
    public static void main(String[] args) {
        //Задание 2
        //Выведите в консоль такую
        // последовательность чисел 1 2 4 8 16 32 64 128 256 512.

        int a = 1;
        while (a<513) {
            System.out.println(a);
            a *= 2;
        }

        int j=0;
        while (j<=9) {
            System.out.println((int) Math.pow(2,j));
            j++;
        }
    }
}

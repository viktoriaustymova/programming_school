import java.util.Scanner;

public class Main {

   /*
    1
    Напишите метод, который создает массив размера
    n элементов и заполняет его целыми числами по порядку, начиная с заданного числа start
    Например, при n=4 и start = 5 метод должен вернуть массив {5,6,7,8}
    Напишите метод, который умножает каждый элемент этого массива на 2.
    Напишите метод вывода массива на экран
    Ваша программа должна запрашивать у пользователя размер массива и начальное число,
    выводить на экран исходный массив, затем выводить на экран массив с умноженными на 2 элементами
    2
    В коде первой задачи допишите еще 2 метода:
    первый, который печатает массив, начиная с последнего элемента к первому
    второй, который печатает только четные элементы массива
     */

    public static void main(String[] args) {
        int[] array = createArray();
        System.out.print("Исходный массив: ");
        printArray(array);
        //System.out.println(" ");
        System.out.print("Массив с умноженными на 2 элементами: ");
        multiplyArray(array);
        printArray(array);
        System.out.print("Массив в обратном порядке: ");
        reversePrintArray(array);
        System.out.print("Четные элементы массива: ");
        printEvenElements(array);

    }



    public static  int[] createArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введите начальное число: ");
        int start = scanner2.nextInt();

        for (int i =0;i < array.length; i++){
            array[i] = start;
            start +=1;
        }
        return array;

    }
    public static int[] multiplyArray(int[] array){
        for (int i=0;i<array.length;i++){
            array[i] *=2;
        }
        return array;
    }



    public static void printArray(int[] array) {
        for (int i=0;i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void reversePrintArray(int[] array) {
        for (int i=array.length-1; i>=0; i--) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void printEvenElements(int[] array) {
        for (int i =0;i< array.length;i++) {
            if (array[i] %2==0) {
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();
    }

}
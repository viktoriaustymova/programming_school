import java.util.HashSet;
import java.util.Scanner;

public class Main3 {
    //Задача 3*
    //Даны два списка целых чисел.
    // Посчитайте, сколько чисел содержится одновременно как в первом списке, так и во втором.
    //
    //Для каждого списка программе на вход подаётся сначала количество чисел,
    // а затем и сами числа, каждое в новой строке.
    //
    //Используйте множества.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> list1 = new HashSet<>();
        System.out.println("Введите количество чисел для первого списка: ");
        int numberOfNumbersInList1 =Integer.parseInt(scanner.nextLine());
        for (int i = 0;i<numberOfNumbersInList1;i++){
            System.out.println("Введите число " + (i+1));
            list1.add(Integer.parseInt(scanner.nextLine()));
        }
        System.out.println(list1);


        HashSet<Integer> list2 = new HashSet<>();
        System.out.println("Введите количество чисел для второго списка: ");
        int numberOfNumbersInList2 =Integer.parseInt(scanner.nextLine());
        for (int i = 0;i<numberOfNumbersInList2;i++){
            System.out.println("Введите число " + (i+1));
            list2.add(Integer.parseInt(scanner.nextLine()));
        }
        System.out.println("Первый список: " + list1);
        System.out.println("Второй список: " + list2);

        HashSet<Integer> listOfCommonNumbers = new HashSet<>(list1);
        listOfCommonNumbers.retainAll(list2);

        System.out.println("Список общих чисел: " + listOfCommonNumbers);
        System.out.println("Количество чисел, которое содержится" +
                        " одновременно как в первом списке," +
                " так и во втором: " + getNumberOfCommonNumbers(listOfCommonNumbers));

    }
    public static int getNumberOfCommonNumbers(HashSet<Integer> listOfCommonNumbers ){
        return listOfCommonNumbers.size();
    }
}

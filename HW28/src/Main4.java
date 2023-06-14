import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main4 {
    //Аня и Боря любят играть в разноцветные кубики,
    // причем у каждого из них свой набор и в каждом наборе все кубики различны по цвету.
    // Однажды дети заинтересовались, сколько существуют цветов таких, что кубики каждого цвета присутствуют
    // в обоих наборах. Для этого они занумеровали все цвета случайными числами от 0 до 108.
    // На этом их энтузиазм иссяк, поэтому вам предлагается помочь им в оставшейся части.
    //

    //В первой строке входных данных записаны числа N и M — число кубиков
    // у Ани и Бори. В следующих N строках заданы номера цветов кубиков Ани.
    // В последних M строках номера цветов Бори.
    //
    //Найдите три множества: номера цветов кубиков,
    // которые есть в обоих наборах; номера цветов кубиков, которые есть
    // только у Ани и номера цветов кубиков, которые есть только у Бори.
    // Для каждого из множеств выведите сначала количество элементов в нем, а затем сами элементы,
    // отсортированные по возрастанию.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> cubesOfAnia = new HashSet<>();
        System.out.println("Введите количество кубиков Ани: ");

        int numberOfCubesOfAnia =Integer.parseInt(scanner.nextLine());

        HashSet<Integer> cubesOfBoria = new HashSet<>();
        System.out.println("Введите количество кубиков Бори: ");
        int numberOfCubesOfBoria =Integer.parseInt(scanner.nextLine());

        for (int i = 0;i<numberOfCubesOfAnia;i++){
            System.out.println("Введите номер цвета кубика Ани " + (i+1));
            cubesOfAnia.add(Integer.parseInt(scanner.nextLine()));
        }
        //System.out.println(cubesOfAnia);

        for (int i = 0;i<numberOfCubesOfBoria;i++){
            System.out.println("Введите номер цвета кубика Бори " + (i+1));
            cubesOfBoria.add(Integer.parseInt(scanner.nextLine()));
        }
        //System.out.println(cubesOfBoria);

        TreeSet<Integer> listOfCommonNumbers = new TreeSet<>(cubesOfAnia);
        listOfCommonNumbers.retainAll(cubesOfBoria);
        System.out.println("Количество общих кубиков: " + getNumberOfCubes(listOfCommonNumbers));
        System.out.println("Hомера цветов кубиков,которые есть в обоих наборах" + listOfCommonNumbers);

        TreeSet<Integer> listOfNumbersOfAnia = new TreeSet<>(cubesOfAnia);
        listOfNumbersOfAnia.removeAll(cubesOfBoria);
        System.out.println("Количество кубиков у Ани: " + getNumberOfCubes(listOfNumbersOfAnia));
        System.out.println("Номера цветов кубиков, которые есть только у Ани" + listOfNumbersOfAnia);

        TreeSet<Integer> listOfNumbersOfBoria = new TreeSet<>(cubesOfBoria);
        listOfNumbersOfBoria.removeAll(cubesOfAnia);
        System.out.println("Количество кубиков у Бори : " + getNumberOfCubes(listOfNumbersOfBoria));
        System.out.println("Номера цветов кубиков, которые есть только у Бори" + listOfNumbersOfBoria);

    }
    public static int getNumberOfCubes(TreeSet<Integer> set){
        return set.size();
    }
}

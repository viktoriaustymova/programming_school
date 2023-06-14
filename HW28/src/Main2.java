import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main2 {

    //Задача 2
    //Создайте метод, который принимает ArrayList<int>,
    // возвращает новый ArrayList<int>, в котором хранятся уникальные значения.

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(List.of(3,5,7,9,3,5));
        System.out.println(numbers);

        System.out.println(getUniqueValue(numbers));
    }
    public static ArrayList<Integer> getUniqueValue(ArrayList<Integer> numbers){
        HashSet<Integer> uniqueValueSet = new HashSet<>(numbers);
        ArrayList<Integer> uniqueValue = new ArrayList<>(uniqueValueSet);
        return uniqueValue;
    }
}


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main2 {

   /* Задача 2
     Дан список имен. Имена в списке повторяются. Необходимо получить map, в котором ключ будет имя, а значение –
    сколько раз это имя встретилось в исходном списке.
    Например:{jack,john,ann, jack, jack,ann} -> [jack=3, ann=2, john=1]
     */

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of("jack","john","ann","jack","jack","ann"));

        HashMap<String, Integer> numberOfValues = new HashMap<>();
        for (int i = 0; i< names.size();i++){
            if (numberOfValues.containsKey(names.get(i))){
                int counter = numberOfValues.get(names.get(i));
                numberOfValues.put((names.get(i)),counter+1);
            }
            else {
                numberOfValues.put((names.get(i)),1);
            }
        }
        System.out.println(numberOfValues);


    }
}

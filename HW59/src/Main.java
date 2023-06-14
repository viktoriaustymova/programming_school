import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class Main {
    //Задание 1
    //Представим, что мы создаем программу для салона красоты. Создайте класс Client с полями:
    //
    //String name;
    //boolean hasHaircut; (true == подстрижен)
    //Создайте класс BeautySalon - салон красоты - с полями:
    //
    //Deque clientsQueue; - очередь клиентов.
    //String title - название салона.
    //И методами:
    //
    //записать клиента на стрижку в порядке живой очереди - register(Client client)
    //постричь следующего по очереди клиента - void treatNextClient(); - метод без параметров!
    // Метод должен выводить в консоль фразу
    // "<Имя клиента> пострижен" и менять значение поля hasHaircut на true.
    //Дополнительно:
    //
    //сделайте ограничение по вместимости салона.
    //сделайте отдельную очередь на маникюр и соответствующие методы.
    //(ограничение на вместимость можно сделать общим для этих очередей,
    // например, не больше 20 человек в обеих очередях)
    public static void main(String[] args) {

        BeautySalon salon1 = new BeautySalon("Diamond");
        salon1.register(new Client("Maria"));
        salon1.register(new Client("Alex"));
        salon1.register(new Client("Max"));
        salon1.register(new Client("Julia"));
        System.out.println(salon1.register(new Client("Anna")));
        System.out.println(salon1.register(new Client("Katja")));

        salon1.treatNextClient();
        salon1.treatNextClient();
        salon1.treatNextClient();
        salon1.treatNextClient();
        salon1.treatNextClient();
        salon1.treatNextClient();
        salon1.makeManicure();

        // PriorityQueue
        PriorityQueue<Integer> numbersPQ = new PriorityQueue<>();
        numbersPQ.add(10);
        numbersPQ.add(2);
        numbersPQ.add(15);
        System.out.println(numbersPQ.poll());
        System.out.println(numbersPQ.poll());
        System.out.println(numbersPQ.poll());
        // вытаскиваем по возрастанию - естественный
        // Если хотим работать с PriorityQueue нам
        // обязательно потребуется одно из двух:
        // - Comparable == естественный порядок
        // - Comparator == если хотим перебить естественный порядок
        // Ниже код с ошибкой
//    PriorityQueue<Client> clientsPQ = new PriorityQueue<>();
//    clientsPQ.add(new Client("Ivan"));
        // Поскольку в клиенте не имплементирован интерфейc Comparable
        // Мы можем, например, указать компаратор
        PriorityQueue<Client> clientsPQ = new PriorityQueue<>(
                (o1, o2) -> o1.getName().compareTo(o2.getName())
        );
        clientsPQ.add(new Client("Ivan"));
        clientsPQ.add(new Client("Avel"));
        clientsPQ.add(new Client("Yvan"));
        System.out.println(clientsPQ);
    }

}
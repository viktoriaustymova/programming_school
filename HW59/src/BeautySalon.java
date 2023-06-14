import java.util.ArrayDeque;
import java.util.Deque;

public class BeautySalon {
    private Deque<Client> clientsQueue;
    private String title;
    private Deque<Client> clientsForManicureQueue;

    private int capacity = 5;

    public BeautySalon( String title) {
        this.title = title;
        this.clientsQueue = new ArrayDeque<Client>();
        this.clientsForManicureQueue = new ArrayDeque<Client>();

    }

    public boolean hasFreePlace(){
       return (clientsForManicureQueue.size()+clientsQueue.size())<capacity;
    }

    public boolean register(Client client){
        if (hasFreePlace()){
            return clientsQueue.add(client);
        }
        return false;
    }

    public boolean signUpForManicure(Client client){
        if (hasFreePlace()){
            return clientsForManicureQueue.add(client);
        }
        return false;
    }

    public void treatNextClient(){
        if(!clientsQueue.isEmpty()){
            Client client =clientsQueue.poll();
            client.setHasHaircut(true);
            System.out.println("Клиент " +client.getName() + " подстрижен");
        }
        System.out.println("Клиентов в очереди нет");
    }

    public void makeManicure(){
        if(!clientsForManicureQueue.isEmpty()){
            Client client = clientsForManicureQueue.poll();
            client.setHasManicure(true);
            System.out.println("Клиенту " + client.getName() + " сделан маникюр");
        } else {
            System.out.println("Клиентов в очереди нет");
        }
    }

    @Override
    public String toString() {
        return "BeautySalon{" +
                "clientsQueue=" + clientsQueue +
                ", title='" + title + '\'' +
                '}';
    }
}

import java.util.HashMap;

public class Main {
    //Задача 1
    //Дан список объектов Account.
    // Каждый Account содержит 3 поля String iban – номер счета,
    // String nameOfOwner – имя владельца, double balance – баланс счета.
    // Необходимо создать map, в котором ключем будет имя владельца
    // счета, а значением его Account.
    public static void main(String[] args) {

        Account[] accounts = {
                new Account("DE1245678999","Ivan Ivanov",20000),
                new Account("DE1245678999","Ivanna Ivanova",7000),
                new Account("DE1245678999","Vasiliy Vasilyev",15000),
        };

        HashMap<String,Account> mapOfAccounts = new HashMap<>();
        for(Account account: accounts){
            mapOfAccounts.put(account.nameOfOwner,account);
        }
        System.out.println(mapOfAccounts);

    }
}
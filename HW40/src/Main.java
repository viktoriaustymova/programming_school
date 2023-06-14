import java.util.*;

public class Main {
    /*Задание 1
    Создать класс Account (String iban, Person owner, double balance). Создать список счетов.
    Написать метод, который формирует Map< Account, Person>,
    где ключом является счет Account, а значением Person владелец счета.

            Задание 2
    Допустим, у вас есть список счетов, в котором счета повторяются.
    Нужно написать метод
    List < Account > getUniqueAccounts(List< Account > list) который сформирует список уникальных счетов*/

    public static void main(String[] args) {
        Person person1 = new Person("Alex");
        Person person2 = new Person("Max");
        Person person3 = new Person("Jack");
        Person person4 = new Person("Nick");


        Account account1 = new Account("DE22334455",person1,5000);
        Account account2 = new Account("DE12345878",person2,3000);
        Account account3 = new Account("DE33442356",person3,3700);
        Account account4 = new Account("DE33442356",person4,4900);

        List<Account> listOfAccounts = new ArrayList<>(List.of(account1,account2,account3,account4));
        System.out.println(createMap(listOfAccounts));

        System.out.println(getUniqueAccounts(listOfAccounts));

    }

    public static HashMap<Account, Person> createMap(List<Account> listOfAccounts){
        HashMap<Account, Person> mapOfAccounts = new HashMap<>();
        for (Account account : listOfAccounts ){
            mapOfAccounts.put(account,account.getOwner());
        }
        return mapOfAccounts;

    }


    public static List < Account > getUniqueAccounts(List< Account > listOfAccounts){
        HashSet<Account> uniqueAccounts = new HashSet<>(listOfAccounts);
        ArrayList < Account > listOfUniqueAccounts = new ArrayList<>(uniqueAccounts);
        return listOfUniqueAccounts;
    }


}
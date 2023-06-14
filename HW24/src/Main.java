public class Main {

    /*
    1.Создайте класс MyDate со следующими атрибутами (int day, int month, int year).
     Напишите метод конструктор и toString .
     Создайте класс Person со следующими атрибутами String firstName, String lastName, MyDate birthday.
     Напишите методы конструктор, toString.
     Создайте класс Account со следующими атрибутами: String IBAN (номер счета),
     Person owner (владелец), double balance (баланс), MyDate dayOpen (дата открытия)
     Напишите метод конструктор, toString.
     Создайте несколько счетов, создайте массив из счетов, распечатайте список счетов.

     2. В классе Account напишите метод incomeTransaction(double amount) ,
     который увеличивает баланс счета на сумму amount.
     В Main напишите метод, который используя метод incomeTransaction,
     добавляет ко всем счетам из массива 1000.
     */
    public static void main(String[] args) {
        MyDate birthday1 = new MyDate(13,05,1980);
        Person owner1 = new Person("Ivan","Ivanov",birthday1);
        MyDate dayOpen1 = new MyDate(04,07,2015);
        MyDate birthday2 = new MyDate(11,07,1984);
        Person owner2 = new Person("Ivanna","Ivanova",birthday2);
        MyDate dayOpen2 = new MyDate(01,02,2019);
        MyDate birthday3 = new MyDate(01,01,1990);
        Person owner3 = new Person("Nikolai","Ivanov",birthday3);
        MyDate dayOpen3 = new MyDate(04,03,2022);
        Account ivansAccount = new Account("DE1234567894454",owner1,5000,dayOpen1);
        Account ivannasAccount = new Account("DE1767432456800",owner2,8000,dayOpen2);
        Account nikolaisAccount = new Account("DE2346809786778",owner3,20000,dayOpen3);





        Account[] accounts = {ivansAccount,ivannasAccount,nikolaisAccount};

        for(int i = 0; i< accounts.length;i++) {
            System.out.println(accounts[i]);
        }

        sendMoneyToAll(accounts);
        System.out.println(ivansAccount);
        System.out.println(ivannasAccount);
        System.out.println(nikolaisAccount);

    }
    public static void sendMoneyToAll(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            accounts[i].incomeTransaction(1000);
        }
    }


}
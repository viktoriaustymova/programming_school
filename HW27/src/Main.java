import java.util.LinkedList;
import java.util.List;

public class Main {
    //Создайте класс работник Employee с полями:
    //
    //имя;
    //фамилия;
    //стаж (лет);
    //дожность;
    //double moneyAccount;
    //Создайте для этого класса toString и конструктор.
    //Создайте класс фирма с полями:
    //
    //название;
    //работники LinkedList<Employee> employees;
    //Создайте для этого класса toString и конструктор.
    //Создайте в классе фирма метод public void paySalaryToAll() -
    // этот метод должен увеличивать количество денег на счету у каждого сотрудника на 3000;
    //
    //Дополнительно *
    //Реализуйте взаимосвязь между стажем и размером получаемой зарплаты. Придумайте свои методы.
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan","Ivanov",10,"CEO",40000);
        Employee employee2 = new Employee("Ivanna","Ivanova",7,"accountant",25000);
        Employee employee3 = new Employee("Julia","Ivanova",3, "marketing manager",17000);
        Employee employee4 = new Employee("Maria","Ivanova",5, "sales manager",20000);

        LinkedList<Employee> employees = new LinkedList<>(List.of(employee1,employee2,employee3,employee4));
        Firma firma1 = new Firma("Globus",employees);


        firma1.paySalaryToAll();
        System.out.println(firma1);


        firma1.moreMoneyForExperience();  // сотрудники со стажем работы более 5 лет получают дополнительно 2000;
        System.out.println(firma1);

    }

}
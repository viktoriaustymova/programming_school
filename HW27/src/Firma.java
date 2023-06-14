import java.util.LinkedList;

public class Firma {
    String title;
    LinkedList<Employee> employees;

    Firma(String title,LinkedList <Employee> employees){
        this.title = title;
        this.employees = employees;
    }

    public String toString(){
        return "Название: " + title + " " + employees;
    }
    public void paySalaryToAll(){
        for (Employee employee: employees) {
            employee.pay(3000);
        }
    }

    public void moreMoneyForExperience(){
        for (Employee employee: employees) {
            if (employee.experience > 5){
                employee.pay(2000);
            }
        }
    }
}

public class Employee {
    String firstName;
    String lastName;
    int experience;
    String position;
    double moneyAccount;

    Employee(String firstName, String lastName, int experience, String position, double moneyAccount){
        this.firstName = firstName;
        this.lastName = lastName;
        this.experience = experience;
        this.position = position;
        this.moneyAccount = moneyAccount;
    }

    public String toString() {
        return String.format("Имя: %s, фамилия: %s, опыт работы %d лет,должность: %s,количество денег на счету: %f %n",
                firstName,lastName,experience,position,moneyAccount);
    }

    public void pay(double salary) {
        moneyAccount += salary;

    }

}

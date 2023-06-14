public class Main {
   /* Задание 1
    Создайте абстрактный класс работник Employee c полями:

    база з/п - salaryBase,
    опыт - experience
    И абстрактным методом double calculateSalary().

    Создайте класс ITengineer - ИТ инженер.
    Реализуйте метод calculateSalary, метод должен рассчитывать зарплату с учетом опыта.
     Чтобы за каждый год опыта начислялось по 5% от базовой зарплаты.
     То есть метод возвращает базовую зарплату + процент надбавки.

    Создайте класс QAengineer - QA инженер.
     Реализуйте метод calculateSalary, чтобы за каждый год начислялось по 6% от базы зарплаты.

* Задание 2 Перегрузка методов
    Сделайте еще один метод double calculateSalary(double additionalBonus),
    чтобы за каждый год опыта начислялось по 5% от базовой зарплаты + размер дополнительного бонуса
    в процентах от базовой зп.*/
    public static void main(String[] args) {

        ITengineer iTengineer1 = new ITengineer(10000,5);
        QAingineer qAingineer1 = new QAingineer(7000,2);


        System.out.println("Заработная плата сотрудника: " + iTengineer1.calculateSalary());

        System.out.println("Заработная плата сотрудника: " + qAingineer1.calculateSalary());

        System.out.println("Заработная плата сотрудника с учетом дополнительного бонуса: "
                + iTengineer1.calculateSalary(500));

        System.out.println("Заработная плата сотрудника с учетом дополнительного бонуса: "
                + qAingineer1.calculateSalary(300));

        System.out.println(qAingineer1.calculateSalary());




    }
}
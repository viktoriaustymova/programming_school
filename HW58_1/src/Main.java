import java.time.LocalDate;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    /*
    Задание 2
    Создайте класс Firm - фирма c полями:

    название
    количество сотрудников
    Создайте TreeSet фирм, добавьте в него произвольное количество фирм,
     убедитесь, что все несовпадающие фирмы добавились.

    Попробуйте добавить полей в класс Firm,
    после чего создайте еще один TreeSet с использованием Comparator.*/

    public static void main(String[] args) {

        Set<Firm> firms = new TreeSet<>();
        firms.add(new Firm("Firm1",15, LocalDate.of(2012,4,3)));
        firms.add(new Firm("Firm2",50, LocalDate.of(2017,1,5)));
        firms.add(new Firm("Firm3",15, LocalDate.of(2020,8,10)));
        firms.add(new Firm("Firm4",35, LocalDate.of(2005,2,1)));
        System.out.println(firms);


        Set<Firm> firmsNewSet = new TreeSet<>(
                new Comparator<Firm>() {
                    @Override
                    public int compare(Firm o1, Firm o2) {
                        if(o1.getNumberOfEmployees() == o2.getNumberOfEmployees()){
                            return o1.getTitle().compareTo(o2.getTitle());
                        } else if (o1.getTitle().equals(o2.getTitle())){
                            return o1.getDateOfRegistration().compareTo(o2.getDateOfRegistration());
                        }
                        return Integer.compare(o1.getNumberOfEmployees(), o2.getNumberOfEmployees());
                    }
                }
        );
        firmsNewSet.add(new Firm("Skan",15, LocalDate.of(2012,4,3)));
        firmsNewSet.add(new Firm("Expleo",20, LocalDate.of(2017,1,5)));
        firmsNewSet.add(new Firm("TelForYou",15, LocalDate.of(2020,4,3)));
        firmsNewSet.add(new Firm("Sysmex",20, LocalDate.of(2005,2,1)));
        System.out.println(firmsNewSet);




    }
}
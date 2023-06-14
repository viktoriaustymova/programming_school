import java.time.LocalDate;

public class Firm implements Comparable<Firm>{
    String title;
    int numberOfEmployees;
    LocalDate dateOfRegistration;


    public Firm(String title, int numberOfEmployees,LocalDate dateOfRegistration) {
        this.title = title;
        this.numberOfEmployees = numberOfEmployees;
        this.dateOfRegistration = dateOfRegistration;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public LocalDate getDateOfRegistration() {
        return dateOfRegistration;
    }

    @Override
    public String toString() {
        return "Firm{" +
                "title='" + title + '\'' +
                ", numberOfEmployees=" + numberOfEmployees +
                ", dateOfRegistration=" + dateOfRegistration +
                '}';
    }

    @Override
    public int compareTo(Firm o) {
        if(numberOfEmployees == o.numberOfEmployees){
            return title.compareTo(o.title);
        }
        return Integer.compare(numberOfEmployees,o.numberOfEmployees);
    }
}

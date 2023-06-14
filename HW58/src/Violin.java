import java.time.LocalDate;

public class Violin  {
    String nameOfMaster;
    LocalDate dateOfProduction;

    public Violin(String nameOfMaster, LocalDate dateOfProduction) {
        this.nameOfMaster = nameOfMaster;
        this.dateOfProduction = dateOfProduction;
    }

    public String getNameOfMaster() {
        return nameOfMaster;
    }

    public LocalDate getDateOfProduction() {
        return dateOfProduction;
    }

    @Override
    public String toString() {
        return "Violin{" +
                "nameOfMaster='" + nameOfMaster + '\'' +
                ", dateOfProduction=" + dateOfProduction +
                '}';
    }


}

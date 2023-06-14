import java.util.Comparator;

public class ComparatorByDate implements Comparator<Violin> {
    @Override
    public int compare(Violin o1, Violin o2) {
        return o1.getDateOfProduction().compareTo(o2.getDateOfProduction());
    }
}

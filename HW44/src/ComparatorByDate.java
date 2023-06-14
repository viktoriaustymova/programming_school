import java.util.Comparator;

public class ComparatorByDate implements Comparator<RealProperty> {
    @Override
    public int compare(RealProperty o1, RealProperty o2) {
        return o1.dateOfPurchase.compareTo(o2.dateOfPurchase);
    }
}

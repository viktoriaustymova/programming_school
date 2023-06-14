import java.util.Comparator;

public class ComparatorByAddress implements Comparator<RealProperty> {
    @Override
    public int compare(RealProperty o1, RealProperty o2) {
        return o1.address.compareTo(o2.address);
    }
}

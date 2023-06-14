import java.util.Comparator;

public class ComparatorByTax implements Comparator<RealProperty> {
    @Override
    public int compare(RealProperty o1, RealProperty o2) {
        return Double.compare(o1.getPropertyTax(),o2.getPropertyTax());
    }
}

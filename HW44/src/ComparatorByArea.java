import java.util.Comparator;

public class ComparatorByArea implements Comparator<RealProperty> {
    @Override
    public int compare(RealProperty o1, RealProperty o2) {
        return Double.compare(o1.getArea(),o2.getArea());
    }
}

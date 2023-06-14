import java.util.Comparator;

public class ComparatorStudentsBylName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getLName().compareTo(o2.getLName());
    }
}

import java.util.Comparator;

public class ComparatorStudentsByfName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFName().compareTo(o2.getFName());
    }
}

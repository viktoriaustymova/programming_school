import java.util.Comparator;

public class ComparatorStudentsByMissingLesson implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMissingLesson()- o2.missingLesson;
    }
}

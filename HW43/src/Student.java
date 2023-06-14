public class Student implements Comparable<Student>{
    String fName;
    String lName;
    int doneHomeWork;
    int missingLesson;

    public Student(String fName, String lName, int doneHomeWork, int missingLesson) {
        this.fName = fName;
        this.lName = lName;
        this.doneHomeWork = doneHomeWork;
        this.missingLesson = missingLesson;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", doneHomeWork=" + doneHomeWork +
                ", missingLesson=" + missingLesson +
                '}';
    }

    public String getFName() {
        return fName;
    }

    public String getLName() {
        return lName;
    }

    public int getDoneHomeWork() {
        return doneHomeWork;
    }

    public int getMissingLesson() {
        return missingLesson;
    }

    @Override
    public int compareTo(Student o) {
        return this.missingLesson-o.missingLesson;
    }
}

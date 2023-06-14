public class QAingineer extends Employee{
    public QAingineer(double salaryBase, int experience) {
        super(salaryBase, experience);
    }

    @Override
    public double calculateSalary() {
        return getSalaryBase()+getExperience()*getSalaryBase()*0.06;
    }

    @Override
    public double calculateSalary(double additionalBonus) {
        return  getSalaryBase() + additionalBonus + getExperience()*getSalaryBase()*0.05;
    }

    public String toString() {
        return "ITEngineer" + super.toString();
    }




}

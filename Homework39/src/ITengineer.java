public class ITengineer extends Employee{
    public ITengineer(double salaryBase, int experience) {
        super(salaryBase, experience);
    }

    @Override
    public double calculateSalary() {
        return getSalaryBase()+getExperience()*getSalaryBase()*0.05;

    }

    @Override
    public double calculateSalary(double additionalBonus) {
        return  getSalaryBase() + additionalBonus + getExperience()*getSalaryBase()*0.05;
    }


}

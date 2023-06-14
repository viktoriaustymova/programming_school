public abstract class Employee {
    private double salaryBase;
    private int experience;


    public Employee(double salaryBase, int experience) {
        this.salaryBase = salaryBase;
        this.experience = experience;
    }

    public double getSalaryBase() {
        return salaryBase;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salaryBase=" + salaryBase +
                ", experience=" + experience +
                '}';
    }

    public abstract double calculateSalary();

    public abstract double calculateSalary(double additionalBonus);
}

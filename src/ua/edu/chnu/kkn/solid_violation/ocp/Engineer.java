package ua.edu.chnu.kkn.solid_violation.ocp;

public class Engineer implements IEmployee {
    private int salary;
    Engineer(int salary) {
        this.salary = salary;
    }

    @Override
    public int payAmount(EmployeeType type) {
        return salary;
    }
}

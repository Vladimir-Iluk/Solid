package ua.edu.chnu.kkn.solid_violation.ocp;

public class Manager implements IEmployee {
    private int salary;
    private int bonus;
    Manager(int salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public int payAmount(EmployeeType type) {
        return salary;
    }
}

package ua.edu.chnu.kkn.solid_violation.dip;

import java.time.MonthDay;

public class BirthdayGreeter {
    private final EmployeeRepository employeeRepository;
    private final TimeProvider timeProvider;
    private final MessageSender messageSender;

    public BirthdayGreeter(EmployeeRepository employeeRepository, TimeProvider timeProvider, MessageSender messageSender) {
        this.employeeRepository = employeeRepository;
        this.timeProvider = timeProvider;
        this.messageSender = messageSender;
    }

    public void sendGreetings() {
        MonthDay today = timeProvider.getCurrentMonthDay();
        List<Employee> employees = employeeRepository.findEmployeesBornOn(today);

        for (Employee employee : employees) {
            Email email = emailFor(employee);
            messageSender.send(email);
        }
    }

    private Email emailFor(Employee employee) {
        String message = String.format("Happy birthday, dear %s!", employee.getFirstName());
        return new Email(employee.getEmail(), "Happy birthday!", message);
    }
}
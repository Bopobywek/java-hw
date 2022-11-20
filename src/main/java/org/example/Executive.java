package org.example;

import java.util.ArrayList;

public class Executive extends Manager {
    public Executive(String name, Integer age, Integer salary, ArrayList<Employee> staff) {
        super(name, age, salary, staff);
    }

    public void fireEmployee(Employee employee) {
        if (employee instanceof Manager) {
            System.out.println("I can't do this!");
            return;
        }
        staff.remove(employee);
        System.out.println("Bye-bye!");
    }

    @Override
    public String toString() {
        return String.format("Boss %s. Age: %d. Salary: %d", getName(), getAge(), getSalary());
    }
}

package org.example;

import java.util.ArrayList;

public class Manager extends Employee {
    ArrayList<Employee> staff = new ArrayList<>();
    public Manager(String name, Integer age, Integer salary, ArrayList<Employee> staff) {
        super(name, age, salary);
        this.staff.addAll(staff);
    }

    @Override
    public void doWork() {
        for (var employee : staff) {
            // Мотивирует сотрудников работать :)
            employee.changeEnergy(10);
        }
        changeEnergy(-25);
    }


    @Override
    public void makeRest() {
        System.out.println("I'm a manager, so I went on vacation to Hawaii");
        changeEnergy(100);
    }

    @Override
    public String toString() {
        return String.format("Manager %s. Age: %d. Salary: %d", getName(), getAge(), getSalary());
    }
}

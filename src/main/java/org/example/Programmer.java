package org.example;

import java.util.Random;

public class Programmer extends Employee implements GradableSalary {
    public Programmer(String name, Integer age, Integer salary) {
        super(name, age, salary);
    }

    @Override
    public void doWork() {
        if (getEnergy() < 0) {
            System.out.printf("I'm %s and I'm too tired to code...", getName());
        }
        System.out.printf("I'm %s and coding hard now!\n", getName());
        changeEnergy(-10);
    }

    @Override
    public void makeRest() {
        System.out.printf("I'm programmer %s, so I rest while drinking coffee\n", getName());
        changeEnergy(100);
    }

    @Override
    public String toString() {
        return String.format("Programmer %s. Age: %d. Salary: %d", getName(), getAge(), getSalary());
    }

    @Override
    public int getGrade() {
        Random rand = new Random();
        return rand.nextInt(10, 100);
    }

    // changeSalary реализован в родительском классе
}

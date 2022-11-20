package org.example;

public abstract class Employee {
    private final String name;
    private Integer age;
    private Integer salary;
    private Integer energy = 100;

    public Employee(String name, Integer age, Integer salary) {
        this.name = name;
        setSalary(salary);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    private void setAge(Integer age) {
        if (age <= 10 || age >= 100) {
            throw new IllegalArgumentException("The age of the employee must be between 10 and 100");
        }
        this.age = age;
    }

    protected void changeEnergy(Integer delta) {
        energy = Math.min(Math.max(energy + delta, 0), 100);
    }

    public Integer getEnergy() {
        return energy;
    }

    public Integer getSalary() {
        return salary;
    }

    private void setSalary(Integer value) {
        if (value < 0) {
            throw new IllegalArgumentException("Salary cannot be less than 0");
        }
        salary = value;
    }

    public abstract void doWork();
    public abstract void makeRest();

    @Override
    public String toString() {
        return String.format("Employee<name=%s, age=%s, salary=%s, energy=%s>", name, age, salary, energy);
    }
}

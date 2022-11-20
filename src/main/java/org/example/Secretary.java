package org.example;

import java.util.ArrayList;

public class Secretary extends Employee {
    private final ArrayList<String> plannedCalls = new ArrayList<>();

    public Secretary(String name, Integer age, Integer salary) {
        super(name, age, salary);
    }

    private void makeCall(String receiver) {
        System.out.printf("I'm a secretary %s, and I'm calling %s\n", getName(), receiver);
    }

    @Override
    public void doWork() {
        while (!plannedCalls.isEmpty() || getEnergy() > 0) {
            int callIndex = plannedCalls.size() - 1;
            makeCall(plannedCalls.get(callIndex));
            plannedCalls.remove(callIndex);
            changeEnergy(-5);
        }

        if (!plannedCalls.isEmpty()) {
            System.out.println("I'm so tired to make other calls...");
        }
    }

    @Override
    public void makeRest() {
        System.out.println("I'm a secretary, my vacation has finally come");
    }

    public void planCall(String receiver) {
        plannedCalls.add(receiver);
    }

    @Override
    public String toString() {
        return String.format("Secretary %s. Age: %d. Salary: %d", getName(), getAge(), getSalary());
    }
}

package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> companyStaff = new ArrayList<>();
        companyStaff.add(new Programmer("Ivan Petrovich Programmistsky", 23, 500));
        companyStaff.add(new Secretary("Tamara Lvovna Familievna", 34, 400));
        companyStaff.add(new Manager("Krytoi Bossovich Coolboyev", 20, 10000, companyStaff));
        var boss = new Executive("Boss Bossovich Bossov", 48, 100000, companyStaff);
        companyStaff.add(boss);

        System.out.println("Company staff:");
        for (var employee : companyStaff) {
            System.out.println(employee);
        }
        System.out.println();

        for (var employee : companyStaff) {
            if (employee instanceof GradableSalary gradable) {
                System.out.println("Should we increase salary for " + employee.getName() + "?");
                int result = gradable.getGrade();
                System.out.println("Test result: " + result);
                if (result < 50) {
                    System.out.println("!!!!! -social credits !!!!!\n Bad result: -salary");

                    try {
                        gradable.changeSalary(-600);
                    } catch (Exception e) {
                        System.out.println("Ooops, salary already low...");
                    }
                } else {
                    System.out.println("GOOD! +salary");
                    gradable.changeSalary(50);
                }

                System.out.println();
            }
        }
    }
}
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

        for (var employee : companyStaff) {
            System.out.println(employee);
        }
    }
}
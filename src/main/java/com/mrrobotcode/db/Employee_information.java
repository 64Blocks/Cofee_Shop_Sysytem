package com.mrrobotcode.db;

import java.util.ArrayList;

public class Employee_information {

    private String name;
    private String post;
    private double Hr_income;
    static ArrayList<Employee_information> Save_info = new ArrayList<>();

    public Employee_information() {

    }

    private Employee_information(String name, String post, double Hr_income) {
        this.name = name;
        this.post = post;
        this.Hr_income = Hr_income;
    }

    public ArrayList<Employee_information> Add_employee() {

        //add employee

        Save_info.add(new Employee_information("Thierry Callaghan", "Waiter", 5));
        Save_info.add(new Employee_information("Kiaan Thorpe", "Waiter", 5));
        Save_info.add(new Employee_information("Augustus Mcconnell", "Waiter", 5));
        Save_info.add(new Employee_information("Ferne Osborne", "Batista", 10));
        Save_info.add(new Employee_information("Sanjay Clemons", "Batista", 10));

        return Save_info;
    }

    public static void Show_Employee() {
        Employee_information employee_information = new Employee_information();
        employee_information.Add_employee();

        for (int i = 0; i <= Save_info.size() - 1; i++) {

            System.out.print(Save_info.get(i).name + "\t");
            System.out.print(Save_info.get(i).post + "\t");
            System.out.print(Save_info.get(i).Hr_income + "$" + "\n");
        }
    }


}


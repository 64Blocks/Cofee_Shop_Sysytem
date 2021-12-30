package com.mrrobotcode.db;

import com.mrrobotcode.panel.General_manger;

import java.util.LinkedList;
import java.util.Scanner;

public class Edit_Employee {
    public static void Edit_all_info() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Which one should Edit??");
        int id_employee = scanner.nextInt();
        scanner.nextLine();

        //Save The info in Array link for Save this Array list and edited
        Employee_information employee_information = new Employee_information();
        LinkedList<Employee_information> Info_Edit = new LinkedList<>();
        Info_Edit = employee_information.Add_employee();

        //for now without db we use loop for edit
        String new_name;
        String new_post;
        int income;
        System.out.println("Enter The new name");
        new_name = scanner.nextLine();
        System.out.println("Enter The new post");
        new_post = scanner.nextLine();
        System.out.println("Enter The new income in hour");

        income = scanner.nextInt();
        Info_Edit.set((id_employee - 1), new Employee_information(id_employee, new_name, new_post, income));
        System.out.println("id " + id_employee + " Change to " + new_name + new_post + income+"$");


    }

}

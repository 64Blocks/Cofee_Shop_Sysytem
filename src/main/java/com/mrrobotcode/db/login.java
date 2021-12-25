package com.mrrobotcode.db;

import com.mrrobotcode.Menu.cofee;
import com.mrrobotcode.customer.Payment_recipt;
import com.mrrobotcode.order.receive_order;
import com.mrrobotcode.panel.General_manger;

import java.util.Objects;
import java.util.Scanner;

public class login{
    int id;
    String username;
    String password;

    public login() {
    }

    public login(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    //message for see the menu of login
    public static void Display_panel() {
        System.out.println("1:Management" + "\n" + "2:Waiter" + "\n" + "3:Bartista" + "\n" + "4:Customer");
    }

    //check the login
    public static void Check_login() {
        System.out.println("Select a number for show a panel...");
        Scanner scanner = new Scanner(System.in);

        login login_obj = new login();
        login_obj.id = scanner.nextInt();
         scanner.nextLine();

        switch (login_obj.id) {
            case 1:
                System.out.println("You are manger Enter The username and password");
                System.out.println("Username : ");
                 login_obj.username = scanner.nextLine();
                System.out.println("password : ");
                login_obj.password = scanner.nextLine();
                if (Objects.equals(login_obj.username, "Admin") && Objects.equals(login_obj.password,"Admin"))
                {
                    System.out.println("Welcome boss");
                    System.out.println("Here is a list of employee");
                    General_manger general_manger = new General_manger();
                    general_manger.Show_info_employee();


                }
                else
                {
                    System.out.println("Password or username is incorrect Try again");
                    
                }
                 break;

            case 2:
                System.out.println("You are the Waiter Take your order");
                break;
            case 3:
                System.out.println("Here is your list for Make coffee");
                break;
            case 4:
                //welcome and take the order
                receive_order.messege receiveOrder = new receive_order.messege();
                receiveOrder.Messege_for_take_the_order();

                //show the menu
                cofee.cofee_lists cofeeLists = new cofee.cofee_lists();
                cofeeLists.print_cofee_menu();


                //print a receipt
                Payment_recipt payment_recipt = new Payment_recipt();
                payment_recipt.Print_Recipt();
        }

    }

}

package main.java.com.mrrobotcode.customer;

import com.mrrobotcode.Menu.cofee;
import com.mrrobotcode.order.receive_order;
import com.mrrobotcode.random.Table_number;


import java.util.ArrayList;
import java.util.Scanner;

public class customer_order {




    public ArrayList<receive_order> Take_the_value() {
        //Save the id of order
        ArrayList<receive_order> Save_The_order = new ArrayList<>();
        //loop for take the order
        Scanner scanner = new Scanner(System.in);
        int Save_The_order_id = 0;
        String Name_The_order;
        int amount = 0;
        double order_cost = 0;
        double payment = 0;
        char another_request;
        boolean Continue = false;
        cofee.cofee_lists cofee = new cofee.cofee_lists();
        ArrayList<cofee> list = cofee.cofee_menu_made_obj();
        cofee.cofee_lists cofeeLists=new cofee.cofee_lists();

        //Made a random table number
        Table_number tableNumber = new Table_number();
        int Table_Number = tableNumber.Table_Number_Generator();

        do {
            //What customer is need
            System.out.println("Select one of the list....");
            Save_The_order_id = Integer.parseInt(scanner.nextLine());
            //Save the name
            Name_The_order = (list.get(Save_The_order_id - 1).name);
            //how many ??
            System.out.println("How many you want??");
            amount = Integer.parseInt(scanner.nextLine());
            //how much have cost

            order_cost = (list.get(Save_The_order_id - 1).price) * amount;
            payment = payment + order_cost;
            Save_The_order.add(new receive_order(Save_The_order_id, Name_The_order, amount, Table_Number, order_cost));
            System.out.printf("until now the payment cost is  " + "%.2f", payment);
            System.out.println("$" + "\n");
            //take the another order
            System.out.println("Another request??select y for yes and n for No");
            another_request = scanner.nextLine().charAt(0);


            if (another_request == 'y') {

                Continue = true;
                cofeeLists.print_cofee_menu();
            }
            else if (another_request == 'n') {
                Continue = false;
                break;
            }
            else {
                System.out.println("you should only choose y or n try again!!!!!");
                break;
            }

        } while (Continue == true);


        return Save_The_order;
    }
}


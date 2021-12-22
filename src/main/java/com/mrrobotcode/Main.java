package main.java.com.mrrobotcode;

import com.mrrobotcode.Menu.cofee;
import com.mrrobotcode.customer.Payment_recipt;
import com.mrrobotcode.customer.customer_order;
import com.mrrobotcode.order.receive_order;

public class Main {
    public static void main(String[] args) {
        //welcome and take the order
        receive_order.messege receiveOrder =new receive_order.messege();
        receiveOrder.Messege_for_take_the_order();

        //show the menu
        cofee.cofee_lists cofeeLists=new cofee.cofee_lists();
        cofeeLists.print_cofee_menu();


        //print a receipt
        Payment_recipt payment_recipt = new Payment_recipt();
        payment_recipt.Print_Recipt();


    }
}

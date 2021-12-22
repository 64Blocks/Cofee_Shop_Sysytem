package main.java.com.mrrobotcode.customer;
import com.mrrobotcode.order.receive_order;
import java.util.ArrayList;

public class Payment_recipt {
    //print coffee menu receipt
    public void Print_Recipt() {
        customer_order customerOrder = new customer_order();
        ArrayList<receive_order> Save_The_order = new ArrayList<>();
        Save_The_order = customerOrder.Take_the_value();

        double total_payment = 0;
        System.out.println("Table : " + Save_The_order.get(0).Table_number);
        for (int i = 0; i <= Save_The_order.size() - 1; i++) {
            System.out.print((i + 1) + ":");
            System.out.print(Save_The_order.get(i).name + "\t");
            System.out.print("X" + Save_The_order.get(i).amount + "\t");
            System.out.printf("%.2f" ,Save_The_order.get(i).payment);
            System.out.print("$");
            System.out.println();

            total_payment = total_payment+Save_The_order.get(i).payment;
        }




        System.out.print("Total payment is : ");
        System.out.printf("%.2f" ,total_payment);
        System.out.print("$");

    }
}

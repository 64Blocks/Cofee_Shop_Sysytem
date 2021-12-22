package main.java.com.mrrobotcode.order;


import java.util.ArrayList;

public class receive_order {
    public int id;
    public String name;
    public int amount;
    public int Table_number;
    public double payment;

    public receive_order(int id,String name ,int amount, int table_number , double payment) {
        this.id = id;
        this.amount = amount;
        this.Table_number = table_number;
        this.payment = payment;
        this.name = name;
    }
     public static void Save_The_order()
     {
         
         ArrayList<receive_order> order = new ArrayList<>();

     }
    public static class messege {
        public static void Messege_for_take_the_order() {
            System.out.println("Welcome to our coffee_shop what you need??");
            System.out.println("Here is your menu");
        }

    }
}

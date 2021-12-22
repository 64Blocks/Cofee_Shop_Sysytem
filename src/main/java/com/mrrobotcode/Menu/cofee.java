package main.java.com.mrrobotcode.Menu;

import java.util.ArrayList;
import java.util.Arrays;
public class cofee {
    public int id;
    public String name;
    public double price;
    int weight;
    boolean inventory;

    public cofee(int id, String name, double price, int Weight, boolean inventory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inventory = inventory;
        this.weight = Weight;
    }

    void choose() {
        System.out.println("You choose the Dessert");
    }

    void Order() {
        System.out.println("You order  the Dessert , any thing else ??");
    }

    public static class cofee_lists {
         ArrayList<cofee> cofee_menu = new ArrayList<>();

        public  ArrayList<cofee> cofee_menu_made_obj() {
            cofee_menu.add(new cofee(1, "Turk_coffee", 5.0, 200, true));
            cofee_menu.add(new cofee(2, "Cappuccino ", 2.0, 100, true));
            cofee_menu.add(new cofee(3, "French_coffee", 3.5, 150, true));
            cofee_menu.add(new cofee(4, "Latte_coffee", 4, 100, true));
            cofee_menu.add(new cofee(5, "Mocha", 5.3, 200, true));
            cofee_menu.add(new cofee(6, "Espresso coffee", 4, 100, true));
            cofee_menu.add(new cofee(7, "Americano", 10, 50, true));
            return cofee_menu;
        }

        public void print_cofee_menu()
        {    cofee_menu_made_obj();
            //Topic
            System.out.println("\"Coffee\"");
            //print coffee menu
            for (int i = 0 ; i<=cofee_menu.size()-1;i++)
            {
                System.out.print(cofee_menu.get(i).id +" : ");
                System.out.print(cofee_menu.get(i).name + " ");
                System.out.print(cofee_menu.get(i).weight+"ml ");
                System.out.println(cofee_menu.get(i).price+"$ ");
            }


        }


    }
}

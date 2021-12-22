package main.java.com.mrrobotcode.random;

import java.util.Random;

public class Table_number {
    int Table_Number_value;
    public static int Table_Number_Generator()
   {
       Random random = new Random();
       Table_number tableNumber = new Table_number();
       tableNumber.Table_Number_value = random.nextInt(20)+1;
       return tableNumber.Table_Number_value;
   }

}

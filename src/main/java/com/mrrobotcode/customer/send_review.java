package com.mrrobotcode.customer;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class send_review {

     int Star;
    String Comment;

    public send_review() {

    }

    public send_review(int star, String comment) {

        this.Star = star;
        this.Comment = comment;
    }

    public static ArrayList<send_review> Made_a_review() {
        send_review send_review = new send_review();
        System.out.println("\"Dear customer, submit your review about our coffee shop\"");
        System.out.println("Enter your satisfaction about our coffee shop");

        System.out.println("* " + "VeryBad");
        System.out.println("** " + "Bad");
        System.out.println("*** " + "Normal");
        System.out.println("**** " + "Good");
        System.out.println("***** " + "Excelent");

        ArrayList<send_review> Save_The_review = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount Stars for rating:");
        send_review.Star = scanner.nextInt();
        if (send_review.Star < 1 || send_review.Star >5)
        {
            System.out.println("You can only enter number between 1 and 5 Try again!!!");
            Made_a_review();
        }
        else {
            scanner.nextLine();


            System.out.println("Enter your comment:");
            send_review.Comment = scanner.nextLine();


            Save_The_review.add(new send_review(send_review.Star, send_review.Comment));


            //Save in Json
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("Rating",send_review.Star);
            jsonObject.put("Comment",send_review.Comment);

            try {
                FileWriter fileWriter = new FileWriter("D:\\java\\practice\\Cofee_Shop\\src\\main\\java\\com\\mrrobotcode\\db\\Rating.json");
                fileWriter.write(jsonObject.toJSONString());
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return Save_The_review;
    }
}

package com.mrrobotcode.customer;
import java.util.ArrayList;

public class print_review {
    public static void Print_review()
    {
        send_review send_review1 = new send_review();
        System.out.println(send_review1.Star);
        ArrayList<send_review> Save_The_review = new ArrayList<>();
        Save_The_review = send_review.Made_a_review();

        System.out.println("Tnx for you rating this rating help us improve our service");

        //if you want see the review use this 2 lines
        //System.out.println(Save_The_review.get(0).Star);
        //System.out.println(Save_The_review.get(0).Comment);


    }
}

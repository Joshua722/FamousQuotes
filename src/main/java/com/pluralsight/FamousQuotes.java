package com.pluralsight;
import java.util.*;
import java.util.concurrent.ExecutionException;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int userInput ;
        String[] listQuotes ={"(1) Keep it simple, stupid!", "(2) I like cheese", "(3) Watermelon yum!", "(4) Why are you running?","(5) I am spider-man!", "(6) I love you", "(7) You look lonely","(8) I can fix that","(9) I am Iron-man","(10) I love you with all my heart!"};


        do {
            System.out.println(Arrays.toString(listQuotes));


            System.out.println("Please pick one of these quotes above 1-10");
            userInput = myScanner.nextInt() - 1;
            try {
                System.out.println(listQuotes[userInput]);
            } catch (Exception e) {
                System.out.println("YOUR NUMBER WAS NOT VALID!");
                System.out.println("Please choose a valid number");
                userInput = myScanner.nextInt();
                if(userInput >= 0 && userInput <=9){
                    System.out.println(listQuotes[userInput]);
                }
            }
        }
        while(userInput >= 0 && userInput <= 9);






    }
}

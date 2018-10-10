package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //declare an array for 5 words

        String temp ="";

        String Word[] = new String[5];

        //initialize an array

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a word");

            Word[i] = scanner.nextLine();

            // System.out.println(Word[i]);

        }

        //print the elements of an array

        for (int i = 0; i < 5; i++) {

            System.out.println(Word[i]);

        }
        for (int i=0; i<10; i++){
            System.out.println("Enter the next president: ");
            temp = scanner.nextLine();
            if (temp.equalsIgnoreCase("history")){
                //System.out.println("print the history of the array");
                for (int j=0;j<i;j++){
                    System.out.println(Word[j]);
                }
            }else {
                Word[i] = temp;
            }
        }

    }

}



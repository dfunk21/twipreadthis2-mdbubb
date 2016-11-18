package com.company;

import java.io.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sf = new Scanner(new File("Imports.txt"));
        int maxIndex = -1;
        String text[] = new String[1000];
        while (sf.hasNext()) {
            maxIndex++;
            text[maxIndex] = sf.nextLine();
        }
        double average = 0;
        String hi;
        double count = 0;
        int newNum = 0;
        double sum = 0;
        int aNum = 0,bNum = 0,cNum = 0,dNum = 0,fNum = 0;
              for (int i = 1; i <= maxIndex; i++) {
            hi = text[i].substring(text[i].indexOf('%') - 2, text[i].indexOf('%'));
            newNum = Integer.parseInt(hi);
            if (newNum > 90) {
                aNum++;
                sum += newNum;
                count++;
            } else if (newNum > 80) {
                bNum++;
                sum += newNum;
                count++;
            } else if (newNum > 70) {
                cNum++;

                sum += newNum;
                count++;
            } else if (newNum > 60) {
                dNum++;
                sum += newNum;
                count++;
            } else {
                fNum++;
                sum += newNum;
                count++;
            }
            average = sum / count;
        }
        System.out.println("The class average is: " + average);
        System.out.println("There are " + aNum + " A's");
        System.out.println("There are " + bNum + " B's");
        System.out.println("There are " + cNum + " C's");
        System.out.println("There are " + dNum + " D's");
        System.out.println("There are " + fNum + " F's");
        System.out.println(newNum);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name to be searched or type -1 to leave");
        String ans = input.nextLine();
        if (ans.equalsIgnoreCase("-1")) {
            System.out.println("Bye");
        } else {
            ans = ans.replace("\\s", "");
            for (int j = 1; j <= maxIndex; j++) {
                if (ans.toLowerCase().contains(" ")) {
                    //I do not know what to do from here ...
                    //I do not know what to put in the if statement above
                    System.out.println(text[0] + "          ");
                    System.out.println(text[j]);
                        if(text[j].substring(text[j].indexOf('%') , text[j].length()).equalsIgnoreCase("5")){
                            System.out.println("You have been absent way too much");
                        }

                }
            }


        }
    }
}

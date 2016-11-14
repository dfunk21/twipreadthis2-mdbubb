package com.company;

import sun.tools.java.Imports;

import java.io.File;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException{
	// write your code here
        Scanner txtFileThing = new Scanner(new File("Imports.txt"));
       int maxIN = -1;
        String text[] = new String[1000];
        while(txtFileThing.hasNext()){
            maxIN++;
            text[maxIN] = txtFileThing.next();
            System.out.println(text[1]);
        }


    }
}

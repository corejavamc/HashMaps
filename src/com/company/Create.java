package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Create {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int numInp, secondNum;
        String yesNo, secValue;
        HashMap<Integer,String> maps=new HashMap<Integer, String>();

        maps.put(1,"one");
        maps.put(2,"two");
        maps.put(3,"three");
        maps.put(4,"four");
        maps.put(5,"five");
        maps.put(6,"six");
        maps.put(7,"seven");
        maps.put(8,"eight");
        maps.put(9,"nine");
        maps.put(10,"ten");
        System.out.println("Enter a number to find its value: ");
        numInp=input.nextInt();
        String value=maps.get(numInp);
        System.out.println("The value is : "+value);
        if (!maps.containsKey(numInp)){
            System.out.println("Number not found. Add its value");
            input.nextLine();
            secValue=input.nextLine();
            maps.put(numInp,secValue);
            System.out.println("The number you entered is "+numInp+ "\nIts value is "+secValue);

        }




        }
    }


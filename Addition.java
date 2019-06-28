package com.nep;

import java.util.Scanner;

public class Addition
{
    public static void main(String[] args) {
        int a,b;
        Add ad=new Add();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        a=sc.nextInt();
        System.out.println("enter the value of b");
        b=sc.nextInt();
        ad.sum(a,b);
        ad.display();
    }
}

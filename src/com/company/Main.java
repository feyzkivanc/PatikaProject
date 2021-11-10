package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int math, bio, eng, phy, che;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please math note: ");
        math=scanner.nextInt();
        System.out.print("Please bio note: ");
        bio=scanner.nextInt();
        System.out.print("Please eng note: ");
        eng=scanner.nextInt();
        System.out.print("Please phy note: ");
        phy=scanner.nextInt();
        System.out.print("Please che note: ");
        che=scanner.nextInt();

        int avarage= (math+bio+phy+eng+che)/5;
        System.out.print("avarage:" + (avarage));

        String success= avarage >= 60? "Geçti" : "Kaldı";

        System.out.println(success);
    }
}

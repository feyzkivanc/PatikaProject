package Daire;

import java.util.Scanner;

public class AlanCevreHesabi {
    public static void main(String[] args) {
//Dairenin Alanını,Çevresini ve merkez açısının ölçüsü a olan daire diliminin alanını Hesaplayan Program
        double pi = 3.14;
        Scanner scan= new Scanner(System.in);
        System.out.println("yarıçapı gir: ");
        int r = scan.nextInt() ;
        double alan= pi*r*r;
        System.out.println(alan);
        double cevre= 2*pi*r;
        System.out.println(cevre);
        System.out.println("açı ölçüsü: ");
        int a = scan.nextInt();
        double merkezAciOlcusu= (pi*(r*r)*a)/360;
        System.out.println("açı ölçüsü: " + merkezAciOlcusu);

    }
    }

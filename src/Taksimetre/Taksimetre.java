package Taksimetre;

import java.util.Scanner;

        //Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        //Taksimetre KM başına 2.20 TL tutmaktadır.
        //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.
public class Taksimetre {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("km: ");
        double km = scan.nextInt();
        double tutar = (km*2.20)+10;
        double toplam = tutar > 20 ? tutar : 20.0;
        System.out.print("ödeyeceğiniz tutar" + toplam);
    }
}

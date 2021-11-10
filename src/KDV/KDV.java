package KDV;

import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        //Kullanıcıdan istenen tutara göre, tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        // tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
        int miktar;
        Scanner scan = new Scanner(System.in);
        System.out.print("Para miktarını girin: ");
        miktar= scan.nextInt();

        int kdv= miktar < 1000? (miktar*18)/100 : (miktar*8)/100;
        System.out.println("kdv: " + kdv);
        System.out.println("toplam: " + (kdv+miktar));


    }
}

package Triangle;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        //kullanıcıdan 2 kenarı verilen üçgenin hipotenüsünü bulan program. ve alanı
        int a,b;
        Scanner scan= new Scanner(System.in);
        System.out.print("a kenarını giriniz: ");
        a = scan.nextInt();
        System.out.print("b kenarını giriniz: ");
        b = scan.nextInt();
        double c= Math.sqrt((a*a) + (b*b));
        System.out.println("c:" + c);
        double u= (a+b+c)/2;
        System.out.println("alan" + (u*(u-a)*(u-b)*(u-c)));
    }
}

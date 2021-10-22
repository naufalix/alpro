//@author Naufal Ulinnuha

import java.util.Scanner;

public class energi_mekanik {
    
    public static double m,h,v,ep,ek,em,g=10;
    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan massa benda (m): ");
        m = input.nextDouble();
        System.out.print("Masukkan tinggi benda dari permukaan tanah (h): ");
        h = input.nextDouble();
        System.out.print("kecepatan benda (v): ");
        v = input.nextDouble();
        
        //Proses Hitung
        ep = m*g*h;
        ek = (0.5)*m*(Math.pow(v,2));
        em = ep+ek;
        
        //Output
        System.out.println("Besar nilai energi potensial adalah : "+ep+" J");
        System.out.println("Besar nilai energi kinetik adalah : "+ek+" J");
        System.out.println("Besar nilai energi mekanik adalah : "+em+" J");
        
    }   
}

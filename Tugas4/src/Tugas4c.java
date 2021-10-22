//@author Naufal Ulinnuha

import java.util.Scanner;

public class Tugas4c {
    
    public static double a,b,c,x,y,z;
    public static void main(String[] args) {
   
        Scanner nilai = new Scanner (System.in); 
        System.out.print("Masukkan a :");
        a = nilai.nextDouble();
        System.out.print("Masukkan b :");
        b = nilai.nextDouble();
        System.out.print("Masukkan c :");
        c = nilai.nextDouble();
        
        x = (4*b);
        y = (2*a);
        z = (a*x)+(b*y*y)+c;
        
        System.out.println("Nilai x :"+String.format("%.1f",x));
        System.out.println("Nilai y :"+String.format("%.1f",y));
        System.out.println("Nilai z :"+String.format("%.1f",z));
    }
    
}

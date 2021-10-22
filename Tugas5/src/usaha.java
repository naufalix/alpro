//@author Naufal Ulinnuha

import java.util.Scanner;

public class usaha {
    
    public static double m,F,s,a,W;
    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan massa benda (m): ");
        m = input.nextDouble();
        System.out.print("Masukkan gaya benda (F): ");
        F = input.nextDouble();
        System.out.print("Masukkan perpindahan benda (s): ");
        s = input.nextDouble();
        System.out.print("Masukkan sudut antar perpindahan dan gaya (a) : ");
        a = input.nextDouble();
        
        //Proses Hitung
        W = F*s*(Math.cos(Math.toRadians(a)));
        
        //Output
        System.out.println("Nilai usaha (W) adalah "+String.format("%.1f",W)+" Joule");
    }
}
//@author Naufal Ulinnuha

import java.util.Scanner;

public class glbb {
    
    public static double Vo,a,t,Vt,s;
    public static void main(String[] args) {
        
        //Input
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kecepatan awal benda (Vo): ");
        Vo = input.nextDouble();
        System.out.print("Masukkan percepatan benda (a): ");
        a = input.nextDouble();
        System.out.print("Waktu yang ditempuh benda (t): ");
        t = input.nextDouble();
        
        //Proses Hitung
        Vt = Vo+(a*t);
        s = (a*(Math.pow(t,2)))/2;
        
        //Output
        System.out.println("Kecepatan benda (Vt) adalah "+Vt+" m/s");
        System.out.println("Jarak yang ditempuh benda (s) adalah "+s+" m");
    }  
}

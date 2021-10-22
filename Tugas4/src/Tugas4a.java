//@author Naufal Ulinnuha

import java.util.Scanner;

public class Tugas4a {
    
    public static final double Hp = 300000;
    public static double p,l,K,H;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang :");
        p = input.nextDouble();
        System.out.print("Masukkan lebar :");
        l = input.nextDouble();
        K = 2*p*l;
        H = K*Hp;
        System.out.println("Total Harga untuk pagar dengan p:"+p+" dan l:"+p+" adalah "+String.format("%.0f", H));
    }
    
}

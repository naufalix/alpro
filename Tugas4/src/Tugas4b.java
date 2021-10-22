//@author Naufal Ulinnuha

import java.util.Scanner;

public class Tugas4b {
    
    public static double uts,uas,ukk,b_uts,b_uas,b_ukk,q1,q2,q3,NA;
    public static void main(String[] args) {
        
        Scanner nilai = new Scanner(System.in);
        System.out.println("----------bobot---------");
        System.out.print("Masukkan bobot uts :");
        b_uts = nilai.nextDouble();
        System.out.print("Masukkan bobot uas :");
        b_uas = nilai.nextDouble();
        System.out.print("Masukkan bobot ukk :");
        b_ukk = nilai.nextDouble();
        
        System.out.println("----------nilai---------");
        System.out.print("Masukkan nilai quiz 1 :");
        q1 = nilai.nextDouble();
        System.out.print("Masukkan nilai quiz 2 :");
        q2 = nilai.nextDouble();
        System.out.print("Masukkan nilai quiz 3 :");
        q3 = nilai.nextDouble();
        System.out.print("Masukkan nilai uts :");
        uts = nilai.nextDouble();
        System.out.print("Masukkan nilai uas :");
        uas = nilai.nextDouble();
        
        ukk = (q1+q2+q3)/3;
        NA = (uts*b_uts + uas*b_uas + ukk*b_ukk);
        
        System.out.println("Nilai Akhir : "+String.format("%.1f", NA));
        
    }
}

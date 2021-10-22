package tugas3;

//@author Naufal Ulinnuha

import java.util.Scanner;

public class Tugas3b {

    public static void main(String[] args) {
        //Deklarasi Variabel
        double b_uts,b_uas,b_ukk,uts,uas,ukk,quiz1,quiz2,quiz3,NA;
        b_uts = 0.15;
        b_uas = 0.15;
        b_ukk = 0.70;
        
        //Algoritma
        Scanner nilai = new Scanner (System.in);
        System.out.println("Menghitung Nilai Akhir");
        System.out.println("Masukkan Nilai UTS");
        uts=nilai.nextDouble();
        System.out.println("Masukkan Nilai UAS");
        uas=nilai.nextDouble();
        System.out.println("Masukkan Nilai Quiz 1");
        quiz1=nilai.nextDouble();
        System.out.println("Masukkan Nilai Quiz 2");
        quiz2=nilai.nextDouble();
        System.out.println("Masukkan Nilai Quiz 3");
        quiz3=nilai.nextDouble();
        
        ukk=((quiz1+quiz2+quiz3)/3);
        NA=((b_uts*uts)+(b_uas*uas)+(b_ukk*ukk));
        
        System.out.print("Nilai Akhir Anda : ");
        System.out.printf("%.2f",NA);
    }
    
}

//@author Naufal Ulinnuha

import java.util.Scanner;

public class Listrik {
    
    public static void main(String[] args) {
        int kwh,kwh_aw,kwh_ak,biaya,bln,tarif;
        
        //Input
        Scanner input = new Scanner(System.in);
        System.out.println("Program penghitungan pemakaian listrik  sederhana");
        System.out.print("Masukkan posisi awal Kwh Meter    : ");
        kwh_aw = input.nextInt();
        System.out.print("Masukkan posisi akhir Kwh Meter   : ");
        kwh_ak = input.nextInt();
        System.out.print("Masukkan beban biaya setiap bulan : ");
        biaya = input.nextInt();
        System.out.print("Masukkan jumlah bulan             : ");
        bln = input.nextInt();
        
        //Proses
        kwh = (kwh_ak - kwh_aw);
        tarif = (kwh*biaya*bln);
        
        //Output
        System.out.println("Tarif listrik selama "+bln+" bulan sebesar Rp "+tarif);
    }   
}

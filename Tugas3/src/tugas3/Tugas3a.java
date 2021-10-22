package tugas3;

//@author Naufal Ulinnuha

import java.util.Scanner;

public class Tugas3a {

    public static void main(String[] args) {
        //Deklarasi Variabel
        int p,l,L,H,Ht;
        Ht = 500000;
        
        //Algoritma
        Scanner Luas = new Scanner(System.in);
        System.out.println("Menghitung Harga Tanah");
        System.out.println("Masukkan Panjang Tanah (dalam meter)");
        p=Luas.nextInt();
        System.out.println("Masukkan Lebar Tanah (dalam meter)");
        l=Luas.nextInt();
        L=(p*l);
        H=(L*Ht);
        System.out.println("Total harga tanah untuk luas : "+L+" adalah Rp. "+H);
    }
    
}

//@author Naufal Ulinnuha
import java.util.Scanner;
public class Praktik1b {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int i,jumlah,cari,found=0;
        System.out.print ("Masukkan jumlah data : ");
        jumlah = input.nextInt();
        int [] a = new int [jumlah];
        
        //memasukkan data
        for(i=0; i<jumlah; i++) {
            System.out.print("Masukkan data ke-"+(i+1)+": ");
            a[i] = input.nextInt();
        }
        System.out.print("Masukkan angka yang ingin dicari : ");
        cari = input.nextInt();
        for(i=0; i<jumlah; i++) {
            if (cari==a[i]){found=found+1;}
            else{found=found;}
        }
        if (found>=1){System.out.println("data ditemukan");}
        else {System.out.println("data tidak ditemukan");}
    }   
}
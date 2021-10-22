//@author Naufal Ulinnuha

import java.util.Scanner;
public class praktik1b {
    public static void main(String[] args) {
        int pilih;
        System.out.print("Masukkan Angka 1-4!");
        Scanner input = new Scanner(System.in);
        pilih = input.nextInt();
        switch (pilih) {
                case 1:
                    System.out.println("Anda memasukkan angka satu");
                break;
                case 2:
                    System.out.println("Anda memasukkan angka dua");
                break;
                case 3:
                    System.out.println("Anda memasukkan angka tiga");
                break;
                case 4:
                    System.out.println("Anda memasukkan angka empat");
                break;
                default:
                    System.out.println("angka yang anda masukkan salah");
                break;
        }
    }  
}

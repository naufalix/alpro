//@author Naufal Ulinnuha

import java.util.Scanner;
public class praktik1b2 {
    public static void main(String[] args) {
        int a,b,hasil,menu;
        System.out.println("Menu :\n"+"1. Penjumlahan\n"+"2. Pengurangan\n"+"3. Perkalian\n"+"4. Pembagian\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka ke-1               : ");
        a = input.nextInt();
        System.out.print("Masukkan angka ke-2               : ");
        b = input.nextInt();
        System.out.print("Masukkan menu pilihan Anda (1-4)  : ");
        menu = input.nextInt();
        switch (menu) {
                case 1: 
                    hasil = a+b;
                    System.out.println("Hasil penjumlahan "+a+" + "+b+" = "+hasil);
                break;
                case 2: 
                    hasil = a-b;
                    System.out.println("Hasil penjumlahan "+a+" - "+b+" = "+hasil);
                break;
                case 3: 
                    hasil = a*b;
                    System.out.println("Hasil perkalian "+a+" x "+b+" = "+hasil);
                break;
                case 4:
                    hasil = a/b;
                    System.out.println("Hasil pembagian "+a+" : "+b+" = "+hasil);
                break;
                default:
                    System.out.println("angka yang anda masukkan salah");
                break;
        }
    }  
}

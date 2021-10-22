//@author Naufal Ulinnuha

import java.util.Scanner;
public class uts1 {
    public static void main(String[] args) { 
        System.out.println("------Menu------");
        System.out.println("1. Penjumlahan \n"+"2. Pengurangan \n"+"3. Perkalian \n"+"4. Pembagian");
        System.out.println("----------------");
        fungsi();
        
    }
    public static void fungsi () {
        int menu,a,b,c,hasil,ulang;
        double cbagi,hasilbagi;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan menu pilihan Anda (1-4)  : ");
        menu = input.nextInt();
        System.out.print("Masukkan bilangan 1               : ");
        a = input.nextInt();
        System.out.print("Masukkan bilangan 2               : ");
        b = input.nextInt();
        switch (menu) {
            case 1: 
                c = a+b;
                hasil = c%2;
                if (hasil==0) {
                    System.out.println("Hasil dari "+a+" + "+b+" = "+c+" merupakan bilangan genap");
                } else {
                    System.out.println("Hasil dari "+a+" + "+b+" = "+c+" merupakan bilangan ganjil");
                }
            break;
            case 2: 
                c = a-b;
                hasil = c%2;
                if (hasil==0) {
                    System.out.println("Hasil dari "+a+" - "+b+" = "+c+" merupakan bilangan genap");
                } else {
                    System.out.println("Hasil dari "+a+" - "+b+" = "+c+" merupakan bilangan ganjil");
                }
            break;
            case 3: 
                c = a*b;
                hasil = c%2;
                if (hasil==0) {
                    System.out.println("Hasil dari "+a+" x "+b+" = "+c+" merupakan bilangan genap");
                } else {
                    System.out.println("Hasil dari "+a+" x "+b+" = "+c+" merupakan bilangan ganjil");
                }
            break;
            case 4: 
                cbagi = a/b;
                hasilbagi = cbagi%2;
                if (hasilbagi==0) {
                    System.out.println("Hasil dari "+a+" : "+b+" = "+cbagi+" merupakan bilangan genap");
                } else {
                    System.out.println("Hasil dari "+a+" : "+b+" = "+cbagi+" merupakan bilangan ganjil");
                }
            break;
            default: 
                System.out.println("Angka yang anda masukkan salah, tidak ada menu dengan nomor "+menu);
            break;
        }   
        System.out.println("Apakah anda ingin mencoba lagi? \n"+"1. Ya\n"+"2. Tidak");
        //Scanner input = new Scanner(System.in);
        ulang = input.nextInt();
        switch (ulang) {
            case 1:
               fungsi();
            break;
            case 2:
                System.out.println("Terima kasih telah menggunakan program ini");
            break;
            default:
                System.out.println("Angka yang anda masukkan salah");
            break;
        }
    }
}
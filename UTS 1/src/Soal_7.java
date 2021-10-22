/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package uts;

import java.util.Scanner;

public class Soal_7 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int MJT,JH,TP,TD,HTP;
     double JTP1,JTP2,JTE,total,d2=0.05,d3=0.1,a=100000,b=120000,c=70000,d1=0.7,e=110000,f=130000;
     
     System.out.println("-------Jenis Tiket-------");
     System.out.println("1. Tiket Reguler");
     System.out.println("2. Tiket Terusan");
     System.out.println("-------------------");
     System.out.print("Masukkan jenis tiket (1/2): ");
     MJT = input.nextInt();
     switch(MJT){
             case 1:
                 System.out.println("-------Jenis Hari-------");
                 System.out.println("1. Weekday");
                 System.out.println("2. Weekend");
                 System.out.println("----------------");
                 System.out.print("masukkan jenis hari (1/2): ");
                 JH = input.nextInt();
                 if (JH==1){
                     System.out.println("-----Harga Tiket Regeler -----");
                     System.out.println("1. Jatim Park 1 -"+(int)(a*d1));
                     System.out.println("2. Jatim Park 2 -"+(int)(b*d1));
                     System.out.println("3. Eco Green Park -"+(int)(c*d1));
                     System.out.println("------------------------------");
                     System.out.print("Masukkan jumlah pembelian tiket Jatim Park 1: ");
                     JTP1 = input.nextInt();
                     System.out.print("Masukkan jumlah pembelian tiket Jatim Park 2: ");
                     JTP2 = input.nextInt();
                     System.out.print("Masukkan jumlah pembelian tiket Eco Green Park: ");
                     JTE = input.nextInt();
                     System.out.println(" "+JTP1+" Jatim Park 1 @ "+(int)(a*d1));
                     System.out.println(" "+JTP2+" Jatim Park 2 @ "+(int)(b*d1));
                     System.out.println(" "+JTE+" Eco Green Park @ "+(int)(c*d1));
                     System.out.println("------------------------------");
                     total= (JTP1*a)+(JTP2*b)+(JTE*c);
                     System.out.println("Total Pembelian : "+total);
                     if(total>=500000 && total<1000000){
                         System.out.print("Total Diskon :-"+total*d2);
                         System.out.println("------------------------------");
                         System.out.print("Total Pembayaran :"+(total-(total*d2)));
                     }else if (total>=1000000){
                         System.out.print("Total Diskon :-"+total*d3);
                         System.out.println("------------------------------");
                         System.out.print("Total Pembayaran :"+(total-(total*d3)));
                     }else {
                         System.out.print("Total Diskon :-"+total*0);
                         System.out.println("------------------------------");
                         System.out.print("Total Pembayaran :"+(total-(total*0)));
                     }
                 }
                 else if(JH==2){
                     System.out.println("-----Harga Tiket Reguler-----");
                     System.out.println("1. Jatim Park 1 -"+(int)a);
                     System.out.println("2. Jatim Park 2 -"+(int)b);
                     System.out.println("3. Eco Green Park -"+(int)c);
                     System.out.println("------------------------------");
                     System.out.print("Masukkan jumlah pembelian tiket Jatim Park 1: ");
                     JTP1 = input.nextInt();
                     System.out.print("Masukkan jumlah pembelian tiket Jatim Park 2: ");
                     JTP2 = input.nextInt();
                     System.out.print("Masukkan jumlah pembelian tiket Eco Green Park: ");
                     JTE = input.nextInt();
                     System.out.println(" "+JTP1+" Jatim Park 1 @ "+(int)a);
                     System.out.println(" "+JTP2+" Jatim Park 2 @ "+(int)b);
                     System.out.println(" "+JTE+" Eco Green Park @ "+(int)c);
                     System.out.println("------------------------------");
                     total= (JTP1*a)+(JTP2*b)+(JTE*c);
                     System.out.println("Total Pembelian : "+total);
                     if(total>=500000 && total<1000000){
                         System.out.print("Total Diskon :-"+total*d2);
                         System.out.println("------------------------------");
                         System.out.print("Total Pembayaran :"+(total-(total*d2)));
                     }else if (total>=1000000){
                         System.out.print("Total Diskon :-"+total*d3);
                         System.out.println("------------------------------");
                         System.out.print("Total Pembayaran :"+(total-(total*d3)));
                     }else {
                         System.out.print("Total Diskon :-"+total*0);
                         System.out.println("------------------------------");
                         System.out.print("Total Pembayaran :"+(total-(total*0)));
                     }
                 }
                 else {
                      System.out.println("Angka yang anda masukkan salah");
                 }
             break;
             
             case 2:
                 System.out.println("-------Jenis Hari-------");
                 System.out.println("1. Weekday");
                 System.out.println("2. Weekend");
                 System.out.println("----------------");
                 System.out.print("masukkan jenis hari (1/2): ");
                 JH = input.nextInt();
                 if (JH==1){
                     System.out.println("-----Harga Tiket Terusan -----");
                     System.out.println("1. Paket 1 (Jatim park 1 dan Predator Fun Park) -"+(int)(e*d1));
                     System.out.println("2. Paket 2 (Jatim Park 1 dan Eco Green Park) -"+(int)(f*d1));
                     System.out.println("------------------------------");
                     System.out.print("Masukkan jumlah pembelian tiket Paket 1: ");
                     JTP1 = input.nextInt();
                     System.out.print("Masukkan jumlah pembelian tiket Paket 2: ");
                     JTP2 = input.nextInt();
                     System.out.println(" "+JTP1+" Paket 1 @ "+(int)(e*d1));
                     System.out.println(" "+JTP2+" Paket 2 @ "+(int)(f*d1));
                 }else if(JH==2){
                     System.out.println("-----Harga Tiket Terusan -----");
                     System.out.println("1. Paket 1 (Jatim park 1 dan Predator Fun Park) -"+(int)e);
                     System.out.println("2. Paket 2 (Jatim Park 1 dan Eco Green Park) -"+(int)f);
                     System.out.println("------------------------------");
                     System.out.print("Masukkan jumlah pembelian tiket Paket 1: ");
                     JTP1 = input.nextInt();
                     System.out.print("Masukkan jumlah pembelian tiket Paket 2: ");
                     JTP2 = input.nextInt();
                     System.out.println(" "+JTP1+" Paket 1 @ "+(int)e);
                     System.out.println(" "+JTP2+" Paket 2 @ "+(int)f);
                }else {
                      System.out.println("Angka yang anda masukkan salah");
                 }
             break;
             default:
                 System.out.println("Angka yang anda masukkan salah");
             break;
     }
    }
}

   
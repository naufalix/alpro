/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package bayu;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class quizno10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //makanan 
        Scanner input = new Scanner(System.in);
        int a,b, rawon1 = 25000, soto1 = 15000, esjeruk1 = 8000, esteh = 5000;
        double total,diskon,pajak,total1;
        System.out.println("-----Menu Makanan-----");
        System.out.println("1. Rawon @ " + rawon1);
        System.out.println("2. soto @ "+ soto1);
        System.out.println("---------------------");
        System.out.print("Masukkan menu makanan (1/2) :");
        a = input.nextInt();
        System.out.print("Masukkan Jumlah Makanan yang dipesan :");
        b = input.nextInt();
        switch (a){
            case 1:
                int c,d;
                System.out.println("-----Menu minuman-----");
        System.out.println("1. Es jeruk @ " + esjeruk1);
        System.out.println("2. Es teh @ "+ esteh);
        System.out.println("---------------------");
        System.out.print("Masukkan menu minuman (1/2) :");
        c = input.nextInt();
        System.out.print("Masukkan Jumlah Minuman yang dipesan :");
        d = input.nextInt();
        switch (c){
            case 1:
                 total = (rawon1*b)+(esjeruk1*d);
        if (total>=100000){
        diskon =  (total * 0.05);
        pajak =  (total - diskon) * 0.1;
        total1 = (total-diskon)+pajak;
        System.out.print("Total yang harus dibayar : " + total1);
        }else{
            System.out.print("tidak ada diskon");
        
        }break;
        
            case 2: 
                 total = (rawon1*b)+(esteh*d);
                 if (total>=100000){
                    diskon =  (total * 0.05);
                    pajak =  (total - diskon) * 0.1;
                    total1 = (total-diskon)+pajak;
                    System.out.print("Total yang harus dibayar : " + total1);
        }else{
            System.out.print("tidak ada diskon");
        
        }break;
        default : 
                System.out.print("angka yang anda masukan salah");
            
                
        
        }
        
           case 2: 
        int e,f;
        System.out.println("-----Menu minuman-----");
        System.out.println("1. Es jeruk @ " + esjeruk1);
        System.out.println("2. Es teh @ "+ esteh);
        System.out.println("---------------------");
        System.out.print("Masukkan menu minuman (1/2) :");
        e = input.nextInt();
        System.out.print("Masukkan Jumlah Minuman yang dipesan :");
        f = input.nextInt();
        switch (e){
            case 1:
                 total = (soto1*b)+(esjeruk1*f);
                if (total>=100000){
                diskon =  (total * 0.05);
                pajak =  (total - diskon) * 0.1;
                total1 = (total-diskon)+pajak;
                System.out.print("Total yang harus dibayar : " + total1);
                }else{
                   System.out.print("tidak ada diskon");
        
                    }break;
           
            case 2: 
                 total = (soto1*b)+(esteh*f);
                if (total>=100000){
                diskon =  (total * 0.05);
                pajak =  (total - diskon) * 0.1;
                total1 = (total-diskon)+pajak;
                System.out.print("Total yang harus dibayar : " + total1);
                }else{
                System.out.print("tidak ada diskon");
        
        }break;
        default : 
                System.out.print("angka yang anda masukan salah");
        
        }
        break;
        default : 
                System.out.print("angka yang anda masukan salah");
        
           
    } 
        
    
    }
}

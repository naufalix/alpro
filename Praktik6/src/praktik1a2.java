//@author Naufal Ulinnuha

import java.util.Scanner;
public class praktik1a2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total,bayar,diskon1=0.1,diskon2=0.15,diskon3=0.2;
        System.out.print("Masukkan total belanja  : ");
        total = input.nextDouble();
        if (total>150000 && total<=300000){
            bayar = total-(total*diskon1);
            System.out.println("Diskon                  : "+String.format("%.0f", (total*diskon1)));
            System.out.println("Total Bayar             : "+String.format("%.0f", bayar));
        } else if (total>300000 && total<=500000){
            bayar = total-(total*diskon2);
            System.out.println("Diskon                  : "+String.format("%.0f", (total*diskon2)));
            System.out.println("Total Bayar             : "+String.format("%.0f", bayar));
        } else if (total>500000){
            bayar = total-(total*diskon3);
            System.out.println("Diskon                  : "+String.format("%.0f", (total*diskon3)));
            System.out.println("Total Bayar             : "+String.format("%.0f", bayar));
        } else {
            bayar = total;
            System.out.println("Diskon                  : 0");
            System.out.println("Total Bayar             : "+String.format("%.0f", bayar));
        }
    }
}

//@author Naufal Ulinnuha

import java.util.Scanner;
public class praktik1a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total,bayar, diskon=0.05;
        System.out.print("Masukkan total belanja :");
        total = input.nextDouble();
        if (total>200000){
            bayar = total-(total*diskon);
            System.out.println("Total belanja Anda :"+bayar);}
        else {
            System.out.println("Total belanja Anda :"+total);
        }
    }
}


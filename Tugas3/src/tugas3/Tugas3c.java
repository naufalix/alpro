package tugas3;

//@author Naufal Ulinnuha

import java.util.Scanner;

public class Tugas3c {
    
    public static void main(String[] args) {
        //Deklarasi Variabel
        int a,b,x,y,z;
        
        //Algoritma
        Scanner nilai = new Scanner (System.in); 
        System.out.println("Menghitung Persamaan Matematika");
        System.out.println("Masukkan Nilai a");
        a=nilai.nextInt();
        System.out.println("Masukkan Nilai b");
        b=nilai.nextInt();
        
        x=(4*b);
        y=(2*a);
        z=(a*x)+(b*y*y);
        
        System.out.println("Nilai x : "+x);
        System.out.println("Nilai y : "+y);
        System.out.println("Nilai z : "+z);
    }
    
}

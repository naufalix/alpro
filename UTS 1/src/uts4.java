//@author Naufal Ulinnuha

import java.util.Scanner;
public class uts4 {
    public static void main(String[] args) {
        int d,d2,d3;
        double r,p,l,t,L,K,V,phi=3.14;
        System.out.println("------Menu------ \n"+"1. 2 Dimensi \n"+"2. 3 Dimensi \n"+"---------------- ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan menu pilihan Anda (1/2):");
        d = sc.nextInt();
        switch (d) {
            case 1 :
                System.out.println("------Menu 2 Dimensi------ \n"+"1. Lingkaran \n"+"2. Persegi \n"+"3. Persegi Panjang \n"+"-------------------------- ");
                System.out.print("Masukkan menu pilihan Anda (1-3):");
                d2 = sc.nextInt();
                switch (d2) {
                    case 1 :
                        System.out.print("Masukkan jari-jari:");
                        r = sc.nextDouble();
                        L = phi*r*r;
                        K = phi*r*2;
                        System.out.println("Lingkaran dengan r:"+r+" memiliki L:"+(float)L+" dan K:"+(float)K);
                    break;
                    case 2 :
                        System.out.print("Masukkan sisi:");
                        p = sc.nextDouble();
                        L = p*p;
                        K = p*4;
                        System.out.println("Persegi dengan s:"+p+" memiliki L:"+L+" dan K:"+K);
                    break;
                    case 3 :
                        System.out.print("Masukkan panjang:");
                        p = sc.nextDouble();
                        System.out.print("Masukkan lebar:");
                        l = sc.nextDouble();
                        L = p*l;
                        K = 2*(p+l);
                        System.out.println("Persegi panjang dengan p:"+p+" dan l:"+l+" memiliki L:"+L+" dan K:"+K);
                    break;
                    default :
                        System.out.println("Maaf, tidak ada menu dengan nomor "+d2);
                    break;
                }
            break;
            case 2 :
                System.out.println("------Menu 2 Dimensi------ \n"+"1. Tabung \n"+"2. Kubus \n"+"3. Balok \n"+"-------------------------- ");
                System.out.print("Masukkan menu pilihan Anda (1-3):");
                d3 = sc.nextInt();
                switch (d3) {
                    case 1 :
                        System.out.print("Masukkan jari-jari:");
                        r = sc.nextDouble();
                        System.out.print("Masukkan tinggi:");
                        t = sc.nextDouble();
                        L = (2*phi*r*r)+(t*(phi*r*2));
                        V = phi*r*r*t;
                        System.out.println("Tabung dengan r:"+r+" dan t:"+t+" memiliki L:"+(float)L+" dan V:"+(float)V);
                    break;
                    case 2 :
                        System.out.print("Masukkan sisi:");
                        p = sc.nextDouble();
                        L = p*p*6;
                        V = p*p*p;
                        System.out.println("Kubus dengan s:"+p+" memiliki L:"+L+" dan V:"+V);
                    break;
                    case 3 :
                        System.out.print("Masukkan panjang:");
                        p = sc.nextDouble();
                        System.out.print("Masukkan lebar:");
                        l = sc.nextDouble();
                        System.out.print("Masukkan tinggi:");
                        t = sc.nextDouble();
                        L = 2*((p*l)+(l*t)+(p*t));
                        V = p*l*t;
                        System.out.println("Balok dengan p:"+p+" l:"+l+" dan t:"+t+" memiliki L:"+L+" dan V:"+V);
                    break;
                    default :
                        System.out.println("Maaf, tidak ada menu dengan nomor "+d3);
                    break;
                }
            break;
            default :
                System.out.println("Maaf, tidak ada menu dengan nomor "+d);
            break;
        }
    }
    
}

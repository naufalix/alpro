//@author Naufal Ulinnuha
import java.util.Scanner;
public class Tugas7bb {
    public static void main (String[] args){
        menu();
    }
    public static void menu(){
        int menu,l,p,r,t;
        double L,phi=3.141592653589793;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu :");
        System.out.println("0 Keluar\n"+"1 Menghitung Luas Persegi Panjang");
        System.out.println("2 Menghitung Luas Lingkaran\n"+"3 Menghitung Luas Segitiga Siku-siku");
        System.out.print("Masukkan pilihan Anda :");
        menu = sc.nextInt();
        if (menu==1){
            System.out.print("Masukkan panjang :"); p = sc.nextInt();
            System.out.print("Masukkan lebar :");   l = sc.nextInt();
            L = p*l;
            System.out.println("Luas Persegi Panjang :"+L); menu();
        }
        else if (menu==2) {
            System.out.print("Masukkan jari-jari :"); r = sc.nextInt();
            L = phi*r*r;
            System.out.println("Luas Lingkaran :"+L); menu();
        }
        else if (menu==3) {
            System.out.print("Masukkan panjang :"); p = sc.nextInt();
            System.out.print("Masukkan tinggi :");  t = sc.nextInt();
            L = (p*t)/2;
            System.out.println("Luat Segitiga :"+L); menu();
        }
        else if (menu==0) {System.out.println("Terimakasih");}
        else {
            System.out.println("Angka yang anda masukkan salah"); menu();
        }
    }
}
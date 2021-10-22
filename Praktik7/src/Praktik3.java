//@author Naufal Ulinnuha
import java.util.Scanner;
public class Praktik3 {
    public static void main(String[] args) {
        int jumlah,i,a,even=0,odd=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu :");
        System.out.print("Masukkan jumlah bilangan : ");
        jumlah = sc.nextInt();
        i=1;
        while (i<=jumlah) {
            System.out.print("Masukkan bilangan ke-"+i+"    : ");
            a = sc.nextInt();
            if (a%2==0){even=even+1; odd=odd;}
            else {even=even; odd=odd+1;}
            i++;
        }
        System.out.println("Jumlah bilangan genap	: "+even);
        System.out.println("Jumlah bilangan ganjil 	: "+odd);
    }  
}
//@author Naufal Ulinnuha
import java.util.Scanner;
public class Praktik2 {
    public static int hasil;
    public static void main(String[] args) {
        int a,i;
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan nilai maksimum : ");
        a = sc.nextInt();
        if (a%2==0) {
            for (i=1;i<=a;i+=2) {System.out.print("+"+i+"-"+(i+1));}
            hasil=(a/-2);
        }
        else {
            System.out.print("+1");
            for (i=3;i<=a;i+=2) {System.out.print("-"+(i-1)+"+"+i);}
            hasil=(a+1)/2;
        }
        System.out.print("="+hasil);
    }
}

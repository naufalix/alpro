//@author Naufal Ulinnuha
import java.util.Scanner;
public class Tugas7a {
    public static void main(String[] args) {
        int n,h,i,j,k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n : ");
        n = sc.nextInt();      
        if (n%2==0) {
            for (h=2;h<=n;h+=2) {
                k=h-1;
                for (i=k;i<=k*k;i+=k)   {System.out.print(i+" ");}
                System.out.println("");
                for (j=1;j<=h;j++)      {System.out.print("*  ");}
                System.out.println("");               
            }  
        }
        else {
            System.out.println("1");
            for (h=3;h<=n;h+=2){
                for (j=1;j<=h-1;j++)    {System.out.print("*  ");}
                System.out.println("");
                for (i=h;i<=h*h;i+=h)   {System.out.print(i+" "); }
                System.out.println("");
            }        
        }
    }
}
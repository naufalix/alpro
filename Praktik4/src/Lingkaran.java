import java.util.Scanner;
public class Lingkaran {
    
    public static final double PHI = 3.14;
    public static double r,L,K; 
    
    public static void main(String[] args) {
        //int jari; 
        //PHI = 22/7;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai jari-jari:");
        r = input.nextInt();
        K = 2*PHI*r;
        L = PHI*r*r;
        System.out.println("Keliling lingkaran dengan r :"+r+" adalah "+K);
        System.out.println("Luas lingkaran dengan r :"+r+" adalah "+L);
    }
}

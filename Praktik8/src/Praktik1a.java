import java.util.Scanner;
public class Praktik1a {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int i, jumlah = 4;
        int [] a = new int [jumlah];
        
        //memasukkan data
        for(i=0; i<jumlah; i++) {
            System.out.print("Masukkan data ke-"+(i+1)+": ");
            a[i] = input.nextInt();
        }
        System.out.println("-------Data Array-------");
        for(i=0; i<jumlah; i++) {
            System.out.println("Data ke-"+(i+1)+" : "+a[i]);
        }
    }   
}

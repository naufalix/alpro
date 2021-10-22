//@author Naufal Ulinnuha
import java.util.Scanner;
public class Praktik2b {
    public static void main (String[] args) {
        int baris,kolom,i,j,k;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris :");
        baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom :");
        kolom = sc.nextInt();
        int A [][] = new int [baris][kolom];
        int B [][] = new int [baris][kolom];
        int C [][] = new int [baris][kolom];
        int D [][] = new int [baris][kolom];
        System.out.println("Himpunan A");
        for (i=0; i<baris; i++){
            for (j=0; j<kolom; j++) {
                System.out.print("Masukkan data A["+i+"]["+j+"] :");
                A [i][j] = sc.nextInt();
            }
        }
        System.out.println("Himpunan B");
        for (i=0; i<baris; i++){
            for (j=0; j<kolom; j++) {
                System.out.print("Masukkan data B["+i+"]["+j+"] :");
                B [i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrik A+B :");
        for(i=0; i<baris; i++){
            for (j=0; j<kolom; j++){
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrik A-B :");
        for(i=0; i<baris; i++){
            for (j=0; j<kolom; j++){
                D[i][j] = A[i][j] - B[i][j];
                System.out.print(D[i][j]+" ");
            }
            System.out.println();
        }
    }
}

//@author Naufal Ulinnuha
import java.util.Scanner;
public class Tugas8b {
    public static void main (String[] args) {
        int baris,kolom,i,j,k,pilih,jumlah=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris :");
        baris = sc.nextInt();
        System.out.print("Masukkan jumlah kolom :");
        kolom = sc.nextInt();
        int A [][] = new int [baris][kolom];
        int B [][] = new int [baris][kolom];
        int C [][] = new int [baris][kolom];
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
        System.out.println("1. Penjumlahan A+B\n"+"2. Pengurangan A-B\n"+"3. Perkalian AxB");
        System.out.print("Masukkan Pilihan Anda 1/2:");
        pilih = sc.nextInt();
        System.out.println("Matrik A :");
        for (i=0; i<baris; i++){
            for (j=0; j<kolom; j++){
                System.out.print(A[i][j]+" ");
                if ((j+1)%kolom==0){System.out.println(""); }
            }
        }
        System.out.println("Matrik B :");
        for (i=0; i<baris; i++){
            for (j=0; j<kolom; j++){
                System.out.print(B[i][j]+" ");
                if ((j+1)%kolom==0){System.out.println(""); }
            }
        }
        if (pilih==1) {
            System.out.println("Matrik A+B :");
            for(i=0; i<baris; i++){
                for (j=0; j<kolom; j++){
                    C[i][j] = A[i][j] + B[i][j];
                    System.out.print(C[i][j]+" ");
                }
            }
        }
        else if (pilih==2) {
            System.out.println("Matrik A-B :");
            for(i=0; i<baris; i++){
                for (j=0; j<kolom; j++){
                    C[i][j] = A[i][j] - B[i][j];
                    System.out.print(C[i][j]+" ");
                }
            }
        }
        else if (pilih==3) {
            System.out.println("Matrik AxB :");
            for(i=0; i<baris; i++){
                for (j=0; j<kolom; j++){
                    for (k=0; k<baris; k++){
                        jumlah = jumlah + A[i][k]*B[k][j];
                    }
                    C[i][j] = jumlah;
                    jumlah = 0;
                }
            }
            if (baris==kolom) {
                for (i=0; i<baris; i++) {
                    for (j=0; j<kolom; j++) {
                        System.out.print(C[i][j]+" ");
                        if ((j+1)%kolom==0){System.out.println(""); }
                    }
                }
            }
            else {System.out.println("Matrik tidak bisa dikalikan karena jumlah baris Matrik A \n"
                    + "tidak sama dengan jumlah kolom Matrik B atau sebaliknya");
            }
        }
    }
}
//@author Naufal Ulinnuha
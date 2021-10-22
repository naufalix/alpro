//@author Naufal Ulinnuha
import java.util.Scanner;
public class Tugas8a {
    public static void main (String[] args){
        int jumlah,i,j,stop=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen dalam array :");
        jumlah = sc.nextInt();
        int A [] = new int[jumlah];
        for (i=0;i<jumlah;i++){
            System.out.print("Masukkan data elemen ke-"+(i+1)+" :");
            A[i] = sc.nextInt();
        }
        System.out.println("");
        System.out.println("Data yang terurut :");
        for (i=0;i<1000000000;i++){
            for (j=0;j<jumlah;j++) {
                if (i==A[j]){System.out.print(i+" ");stop=stop+1;}
                else {stop=stop;}
            }
            if (stop==jumlah){break;}
        }
        System.out.println("");
    }
}
//@author Naufal Ulinnuha
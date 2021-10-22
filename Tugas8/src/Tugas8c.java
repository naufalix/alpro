//@author Naufal Ulinnuha
import java.util.Scanner;
public class Tugas8c {
    public static void main(String[] args) {
        int a,b,i,j,stop=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah anggota A : ");
        a = sc.nextInt();
        System.out.println("Masukkan anggota A");
        int A[] = new int [a];
        for (i=0; i<a; i++) {
            System.out.print("Masukkan anggota A ke-"+(i+1)+": ");
            A [i] = sc.nextInt();
        }
        System.out.print("Masukkan jumlah anggota B : ");
        
        b = sc.nextInt();
        System.out.println("Masukkan anggota B");
        int B[] = new int [b];
        for (i=0; i<b; i++) {
            System.out.print("Masukkan anggota B ke-"+(i+1)+": ");
            B [i] = sc.nextInt();
        }
        
        System.out.print("Anggota A : {");
        int ax=0, ay=0;
        int A2[] = new int [a];
        int A3[] = new int [a];
        //mengurutkan anggota A sebagai A2
        for(i=0; i<1000000000; i++) {
            for (j=0; j<a; j++) {
                if (i==A[j]) {A2[ax]=i; ax++; stop++;}
            }if (stop==a){break;}
        }stop=0;
        //menghapus nilai array A2 yang sama sebagai A3
        for (i=0; i<ax; i++) {
            if (i==0) {A3[ay]=A2[i]; ay++;}
            else if (i>0) {if (A2[i]!=A2[i-1]){A3[ay]=A2[i]; ay++;}}
        }
        //print anggota A3
        for(i=0; i<ay; i++){
            if (i==0){System.out.print(A3[i]);}
            else {System.out.print(", "+A3[i]);}
        }System.out.println("}");
                                                             //////Pembatas//////              
        System.out.print("Anggota B : {");
        int bx=0;
        int B2[] = new int [b];
        //mengurutkan anggota B sebagai B2
        for(i=0; i<1000000000; i++) {
            for (j=0; j<b; j++) {
                if (i==B[j]) {B2[bx]=i; bx++; stop++;}
            }if (stop==b){break;}
        }stop=0;
        //print anggota B2
        for(i=0; i<b; i++){
            if (i==0){System.out.print(B2[i]);}
            else {System.out.print(", "+B2[i]);}
        }System.out.println("}");
                                                            //////Pembatas//////
        System.out.print("Anggota C (gabungan) : {");
        int c=(a+b),cx=a,cy=0, cz=0;
        int C[]= new int[c];
        int C2[]= new int[c];
        int C3[]= new int[c];
        //mengisi array C
        for(i=0; i<a; i++){C[i]=A[i];}
        for(i=0; i<b; i++){C[cx]=B[i];cx=cx+1;}
        //mengurutkan array C sebagai C2
        for (i=0;i<1000000000;i++){
            for (j=0;j<c;j++) {
                if (i==C[j]){C2[cy]=C[j];cy++;stop++;}
            }
            if (stop==c){break;}
        }stop=0;
        //menghapus nilai array C2 yang sama sebagai C3
        System.out.print(C2[0]+", ");
        for (i=1; i<cy; i++) {
            if (C2[i]!=C2[i-1]){C3[cz]=C2[i]; cz++;}
        }
        //print C3
        for (i=0; i<cz; i++) {
            if (i==0){System.out.print(C3[i]);}
            else {System.out.print(", "+C3[i]);}
        }System.out.println("}");
                                                            //////Pembatas//////
        System.out.print("Anggota D (irisan) : {");
        int d=0,dx=0, dy=0;
        int D[]= new int[c];
        int D2[] = new int [100000];
        int D3[] = new int [100000];
        //mengisi array D
        for(i=0; i<a; i++){
            for (j=0; j<b; j++) {
                if (A[i]==B[j]) {D[d]=A[i];d++;}
            }
        }//@author Naufal Ulinnuha
        //mengurutkan array D sebagai D2
        for (i=0; i<1000000000; i++) {
            for (j=0; j<d; j++) {
                if (i==D[j]){D2[dx]=D[j];dx++;stop++;}
            }
            if (stop==d){break;}
        }stop=0;
        //menghapus nilai array D2 yang sama sebagai D3
        for (i=0; i<d; i++) {
            if (i==0) {D3[dy]=D2[i]; dy++;}
            else if (i>0) {if (D2[i]!=D2[i-1]){D3[dy]=D2[i]; dy++;}}
        }
        //print D3
        for (i=0; i<dy; i++) {
            if (i==0){System.out.print(D3[i]);}
            else {System.out.print(", "+D3[i]);}
        }
        System.out.println("}");
                                                            //////Pembatas//////
        System.out.print("Anggota E (selisih) : {");
        int e=ay, ex=ay+dy, ey=0;
        int E[]= new int[ex];
        int E2[]= new int[ex];
        //gabungan A3 dengan D3 sebagai E
        for (i=0; i<ay; i++){E[i]=A3[i];}
        for (i=0; i<dy; i++){E[e]=D3[i]; e++;}
        //mengurutkan array E sebagai E2
        for (i=0; i<1000000000; i++) {
            for (j=0; j<ex; j++) {
                if (i==E[j]){E2[ey]=E[j];ey++;stop++;}
            }
            if (stop==ex){break;}
        }
        //print nilai E2 yang tidak kembar
        for (i=0; i<ey; i++){
            if (i==0){
                if (E2[i]!=E2[i+1]) {System.out.print(E2[i]);}
            }
            else if (i>0&&i<ey-1) {
                if (E2[i]!=E2[i-1]&&E2[i]!=E2[i+1]) {System.out.print(", "+E2[i]);}
            }
            else if (i==ey-1) {
                if (E2[i]!=E2[i-1]) {System.out.print(", "+E2[i]);}
            }
        }System.out.println("}");
                                                            //////Pembatas//////
        System.out.print("Anggota F (perbedaan simetris) : {");
        //print nilai C2 yang tidak kembar
        for (i=0; i<cy; i++){
            if (i==0){
                if (C2[i]!=C2[i+1]) {System.out.print(C2[i]);}
            }
            else if (i>0&&i<cy-1) {
                if (C2[i]!=C2[i-1]&&C2[i]!=C2[i+1]) {System.out.print(", "+C2[i]);}
            }
            else if (i==cy-1) {
                if (C2[i]!=C2[i-1]) {System.out.print(", "+C2[i]);}
            }
        }System.out.println("}");
                                                            //////Pembatas//////
    }
}
//Test Sample :
//Anggota A = 8 : {1, 2, 1, 3, 5, 4, 7, 6}
//Anggota B = 8 : {2, 8, 7, 6, 9, 90, 11, 23}

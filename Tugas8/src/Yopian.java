import java.util.Scanner;
public class Yopian {
    
    public static void main(String[] args) {
        int xa, xb, i, j;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah Aggota A : ");
        xa = input.nextInt();
        int [] A = new int[xa];
        System.out.println("Masukkan anggota A");
        for(i=0;i<xa;i++){
            System.out.print("Masukkan anggota A ke -"+(i+1)+" :");
            A[i] = input.nextInt();
        }
        System.out.print("MAsukkan jumlah Anggota B :");
        xb = input.nextInt();
        int [] B = new int [xb];
        System.out.println("Masukkan anggota B");
        for(i=0;i<xb;i++){
            System.out.print("Masukkan anggota B ke -"+(i+1)+" :");
            B[i] = input.nextInt();
        }
        
        for(i=0;i<1;i++){
            System.out.print("Anggota A : {");
            for(i=0;i<xa;i++){
                System.out.print(A[i]);
                if(i<A.length-1){
                    System.out.print(", ");
                }else {
                    System.out.print("}");
                }
            }
        }
        System.out.println("");
        for(i=0;i<1;i++){
            System.out.print("Anggota B : {");
            for(i=0;i<xb;i++){
                System.out.print(B[i]);
                if(i<B.length-1){
                    System.out.print(", ");
                }else {
                    System.out.print("}");
                }
            }
        }
        System.out.println("");
        //urut Asc
        int asa,asb;
        for(i=0;i<xa;i++){
            for(j=xa-1;j>i;j--){
                if(A[j]<A[j-1]){
                    asa = A[j];
                    A[j]=A[j-1];
                    A[j-1]=asa;
                }
            }
        }
        for(i=0;i<xb;i++){
            for(j=xb-1;j>i;j--){
                if(B[j]<B[j-1]){
                    asb = B[j];
                    B[j]=B[j-1];
                    B[j-1]=asb;
                }
            }
        }
        
        //gabungan & irisan + perbedaan simetris
        int [] C = new int [A.length+B.length];
        int [] D = new int [A.length+B.length];
        if(xa<xb){
            for(i=0;i<xa;i++){
                for(j=0;j<xb;j++){
                    if(A[i]==B[j]){
                        C[i]=A[i];
                    }
                }
            }
        }else{
           for(i=0;i<xa;i++){
                for(j=0;j<xb;j++){
                    if(A[i]==B[j]){
                        C[i]=A[i];
                    }
                }
            }
        }
        if(xa<xb){
            for(i=0;i<xb;i++){
                for(j=0;j<xa;j++){
                    if(B[i]==A[j]){
                        D[i]=B[i];
                    }
                }
            }
        }else{
            for(i=0;i<xb;i++){
                for(j=0;j<xa;j++){
                    if(B[i]==A[j]){
                        D[i]=B[i];
                    }
                }
            }
        }
        
        //gabungan
        System.out.print("Anggota C (gabungan) : {");
        for(i=0;i<A.length;i++){
            if(C[i]==0){
                System.out.print(A[i]+", ");
            } else{
                System.out.print(A[i]+", ");
            }
        }
        for(i=0;i<B.length;i++){
            if(D[i]==0){
                System.out.print(B[i]);
                if(i<B.length-1){
                    System.out.print(", ");
                }else {
                    System.out.print("}");
                }
            }
        }
        System.out.println("");
        //irisan
        System.out.print("Anggota D (irisan) : {");
        for(i=0;i<C.length;i++){
            if(C[i]==0){
            }else{
                System.out.print(C[i]+", ");
            }
        }
        System.out.println("}");
        //selisih
        int [] Ab = new int [A.length+B.length];
        int xE=0,xe;
        System.out.print("Anggota E (selisih) : {");
        for(i=0;i<xa;i++){
            xe = 0;
            for(j=0;j<xb;j++){
                if(A[i]==B[j]){
                    xe=1;
                }
            }
            if(xe==0){
                Ab[xE]=A[i];
                xE=xE+1;
            }
        }
        for(i=0;i<xE;i++){
            System.out.print(Ab[i]);
            if(i<xE-1){
                System.out.print(", ");
            }else{
                System.out.print("}");
            }
        }
        System.out.println("");
        //perbedaan simetris
        System.out.print("Anggota F (perbedaan simetris) : {");
        for(i=0;i<A.length;i++){
            if(C[i]==0){
                System.out.print(A[i]+", ");
            }
        }
        for(i=0;i<B.length;i++){
            if(D[i]==0){
                System.out.print(B[i]);
                if(i<B.length-1){
                    System.out.print(", ");
                }else{
                    System.out.print("}");
                }
            }
        }
        System.out.println("");
    }
}
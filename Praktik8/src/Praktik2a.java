public class Praktik2a {
    public static void main (String[] args) {
        int baris=2,kolom=2,i,j,k;
        int A [][] = {{6,3},{4,2}};
        int B [][] = {{3,2},{2,1}};
        int C [][] = new int [2][2];
        //operasi penjumlahan
        for(i=0; i<baris; i++){
            for(j=0; j<kolom; j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Matrik A :");
        for (i=0; i<baris; i++) {
            for (j=0; j<kolom; j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrik A :");
        for (i=0; i<baris; i++) {
            for (j=0; j<kolom; j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrik A+B :");
        for (j=0; j<baris; j++) {
            for (i=0; i<kolom; i++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}

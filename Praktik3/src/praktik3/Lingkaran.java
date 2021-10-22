package praktik3;

//@author Naufal Ulinnuha
public class Lingkaran {
    //ini adalah program menghitung luas lingkaran
    public static double PHI = 3.14;
    public static double r,L;
    public static void main(String[] args) {
        r = 10;
        L = PHI * r * r;
        System.out.println("Luas dengan r "+r+" adalah "+L);
    }   
}
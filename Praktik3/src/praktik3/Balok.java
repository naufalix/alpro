package praktik3;

//@author Naufal Ulinnuha
public class Balok {
    //ini adalah program untuk menghitung luas balok
    public static double L,V,p,l,t;
    public static void main(String[] args) {
        p = 10;
        l = 6;
        t = 8;
        //menghitung luas
        L = (2*p*l)+(2*p*t)+(2*t*l);
        //menghitung volume
        V = p*l*t;
        System.out.println("Balok dengan p:"+p+", l:"+l+", t:"+t+" memiliki ");
        System.out.println("Luas : "+L);
        System.out.println("Volume : "+V);
    }   
}
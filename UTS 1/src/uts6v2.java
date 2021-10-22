//@author Naufal Ulinnuha

import java.util.Scanner;
public class uts6v2 {
    public static void main(String[] args) {
        int m,f,d,record ;
        double jf,jd,h,ht,htd,htp,diskon,tax;
        String f2,d2,S="Soto",B="Bakso",R="Rawon",T="Es Teh",J="Es Jeruk",X="End";
        System.out.println("------------Menu----------- \n"+"1. Makanan \n"+"2. Minuman \n"+"3. Makanan dan Minuman \n"+"--------------------------- ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jenis pesanan (1-3):");
        m = sc.nextInt();
        
        
        
        switch (m){
            case 1:
                System.out.println("--------Menu Makanan------- \n"+"1. Soto     15.000 \n"+"2. Bakso    20.000 \n"+"3. Rawon    25.000 \n"+"--------------------------- ");
                System.out.print("Masukkan pesanan makanan (1-3):");
                f = sc.nextInt();
                if      (f==1) {f2=S; h=15000;}
                else if (f==2) {f2=B; h=20000;}
                else if (f==3) {f2=R; h=25000;}
                else    {System.out.println("Angka yang anda masukkan salah");}
//                System.out.print("Masukkan jumlah pesanan "+f2+" : "); jf=sc.nextDouble(); ht=h*jf;
//                        if (ht>100000){diskon=0.05*ht;} else {diskon=0;} htd=ht-diskon; tax=htd*0.1; htp=htd+tax;
//                        System.out.println(jf+" "+f2+" @"+h);
//                        System.out.println("------------------------------- ");
//                        System.out.println("Total Pembelian     : "+ht);
//                        System.out.println("Total Diskon        : -"+diskon);
//                        System.out.println("Total Pajak         : +"+tax);
//                        System.out.println("------------------------------- ");
//                        System.out.println("Total Pembayaran    : "+htp);
                
            break;
            case 2:
                System.out.println("--------Menu Minuman-------- \n"+"1. Es Teh   5.000 \n"+"2. Es Jeruk 8.000 \n"+"--------------------------- ");
                System.out.print("Masukkan pesanan minuman (1-2):");
                d = sc.nextInt();
                if      (d==1) {d2=T; h=5000;  System.out.println("Masukkan jumlah pesanan "+d2+" : "); jd=sc.nextDouble(); ht=h*jd;}
                else if (d==2) {d2=J; h=8000;  System.out.println("Masukkan jumlah pesanan "+d2+" : "); jd=sc.nextDouble(); ht=h*jd;}
                else    {System.out.println("Angka yang anda masukkan salah");}
//                System.out.println("harga total"+ht);
            break;
            case 3:
                
            break;
            default:
                
            break;
        }
        
        
        
    }
    
}

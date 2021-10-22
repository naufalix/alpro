//@author Naufal Ulinnuha

import java.util.Scanner;
public class uts6 {
    
    public static int m,f,d,fd;
    public static double jf,jd,h,ht,htd,htp,htdd,htfd,diskon,tax,hd,xd,xp;
    public static String f2,d2,S="Soto",B="Bakso",R="Rawon",T="Es Teh",J="Es Jeruk";
    public static void main(String[] args) {

        System.out.println("------------Menu----------- \n"+"1. Makanan \n"+"2. Minuman \n"+"3. Makanan dan Minuman \n"+"--------------------------- ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jenis pesanan (1-3):");
        m = sc.nextInt();
        
        
        
        switch (m){
            case 1:
                System.out.println("--------Menu Makanan------- \n"+"1. Soto     15.000 \n"+"2. Bakso    20.000 \n"+"3. Rawon    25.000 \n"+"--------------------------- ");
                System.out.print("Masukkan pesanan makanan (1-3):");
                f = sc.nextInt();
                if      (f==1) {f2=S; h=15000;  System.out.print("Masukkan jumlah pesanan "+f2+" : "); jf=sc.nextDouble(); ht=h*jf;
                        if (ht>100000){diskon=0.05*ht;} else {diskon=0;} htd=ht-diskon; tax=htd*0.1; htp=htd+tax;
                        System.out.println(jf+" "+f2+" @"+h);
                        System.out.println("------------------------------- ");
                        System.out.println("Total Pembelian     : "+ht);
                        System.out.println("Total Diskon        : -"+diskon);
                        System.out.println("Total Pajak         : +"+tax);
                        System.out.println("------------------------------- ");
                        System.out.println("Total Pembayaran    : "+htp);}
                else if (f==2) {f2=B; h=20000;  System.out.print("Masukkan jumlah pesanan "+f2+" : "); jf=sc.nextDouble(); ht=h*jf;
                        if (ht>100000){diskon=0.05*ht;} else {diskon=0;} htd=ht-diskon; tax=htd*0.1; htp=htd+tax;
                        System.out.println(jf+" "+f2+" @"+h);
                        System.out.println("------------------------------- ");
                        System.out.println("Total Pembelian     : "+ht);
                        System.out.println("Total Diskon        : -"+diskon);
                        System.out.println("Total Pajak         : +"+tax);
                        System.out.println("------------------------------- ");
                        System.out.println("Total Pembayaran    : "+htp);}
                else if (f==3) {f2=R; h=25000;  System.out.print("Masukkan jumlah pesanan "+f2+" : "); jf=sc.nextDouble(); ht=h*jf;
                        if (ht>100000){diskon=0.05*ht;} else {diskon=0;} htd=ht-diskon; tax=htd*0.1; htp=htd+tax;
                        System.out.println(jf+" "+f2+" @"+h);
                        System.out.println("------------------------------- ");
                        System.out.println("Total Pembelian     : "+ht);
                        System.out.println("Total Diskon        : -"+diskon);
                        System.out.println("Total Pajak         : +"+tax);
                        System.out.println("------------------------------- ");
                        System.out.println("Total Pembayaran    : "+htp);}
                else    {System.out.println("Angka yang anda masukkan salah");}
            break;
            case 2:
                System.out.println("--------Menu Minuman-------- \n"+"1. Es Teh   5.000 \n"+"2. Es Jeruk 8.000 \n"+"--------------------------- ");
                System.out.print("Masukkan pesanan minuman (1-2):");
                d = sc.nextInt();
                if      (d==1) {d2=T; h=5000;  System.out.print("Masukkan jumlah pesanan "+d2+" : "); jd=sc.nextDouble(); ht=h*jd;
                        if (ht>100000){diskon=0.05*ht;} else {diskon=0;} htd=ht-diskon; tax=htd*0.1; htp=htd+tax;
                        System.out.println(jd+" "+d2+" @"+h);
                        System.out.println("------------------------------- ");
                        System.out.println("Total Pembelian     : "+ht);
                        System.out.println("Total Diskon        : -"+diskon);
                        System.out.println("Total Pajak         : +"+tax);
                        System.out.println("------------------------------- ");
                        System.out.println("Total Pembayaran    : "+htp);}
                else if (d==2) {d2=J; h=8000;  System.out.print("Masukkan jumlah pesanan "+d2+" : "); jd=sc.nextDouble(); ht=h*jd;
                        if (ht>100000){diskon=0.05*ht;} else {diskon=0;} htd=ht-diskon; tax=htd*0.1; htp=htd+tax;
                        System.out.println(jd+" "+d2+" @"+h);
                        System.out.println("------------------------------- ");
                        System.out.println("Total Pembelian     : "+ht);
                        System.out.println("Total Diskon        : -"+diskon);
                        System.out.println("Total Pajak         : +"+tax);
                        System.out.println("------------------------------- ");
                        System.out.println("Total Pembayaran    : "+htp);}
                else    {System.out.println("Angka yang anda masukkan salah");}
            break;
            case 3:
                System.out.println("--------Menu Makanan------- \n"+"1. Soto     15.000 \n"+"2. Bakso    20.000 \n"+"3. Rawon    25.000 \n"+"--------------------------- ");
                System.out.print("Masukkan pesanan makanan (1-3):");
                f = sc.nextInt();
                if      (f==1) {f2=S; h=15000; System.out.print("Masukkan jumlah pesanan "+f2+" : "); jf=sc.nextDouble(); ht=h*jf;
                        drink(); htfd=ht+htdd; if (htfd>100000){diskon=0.05*htfd;} else {diskon=0;} xd=htfd-diskon; tax=xd*0.1; xp=xd+tax; 
                        System.out.println(jf+" "+f2+" @"+h);
                        System.out.println(jd+" "+d2+" @"+hd);
                        System.out.println("------------------------------- ");
                        System.out.println("Total Pembelian     : "+htfd);
                        System.out.println("Total Diskon        : -"+diskon);
                        System.out.println("Total Pajak         : +"+tax);
                        System.out.println("------------------------------- ");
                        System.out.println("Total Pembayaran    : "+xp);
                }
                else if (f==2) {f2=B; h=20000; System.out.print("Masukkan jumlah pesanan "+f2+" : "); jf=sc.nextDouble(); ht=h*jf;
                        drink(); htfd=ht+htdd; if (htfd>100000){diskon=0.05*htfd;} else {diskon=0;} xd=htfd-diskon; tax=xd*0.1; xp=xd+tax; 
                        System.out.println(jf+" "+f2+" @"+h);
                        System.out.println(jd+" "+d2+" @"+hd);
                        System.out.println("------------------------------- ");
                        System.out.println("Total Pembelian     : "+htfd);
                        System.out.println("Total Diskon        : -"+diskon);
                        System.out.println("Total Pajak         : +"+tax);
                        System.out.println("------------------------------- ");
                        System.out.println("Total Pembayaran    : "+xp);
                }
                else if (f==3) {f2=R; h=25000; System.out.print("Masukkan jumlah pesanan "+f2+" : "); jf=sc.nextDouble(); ht=h*jf;
                        drink(); htfd=ht+htdd; if (htfd>100000){diskon=0.05*htfd;} else {diskon=0;} xd=htfd-diskon; tax=xd*0.1; xp=xd+tax; 
                        System.out.println(jf+" "+f2+" @"+h);
                        System.out.println(jd+" "+d2+" @"+hd);
                        System.out.println("------------------------------- ");
                        System.out.println("Total Pembelian     : "+htfd);
                        System.out.println("Total Diskon        : -"+diskon);
                        System.out.println("Total Pajak         : +"+tax);
                        System.out.println("------------------------------- ");
                        System.out.println("Total Pembayaran    : "+xp);
                }
                else    {System.out.println("Tdak ada menu dengan nomor"+f);}
            break;
            default:
                System.out.println("Angka yang anda masukkan salah");
            break;
        }     
    }
    public static double drink(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Menu Minuman-------- \n"+"1. Es Teh   5.000 \n"+"2. Es Jeruk 8.000 \n"+"--------------------------- ");
        System.out.print("Masukkan pesanan minuman (1-2):");
        d = sc.nextInt();
                if      (d==1) {d2=T; hd=5000;  System.out.print("Masukkan jumlah pesanan "+d2+" : "); jd=sc.nextDouble(); htdd=hd*jd;
                        if (ht>100000){diskon=0.05*ht;} else {diskon=0;} htd=ht-diskon; tax=htd*0.1; htp=htd+tax;
                }
                else if (d==2) {d2=J; hd=8000;  System.out.print("Masukkan jumlah pesanan "+d2+" : "); jd=sc.nextDouble(); htdd=hd*jd;
                        if (ht>100000){diskon=0.05*ht;} else {diskon=0;} htd=ht-diskon; tax=htd*0.1; htp=htd+tax;
                }
                else    {System.out.println("Tidak ada menu dengan nomor "+d);}
        return htdd;
    }
}


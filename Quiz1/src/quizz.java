//@author Naufal Ulinnuha

import java.util.Scanner;
public class quizz {
    public static double hfr=25000,hfs=15000,hdj=8000,hdt=5000;
    public static double mf,jf,md,jd,hf,hd,total,d,diskon,hargadiskon,pajak,bayar;
    public String r="Rawon",s="Soto",j="Es Jeruk",t="Es Teh";
    public static void main(String[] args) {
        int benar;
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Menu Makanan-----\n"+"1. Rawon @ 25.000\n"+"2. Soto @ 15.000");
        System.out.print("Masukkan menu makanan (1/2) :");
        mf = sc.nextDouble();
        System.out.print("Masukkan Jumlah Makanan yang dipesan :");
        jf = sc.nextDouble();
        
        System.out.println("-----Menu Minuman-----\n"+"1. Es Jeruk @ 8.000\n"+"2. Es Teh @ 5.000\n"+"----------------------");
        System.out.print("Masukkan menu minuman (1/2) :");
        md = sc.nextDouble();
        System.out.print("Masukkan Jumlah Minuman yang dipesan :");
        jd = sc.nextDouble();
        
        if      (mf==1 && md==0){hf=hfr; hd=0;   benar=1;}
        else if (mf==1 && md==1){hf=hfr; hd=hdj; benar=1;}
        else if (mf==1 && md==2){hf=hfr; hd=hdt; benar=1;}
        else if (mf==2 && md==0){hf=hfs; hd=0;   benar=1;}
        else if (mf==2 && md==1){hf=hfs; hd=hdj; benar=1;}
        else if (mf==2 && md==2){hf=hfs; hd=hdt; benar=1;}
        else if (mf==0 && md==0){hf=0; hd=0;     benar=1;}
        else if (mf==0 && md==1){hf=0; hd=hdj;   benar=1;}
        else if (mf==0 && md==2){hf=0; hd=hdt;   benar=1;}
        else    {benar=0;}
        
        switch (benar) {
            case 1 :
                total = ((hf*jf)+(hd*jd));
                if (total>100000){d=0.05;} else {d=0;} diskon=total*d;
                hargadiskon = total-diskon;
                bayar = hargadiskon+(hargadiskon*0.1);
                System.out.println("Total yang harus dibayar : "+bayar);
            break;
            default :
                System.out.println("Angka yang anda masukkan salah");
            break;
        }   
    }
}

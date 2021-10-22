//@author Naufal Ulinnuha

import java.util.Scanner;
public class uts7 {
    public static void main(String[] args) {
        int jt,jh;
        double jp1=100000,jp2=120000,egp=70000,p1=110000,p2=130000;             //Tiket Weekend
        double f=0.7,jp1d=jp1*f,jp2d=jp2*f,egpd=egp*f,p1d=p1*f,p2d=p2*f;        //Tiket Weekday
        double j1,j2,j3, jp1x,jp2x,egpx,p1x,p2x, ht,diskon,td,tp;               //Templating
        String nt,nh,a="Jatim Park 1",b="Jatim Park 2",c="Eco Green Park",d="Paket 1 (Jatim park 1 dan Predator Fun Park)",e="Paket 2 (Jatim Park 1 dan Eco Green Park)";  //Templating
        String line1="------------------------- ",line2="------------------------------- ",line3="---------------------------------- ";
        Scanner sc = new Scanner(System.in);
        System.out.println("------Jenis Tiket------ \n"+"1. Tiket Reguler \n"+"2. Tiket Terusan \n"+line1);
        System.out.print("Masukkan jenis tiket (1/2):");
        jt = sc.nextInt();
        System.out.println("------Jenis Hari------ \n"+"1. Weekday \n"+"2. Weekend \n"+line1);
        System.out.print("Masukkan jenis hari (1/2):");
        jh = sc.nextInt();
        
        if (jt==1&&jh==1) {nt="Tiket Reguler"; nh="Weekday"; jp1x=jp1d; jp2x=jp2d; egpx=egpd;
            System.out.println("------Harga "+nt+"------ \n"+"1. "+a+"     -"+jp1x+" \n"+"2. "+b+"     -"+jp2x+" \n"+"3. "+c+"   -"+egpx+" \n" +line2);
            System.out.print("Masukkan jumlah pembelian tiket "+a+":");   j1=sc.nextInt();
            System.out.print("Masukkan jumlah pembelian tiket "+b+":");   j2=sc.nextInt();
            System.out.print("Masukkan jumlah pembelian tiket "+c+":");   j3=sc.nextInt();
            System.out.println(j1+" "+a+"   @ "+jp1x+" \n" +j2+" "+b+"   @ "+jp2x+" \n" +j3+" "+c+" @ "+egpx+" \n" +line3);
            ht=(j1*jp1x)+(j2*jp2x)+(j3*egpx); if (ht>=500000&&ht<1000000){diskon=0.05;} else if(ht>=1000000){diskon=0.1;} else {diskon=0;} td=ht*diskon; tp=ht-td;
            System.out.println("Total Pembelian         : "+ht);
            System.out.println("Total Diskon            : -"+td+"\n"+line3);
            System.out.println("Total Pembayaran        : "+tp);
        }
        else if (jt==1&&jh==2) {nt="Tiket Reguler"; nh="Weekend"; jp1x=jp1; jp2x=jp2; egpx=egp;
            System.out.println("------Harga "+nt+"------ \n"+"1. "+a+"     -"+jp1x+" \n"+"2. "+b+"     -"+jp2x+" \n"+"3. "+c+"   -"+egpx+" \n" +line2);
            System.out.print("Masukkan jumlah pembelian tiket "+a+":");   j1=sc.nextInt();
            System.out.print("Masukkan jumlah pembelian tiket "+b+":");   j2=sc.nextInt();
            System.out.print("Masukkan jumlah pembelian tiket "+c+":");   j3=sc.nextInt();
            System.out.println(j1+" "+a+"   @ "+jp1x+" \n" +j2+" "+b+"   @ "+jp2x+" \n" +j3+" "+c+" @  "+egpx+" \n" +line3);
            ht=(j1*jp1x)+(j2*jp2x)+(j3*egpx); if (ht>=500000&&ht<1000000){diskon=0.05;} else if(ht>=1000000){diskon=0.1;} else {diskon=0;} td=ht*diskon; tp=ht-td;
            System.out.println("Total Pembelian         : "+ht);
            System.out.println("Total Diskon            : -"+td+"\n"+line3);
            System.out.println("Total Pembayaran        : "+tp);
        }
        else if (jt==2&&jh==1) {nt="Tiket Terusan"; nh="Weekday"; p1x=p1d; p2x=p2d;
            System.out.println("------Harga "+nt+"------ \n"+"1. "+d+"     -"+p1x+" \n"+"2. "+e+"     -"+p2x+" \n" +line2);
            System.out.print("Masukkan jumlah pembelian tiket "+d+":");   j1=sc.nextInt();
            System.out.print("Masukkan jumlah pembelian tiket "+e+":");   j2=sc.nextInt();
            System.out.println(j1+" "+d+"   @ "+p1x+" \n" +j2+" "+e+"   @ "+p2x+" \n" +line3);
            ht=(j1*p1x)+(j2*p2x); if (ht>=500000&&ht<1000000){diskon=0.05;} else if(ht>=1000000){diskon=0.1;} else {diskon=0;} td=ht*diskon; tp=ht-td;
            System.out.println("Total Pembelian         : "+ht);
            System.out.println("Total Diskon            : -"+td+"\n"+line3);
            System.out.println("Total Pembayaran        : "+tp);
        }
        else if (jt==2&&jh==2) {nt="Tiket Terusan"; nh="Weekend"; p1x=p1; p2x=p2;
            System.out.println("------Harga "+nt+"------ \n"+"1. "+d+"     -"+p1x+" \n"+"2. "+e+"     -"+p2x+" \n" +line2);
            System.out.print("Masukkan jumlah pembelian tiket "+d+":");   j1=sc.nextInt();
            System.out.print("Masukkan jumlah pembelian tiket "+e+":");   j2=sc.nextInt();
            System.out.println(j1+" "+d+"   @ "+p1x+" \n" +j2+" "+e+"   @ "+p2x+" \n" +line3);
            ht=(j1*p1x)+(j2*p2x); if (ht>=500000&&ht<1000000){diskon=0.05;} else if(ht>=1000000){diskon=0.1;} else {diskon=0;} td=ht*diskon; tp=ht-td;
            System.out.println("Total Pembelian         : "+ht);
            System.out.println("Total Diskon            : -"+td+"\n"+line3);
            System.out.println("Total Pembayaran        : "+tp);
        }
        else {System.out.println("Angka yang anda masukkan ada yang salah");}
    }    
}

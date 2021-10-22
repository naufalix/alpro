//@author Naufal Ulinnuha

import java.util.Scanner;
public class uts8v2 {
    public static double pt=800000,nt=600000,kt=400000,gk,gp,t,h, gb,tax;
    public static String nama,nik,np,nj,line2="-------------------------- ";
    public static void main(String[] args) {
        int jp,jj,jhk,benar;
        double pk=4500000,pw=4000000,ps=3500000,nk=ps,nw=3000000,ns=2500000,kk=ns,kw=2000000,ks=1500000;
        double pkh=30000,pwh=25000,psh=20000,nkh=pwh,nwh=psh,nsh=15000,kkh=psh,kwh=nsh,ksh=100000;
        Scanner sc = new Scanner(System.in);
        System.out.println("------Jenis Pegawai------ \n"+"1. PNS \n"+"2. Tetap Non PNS \n"+"3. Kontrak \n"+"------------------------- ");
        System.out.print("Masukkan jenis pegawai :");   jp=sc.nextInt();
        System.out.print("");    nama=sc.nextLine();
        System.out.print("Masukkan nama pegawai :");    nama=sc.nextLine();
        System.out.print("Masukkan nik pegawai :");     nik=sc.nextLine();
        System.out.println("------Jenis Jabatan------ \n"+"1. Kepala Bagian \n"+"2. Wakil Kepala Bagian \n"+"3. Staff \n"+"------------------------- ");
        System.out.print("Masukkan jenis jabatan :");       jj=sc.nextInt();
        System.out.print("Masukkan jumlah hari kerja :");   jhk=sc.nextInt();
        System.out.println("-------Rincian Gaji------- \n"+"Nama    : "+nama+"\n"+"NIK     : "+nik);
    
        if (jhk>=1&&jhk<=25) {
            if      (jp==1&&jj==1) {np="PNS"; nj="Kepala Bagian"; gp=(pk/25)*jhk; t=pt; h=pkh*jhk; benar=1;}
            else if (jp==1&&jj==2) {np="PNS"; nj="Wakil Kepala Bagian"; gp=(pw/25)*jhk; t=pt; h=pwh*jhk; benar=1;}
            else if (jp==1&&jj==3) {np="PNS"; nj="Staff"; gp=(ps/25)*jhk; t=pt; h=psh*jhk; benar=1;}
            else if (jp==2&&jj==1) {np="Tetap Non PNS"; nj="Kepala Bagian"; gp=(nk/25)*jhk; t=nt; h=nkh*jhk; benar=1;}
            else if (jp==2&&jj==2) {np="Tetap Non PNS"; nj="Wakil Kepala Bagian"; gp=(nw/25)*jhk; t=nt; h=nwh*jhk; benar=1;}
            else if (jp==2&&jj==3) {np="Tetap Non PNS"; nj="Staff"; gp=(ns/25)*jhk; t=nt; h=nsh*jhk; benar=1;}
            else if (jp==3&&jj==1) {np="Kontrak"; nj="Kepala Bagian"; gp=(kk/25)*jhk; t=kt; h=kkh*jhk; benar=1;}
            else if (jp==3&&jj==2) {np="Kontrak"; nj="Wakil Kepala Bagian"; gp=(kw/25)*jhk; t=kt; h=kwh*jhk; benar=1;}
            else if (jp==3&&jj==3) {np="Kontrak"; nj="Staff"; gp=(ks/25)*jhk; t=kt; h=ksh*jhk; benar=1;}
            else{benar=0;}
            
            switch (benar) {
                case 1 :
                    gk=gp+t+h; tax=0.05*gk; gb=gk-tax;
                    System.out.println("status  : "+np+" \n"+"Jabatan : "+nj+" \n"+line2);
                    System.out.println("Gaji Pokok  : "+gp);
                    System.out.println("Tunjangan   : "+t);
                    System.out.println("Honor       : "+h);
                    System.out.println("Pajak       : -"+tax+" \n"+line2);
                    System.out.println("Gaji Bersih : "+gb);
                break;
                default :
                    System.out.println("Angka yang anda masukkan ada yang salah");
                break;
            }
        }
        else {System.out.println("Angka yang anda masukkan harus dalam rentang 1-25");}
    }
}
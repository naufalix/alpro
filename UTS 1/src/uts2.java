//@author Naufal Ulinnuha

import java.util.Scanner;
public class uts2 {
    public static void main(String[] args) {
        double uts1,uas1,ukk1,uts2,uas2,ukk2,sks1,sks2;
        double na1,na2,ipk,b_uts=0.15,b_uas=0.15,b_ukk=0.7;
        String nama,nim,matkul1,matkul2,na1c,na2c;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa :");
        nama = input.nextLine();
        System.out.print("Masukkan NIM mahasiswa :");
        nim = input.nextLine();
        
        System.out.print("Masukkan nama mata kuliah ke-1:");
        matkul1 = input.nextLine();
        System.out.print("Masukkan sks "+matkul1+" :");
        sks1 = input.nextDouble();
        System.out.print("Masukkan nilai uts "+matkul1+" :");
        uts1 = input.nextDouble();
        System.out.print("Masukkan nilai uas "+matkul1+" :");
        uas1 = input.nextDouble();
        System.out.print("Masukkan nilai ukk "+matkul1+" :");
        ukk1 = input.nextDouble();
        
        System.out.print("Masukkan nama mata kuliah ke-2:");
        matkul2 = input.nextLine();
        matkul2 = input.nextLine();
        System.out.print("Masukkan sks "+matkul2+" :");
        sks2 = input.nextDouble();
        System.out.print("Masukkan nilai uts "+matkul2+" :");
        uts2 = input.nextDouble();
        System.out.print("Masukkan nilai uas "+matkul2+" :");
        uas2 = input.nextDouble();
        System.out.print("Masukkan nilai ukk "+matkul2+" :");
        ukk2 = input.nextDouble();
        
        na1 = ((uts1*b_uts)+(uas1*b_uas)+(ukk1*b_ukk));
        na2 = ((uts2*b_uts)+(uas2*b_uas)+(ukk2*b_ukk));
        
        if (na1>80) {na1c="A";}
        else if (na1<=80&&na1>75) {na1c="B+";}
        else if (na1<=75&&na1>70) {na1c="B";}
        else if (na1<=70&&na1>65) {na1c="C+";}
        else if (na1<=65&&na1>60) {na1c="C";}
        else if (na1<=60&&na1>55) {na1c="D+";}
        else if (na1<=55&&na1>=50) {na1c="D";}
        else{na1c="E";}
        
        if (na2>80) {na2c="A";}
        else if (na2<=80&&na2>75) {na2c="B+";}
        else if (na2<=75&&na2>70) {na2c="B";}
        else if (na2<=70&&na2>65) {na2c="C+";}
        else if (na2<=65&&na2>60) {na2c="C";}
        else if (na2<=60&&na2>55) {na2c="D+";}
        else if (na2<=55&&na2>=50) {na2c="D";}
        else{na2c="E";}
        
        if (((((na1*sks1)/sks1)+((na2*sks2)/sks2))/2)>80) {ipk=4;}
        else if (((((na1*sks1)/sks1)+((na2*sks2)/sks2))/2)<50) {ipk=0;}
        //else{ipk = ((na1*sks1)/sks1)+((na2*sks2)/sks2)/50;}
        //else{ipk = (na1+na2)/50;}
        else{ipk = 1+(((na1+na2)/2)-50)/10;}
        
        if ((uts1>100||uts1<0)||(uas1>100||uas1<0)||(ukk1>100||ukk1<0)||(uts2>100||uts2<0)||(uas2>100||uas2<0)||(ukk2>100||ukk2<0)) {
            System.out.println("Nilai yang anda masukkan harus berada dalam rentang 0-100");
        } else {
            System.out.println("---------------------KHS--------------------- ");
            System.out.println("Nama        : "+nama);
            System.out.println("NIM         : "+nim);
            System.out.println("---------------Nilai Mata Kuliah------------- ");
            System.out.println("Mata kuliah ke-1 :"+matkul1+" ("+sks1+" sks)  nilai : "+(float)na1+" ("+na1c+") ");
            System.out.println("Mata kuliah ke-2 :"+matkul2+" ("+sks2+" sks)  nilai : "+(float)na2+" ("+na2c+") ");
            System.out.println("------------------Nilai IPK------------------ ");
            System.out.println("IPK : "+(float)ipk);
            //System.out.println("IPK : "+String.format("%.1f",ipk)+" ");
        }   
    }   
}

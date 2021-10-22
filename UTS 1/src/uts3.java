//@author Naufal Ulinnuha

import java.util.Scanner;
public class uts3 {
    public static void main(String[] args) {
        int sex;
        double w,h,bmi,bbi;
        String cat;
        System.out.println("------Menu------ \n"+"1. Perempuan \n"+"2. Laki-laki \n"+"---------------- ");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan menu pilihan Anda (1/2) : ");
        sex = input.nextInt();
        System.out.print("Masukkan berat badan Anda (kg)  : ");
        w = input.nextDouble();
        System.out.print("Masukkan tinggi badan Anda (cm) : ");
        h = input.nextDouble();
        
        //bmi = w/((h/100)*(h/100));
        bmi = w/Math.pow((h/100),2);
        
        if      (bmi<17)          {cat="Kurus";}
        else if (bmi>=17&&bmi<23) {cat="Normal";}
        else if (bmi>=23&&bmi<27) {cat="Kegemukan";}
        else                      {cat="Obesitas";}
        
        switch (sex) {
            case 1:
                bbi = (h-100)-((h-100)*0.15);
                System.out.println("Nilai bmi Anda : "+bmi);
                System.out.println("Kategori berat badan Anda adalah : "+cat);
                System.out.println("Berat badan ideal Anda : "+bbi);
            break;
            case 2:
                bbi = (h-100)-((h-100)*0.10);
                System.out.println("Nilai bmi Anda : "+bmi);
                System.out.println("Kategori berat badan Anda adalah : "+cat);
                System.out.println("Berat badan ideal Anda : "+bbi);
            break;
            default:
                System.out.println("Maaf, tidak ada menu dengan nomor "+sex);
            break;
        }
    }
}

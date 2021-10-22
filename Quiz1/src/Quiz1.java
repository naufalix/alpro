import java.util.Scanner;
public class Quiz1 {
    public static void main(String[] args) {
        final double DISKON=0.05,PAJAK=0.1;
        double total_beli,total_bayar,total_diskon,total_pajak;
        int makanan,jumlah_makanan,minuman,jumlah_minuman,rawon=25000,soto=15000,esjeruk=8000,esteh=5000;
        
        Scanner input=new Scanner(System.in);
        System.out.println("-----Menu Makanan-----");
        System.out.println("1. Rawon  @ "+rawon);
        System.out.println("2. Soto   @ "+soto);
        System.out.print("Masukkan menu makanan (1/2) :");
        makanan=input.nextInt();
        
        switch (makanan){
            case 1:
                System.out.print("Masukkan jumlah makanan yang dipesan :");
                jumlah_makanan=input.nextInt();
                System.out.println("-----Menu Minuman-----");
                System.out.println("1. Es Jeruk  @ "+esjeruk);
                System.out.println("2. Es Teh    @ "+esteh);
                System.out.print("Masukkan menu minuman (1/2) :");
                minuman=input.nextInt();
                switch (minuman){
                    case 1:
                        System.out.print("Masukkan jumlah minuman yang dipesan :");
                        jumlah_minuman=input.nextInt();
                
                        total_beli=(jumlah_makanan*rawon)+(jumlah_minuman*esjeruk);
                        if(total_beli>100000){
                        total_diskon=total_beli*DISKON;
                        total_pajak=(total_beli-total_diskon)*PAJAK;
                        total_bayar=(total_beli-total_diskon)+total_pajak;
                        System.out.println("Total yang harus dibayar : "+total_bayar);
                        }
                        else{
                        total_pajak=total_beli*PAJAK;
                        total_bayar=total_beli+total_pajak;
                        System.out.println("Total yang harus dibayar : "+total_bayar);
                        }
                        break;
                    case 2:
                        System.out.print("Masukkan jumlah minuman yang dipesan :");
                        jumlah_minuman=input.nextInt();
                
                        total_beli=(jumlah_makanan*rawon)+(jumlah_minuman*esteh);
                        if(total_beli>100000){
                        total_diskon=total_beli*DISKON;
                        total_pajak=(total_beli-total_diskon)*PAJAK;
                        total_bayar=(total_beli-total_diskon)+total_pajak;
                        System.out.println("Total yang harus dibayar : "+total_bayar);
                        }
                        else{
                        total_pajak=total_beli*PAJAK;
                        total_bayar=total_beli+total_pajak;
                        System.out.println("Total yang harus dibayar : "+total_bayar);
                        }
                        break;
                    default:
                        System.out.println("Menu Tidak Tersedia");
                        break;
                }
                break;
            case 2:
                System.out.print("Masukkan jumlah makanan yang dipesan :");
                jumlah_makanan=input.nextInt();
                System.out.println("-----Menu Minuman-----");
                System.out.println("1. Es Jeruk  @ "+esjeruk);
                System.out.println("2. Es Teh    @ "+esteh);
                System.out.print("Masukkan menu minuman (1/2) :");
                minuman=input.nextInt();
                switch (minuman){
                    case 1:
                        System.out.print("Masukkan jumlah minuman yang dipesan :");
                        jumlah_minuman=input.nextInt();
                
                        total_beli=(jumlah_makanan*soto)+(jumlah_minuman*esjeruk);
                        if(total_beli>100000){
                        total_diskon=total_beli*DISKON;
                        total_pajak=(total_beli-total_diskon)*PAJAK;
                        total_bayar=(total_beli-total_diskon)+total_pajak;
                        System.out.println("Total yang harus dibayar : "+total_bayar);
                        }
                        else{
                        total_pajak=total_beli*PAJAK;
                        total_bayar=total_beli+total_pajak;
                        System.out.println("Total yang harus dibayar : "+total_bayar);
                        }
                        break;
                    case 2:
                        System.out.print("Masukkan jumlah minuman yang dipesan :");
                        jumlah_minuman=input.nextInt();
                
                        total_beli=(jumlah_makanan*soto)+(jumlah_minuman*esteh);
                        if(total_beli>100000){
                        total_diskon=total_beli*DISKON;
                        total_pajak=(total_beli-total_diskon)*PAJAK;
                        total_bayar=(total_beli-total_diskon)+total_pajak;
                        System.out.println("Total yang harus dibayar : "+total_bayar);
                        }
                        else{
                        total_pajak=total_beli*PAJAK;
                        total_bayar=total_beli+total_pajak;
                        System.out.println("Total yang harus dibayar : "+total_bayar);
                        }
                        break;
                    default:
                        System.out.println("Menu Tidak Tersedia");
                        break;
                }
                break;
            default:
                System.out.println("Menu tidak tersedia");
                break;
        }
    }
}

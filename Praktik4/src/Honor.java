import java.util.Scanner;
public class Honor {
    
    public static final double tunjangan = 500000;
    public static double honor,hari,gaji_kotor,gaji_bersih,potongan;
    public static double pajak=0.05;
    
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Masukkan honor/hari pagawai : ");
        honor = user.nextDouble();
        System.out.print("Masukkan jumlah hari bekerja : ");
        hari = user.nextDouble();
        gaji_kotor = (honor*hari)+tunjangan;
        potongan = pajak*gaji_kotor;
        gaji_bersih = gaji_kotor - potongan;
        System.out.println("honor pegawai :");
        System.out.println("gaji kotor  : "+gaji_kotor);
        System.out.println("pajak       : "+potongan);
        System.out.println("gaji bersih : "+gaji_bersih);
    }
}

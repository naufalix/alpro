import java.util.Scanner;
public class HitungGaji {
    static int pegawai,jabatan,nik,hari,gajipokok,ttlgajipokok=0,tunjangan,honor,ttlhonor=0,pajak,gajikotor,gajibersih;
    static String nama,status,jabat;
    public static void main(String []args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("------Jenis Pegawai------");
        System.out.println("1. PNS");
        System.out.println("2. Tetap Non PNS");
        System.out.println("3. Kontrak");
        System.out.println("--------------------");
        System.out.print("Masukkan jenis pegawai : ");
        pegawai = input.nextInt();
        input.nextLine(); //saya tambahkan untuk menangani error karena habis nextInt gk bisa langsung nextLine
        System.out.print("Masukkan nama pegawai : ");
        nama = input.nextLine();
        System.out.print("Masukkan NIK pegawai : ");
        nik = input.nextInt();
        
        switch(pegawai){
            
            //PNS
            case 1:
                status = "PNS";
                tunjangan=800000;
                jenisJabatan();
                jabatan = input.nextInt();
                System.out.print("Masukkan jumlah hari kerja : ");
                hari = input.nextInt();
                
                switch(jabatan){
                    case 1:
                        jabat = "Kepala Bagian";
                        gajipokok=4500000;
                        honor=30000;
                        rincianGaji();
                       
                    break;
                    case 2:
                        jabat = "Wakil Kepala Bagian";
                        gajipokok=4000000;
                        honor=25000;
                        rincianGaji();
                        
                    break;
                    case 3:
                        jabat = "Staff";
                        gajipokok=3500000;
                        honor=20000;
                        rincianGaji();
                        
                    break;
                    default:
                        System.out.println("Maaf Nomor yang anda Masukkan Salah");
                }
            break;
            
            //Tetap Non PNS
            case 2:
                status = "Tetap Non PNS";
                tunjangan=600000;
                jenisJabatan();
                jabatan = input.nextInt();
                System.out.print("Masukkan jumlah hari kerja : ");
                hari = input.nextInt();
                
                switch(jabatan){
                    case 1:
                        jabat = "Kepala Bagian";
                        gajipokok=3500000;
                        honor=25000;
                        rincianGaji();
                        
                        
                    break;
                    case 2:
                        jabat = "Wakil Kepala Bagian";
                        gajipokok=3000000;
                        honor=20000;
                        rincianGaji();
                        
                    break;
                    case 3:
                        jabat = "Staff";
                        gajipokok=2500000;
                        honor=15000;
                        rincianGaji();
                        
                    break;
                    default:
                        System.out.println("Maaf Nomor yang anda Masukkan Salah");
                }
            break;
            
            //Kontrak
            case 3:
                status = "Kontrak";
                tunjangan=400000;
                jenisJabatan();
                jabatan = input.nextInt();
                System.out.print("Masukkan jumlah hari kerja : ");
                hari = input.nextInt();
                
                switch(jabatan){
                    case 1:
                        jabat = "Kepala Bagian";
                        gajipokok=2500000;
                        honor=20000;
                        rincianGaji();
                       
                    break;
                    case 2:
                        jabat = "Wakil Kepala Bagian";
                        gajipokok=2000000;
                        honor=15000;
                        rincianGaji();
                        
                    break;
                    case 3:
                        jabat = "Staff";
                        gajipokok=1500000;
                        honor=10000;
                        rincianGaji();
                        
                    break;
                    default:
                        System.out.println("Maaf Nomor yang anda Masukkan Salah");
                }
            break;
            default:
            System.out.println("Maaf Nomor yang anda Masukkan Salah");
        }
    }
    static void jenisJabatan(){
        System.out.println("------Jenis Jabatan------");
        System.out.println("1. Kepala Bagian");
        System.out.println("2. Wakil Kepala Bagian");
        System.out.println("3. Staff");
        System.out.println("--------------------");
        System.out.print("Masukkan jenis Jabatan : ");
                
    }
    static void rincianGaji(){
        System.out.println("------Rincian Gaji------");
                        System.out.println("Nama : "+nama);
                        System.out.println("NIK : "+nik);
                        System.out.println("status : "+status);
                        System.out.println("jabatan : "+jabat);
                        System.out.println("--------------------");
                        
                        //proses gaji pokok
                        if(hari <25){
                            ttlgajipokok = gajipokok-((25-hari)*(gajipokok/25));
                            ttlhonor=hari*honor;
                        }
                        else if(hari >=25){
                            ttlgajipokok=gajipokok;
                            ttlhonor=25*honor;
                        }
                        gajikotor=ttlgajipokok+tunjangan+ttlhonor;
                        pajak=(int)(gajikotor*0.05);
                        gajibersih=gajikotor-pajak;
                        
                        //Outputan
                        System.out.println("Gaji Pokok : "+ttlgajipokok);
                        System.out.println("Tunjangan : "+tunjangan);
                        System.out.println("Honor : "+ttlhonor);
                        System.out.println("pajak : -"+pajak);
                        System.out.println("--------------------");
                        System.out.println("Gaji Bersih :"+gajibersih);
    }
}

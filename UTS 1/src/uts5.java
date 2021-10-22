//@author Naufal Ulinnuha

import java.util.Scanner;
public class uts5 {
    public static void main(String[] args) {
        int m1,m2;
        double t,t2;
        String name,name2,C="Celcius",R="Reamur",F="Fahrenheit",K="Kelvin";
        System.out.println("------Menu Suhu Awal------ \n"+"1. Reamur \n"+"2. Celcius \n"+"3. Kelvin \n"+"4. Fahrenheit \n"+"--------------------------- ");
        System.out.println("------Menu Suhu Akhir------ \n"+"1. Reamur \n"+"2. Celcius \n"+"3. Kelvin \n"+"4. Fahrenheit \n"+"--------------------------- ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan menu suhu awal pilihan Anda (1-4):");
        m1 = sc.nextInt();
        System.out.print("Masukkan menu suhu akhir pilihan Anda (1-4):");
        m2 = sc.nextInt();
        System.out.print("Masukkan nilai suhu awal:");
        t = sc.nextDouble();
        
        if (m1==1) {name="Reamur";
            if     (m2==1){ t2=t;           name2=R;    System.out.println("Konversi suhu dari "+t+" "+name+" adalah "+t2+" "+name2);}    
            else if(m2==2){ t2=(5*t)/4;     name2=C;    System.out.println("Konversi suhu dari "+t+" "+name+" adalah "+t2+" "+name2);}
            else if(m2==3){ t2=(5*t)/4+273; name2=K;    System.out.println("Konversi suhu dari "+t+" "+name+" adalah "+t2+" "+name2);}
            else if(m2==4){ t2=(9*t)/4+32;  name2=F;    System.out.println("Konversi suhu dari "+t+" "+name+" adalah "+t2+" "+name2);}
            else{System.out.println("Angka yang anda masukkan salah");}
        }   
        else if (m1==2) {name="Celcius";
            if     (m2==1){ t2=(4*t)/5;     name2=R;    System.out.println("Konversi suhu dari "+t+" "+name+" adalah "+t2+" "+name2);}    
            else if(m2==2){ t2=t;           name2=C;    System.out.println("Konversi suhu dari "+t+" "+name+" adalah "+t2+" "+name2);}
            else if(m2==3){ t2=t+273;       name2=K;    System.out.println("Konversi suhu dari "+t+" "+name+" adalah "+t2+" "+name2);}
            else if(m2==4){ t2=(9*t)/5+32;  name2=F;    System.out.println("Konversi suhu dari "+t+" "+name+" adalah "+t2+" "+name2);}
            else{System.out.println("Angka yang anda masukkan salah");}
        }   
        else if (m1==3) {name="Kelvin";
            if     (m2==1){ t2=(4*(t-273))/5;       name2=R;    System.out.println("Konversi suhu dari "+t+" "+name+" adalah "+t2+" "+name2);}    
            else if(m2==2){ t2=t-273;               name2=C;    System.out.println("Konversi suhu dari "+t+" "+name+" adalah "+t2+" "+name2);}
            else if(m2==3){ t2=t;                   name2=K;    System.out.println("Konversi suhu dari "+t+" "+name+" adalah "+t2+" "+name2);}
            else if(m2==4){ t2=(9*(t-273))/5+32;    name2=F;    System.out.println("Konversi suhu dari "+t+" "+name+" adalah "+t2+" "+name2);}
            else{System.out.println("Angka yang anda masukkan salah");}
        }   
        else if (m1==4) {name="Fahrenheit";
            if     (m2==1){ t2=(4*(t-32))/9;        name2=R;    System.out.println("Konversi suhu dari "+t+" "+name+" adalah "+t2+" "+name2);}    
            else if(m2==2){ t2=(5*(t-32))/9;        name2=C;    System.out.println("Konversi suhu dari "+t+" "+name+" adalah "+t2+" "+name2);}
            else if(m2==3){ t2=(5*(t-32))/9+273;    name2=K;    System.out.println("Konversi suhu dari "+t+" "+name+" adalah "+t2+" "+name2);}
            else if(m2==4){ t2=t;                   name2=F;    System.out.println("Konversi suhu dari "+t+" "+name+" adalah "+t2+" "+name2);}
            else{System.out.println("Angka yang anda masukkan salah");}
        }
        else {System.out.println("Angka yang anda masukkan salah");}         
    }    
}

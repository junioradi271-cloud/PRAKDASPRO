package pertemuan3;

import java.util.Scanner;

public class MenghitungTotalBayar26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Harga;
        double potongan;
        double jml_bayar;
        double diskon=0.15;

       System.out.println("Masukkan Harga: "); 
        Harga=sc.nextInt();
         
        potongan=diskon*Harga;
        jml_bayar=Harga-potongan;

        System.out.println("Jumlah Yang Harus Anda Bayar adalah Rp. " +jml_bayar);
    }
    
}

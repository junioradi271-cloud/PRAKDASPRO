package pertemuan3;

import java.util.Scanner;

public class CicilanBayarPerbulan26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Harga;
        int Uang_Muka;
        int bulan;
        double Bunga_Tetap=0.02;
        double Sisa_Harga;
        double Cicilan_pokok;
        double Cicilan_Perbulan;
        double Bunga_Perbulan;

        System.out.println("Masukkan Harga Laptop: ");
        Harga=sc.nextInt();
        System.out.println("Uang Muka: ");
        Uang_Muka=sc.nextInt();
        System.out.println("Dibayar Berapa Bulan: ");
        bulan=sc.nextInt();

        Sisa_Harga=Harga-Uang_Muka;
        Bunga_Perbulan=Bunga_Tetap*Sisa_Harga;
        Cicilan_pokok=Sisa_Harga/bulan;
        Cicilan_Perbulan=Cicilan_pokok+Bunga_Perbulan;

        System.out.println("Cicilan perbulan: "+Cicilan_Perbulan);
    }
    
}

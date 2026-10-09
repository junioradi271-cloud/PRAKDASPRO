package pertemuan2;

import java.util.Scanner;

public class TotalGajiPokok26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gaji_pokok, tunjangan_anak, jumlah_anak;
        double dana_pensiun= 0.05, total_tunjangan_anak, total_gaji_pokok, total_dana_pensiun;

        System.out.println("Masukkan Gaji Pokok: ");
        gaji_pokok = sc.nextInt();
        System.out.println("Masukkan tunjangan anak: ");
        tunjangan_anak = sc.nextInt();
        System.out.println("Masukkan Jumlah Anak: ");
        jumlah_anak = sc.nextInt();

        total_tunjangan_anak= tunjangan_anak*jumlah_anak;
        total_dana_pensiun= gaji_pokok*dana_pensiun;
        total_gaji_pokok= gaji_pokok+total_tunjangan_anak-dana_pensiun;

        System.out.println("Total tunjangan anak: " +total_tunjangan_anak);
        System.out.println("Total dana pensiun: " +total_dana_pensiun);
        System.out.println("Total gaji pokok: " +total_gaji_pokok);
    }
    
}

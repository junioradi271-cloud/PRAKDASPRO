//Tugas 3 (uji wajib) jumlahToko 2 + (P mod 3) = 4
package Pertemuan10;

import java.util.Scanner;

public class Tugas326 {
        public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

    int jumlahBarang=0;
    int totalBarang = 0;
    int terbanyak = -1;
    int tokoterbanyak=0;

    System.out.print("Masukkan toko = ");
    int toko = sc.nextInt();

        for (int i = 1; i <= toko; i++) {
            System.out.print("Toko "+i+" - Masukkan Jumlah Pelanggan: ");
            int pelanggan =sc.nextInt();
            jumlahBarang=0;

            for (int j = 1; j <= pelanggan; j++) {
                System.out.print("Masukkan barang yang dibeli :");
                int barang = sc.nextInt();
                jumlahBarang+=barang;
            }

            System.out.println("Toko "+i+" - pelanggan: "+ pelanggan +", total barang: "+jumlahBarang);

            if (jumlahBarang>terbanyak) {
                terbanyak=jumlahBarang;
                tokoterbanyak=i;
            }

            totalBarang+=jumlahBarang;
        }
        System.out.println("======================================");
        System.out.println("Total Barang :"+totalBarang);
        System.out.println("toko dengan barang terbanyak :"+tokoterbanyak);
        sc.close();
    }
    
}

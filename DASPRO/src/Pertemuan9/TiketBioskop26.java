//Harga tiket = 40000 + (P mod 6) × 2000 = 44000
//Syarat diskon pertama = lebih dari (3 + (P mod 3)) = 5 tiket, dengan diskon (8 + (P mod 5))% = 9% 
//Syarat diskon kedua = lebih dari (8 + (P mod 4)) = 10 tiket, dengan diskon (15 + (P mod 4))% = 17% 
package Pertemuan9;

import java.util.Scanner;

public class TiketBioskop26 {
    public static void main(String[] args) {
        Scanner rear = new Scanner(System.in);

        int HargaTiket = 44000;
        int jumlahTiket, totalTiket = 0;
        double diskon, totalHarga, totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = rear.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid!");
                continue;
            }

            if (jumlahTiket == 0) {
                break;
            }

            diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.17;
            } else if (jumlahTiket > 5) {
                diskon = 0.09;
            }

            totalHarga = jumlahTiket * HargaTiket;
            totalHarga -= totalHarga * diskon;

            totalHarga += jumlahTiket;
            totalPenjualan += totalHarga;

            System.out.println("Harga Tiket: " + HargaTiket);
            System.out.println("Total penjualan: Rp " + totalPenjualan);
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);

    }
}

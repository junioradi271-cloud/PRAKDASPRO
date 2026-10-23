// hargaKopi = 10000 + (P mod 5) × 1000 = 11000
//hargaTeh = 5000 + (P mod 4) × 1000 = 7000
//hargaRoti = 15000 + (P mod 6) × 1000 = 17000
package Pertemuan9;

import java.util.Scanner;

public class KafeDoWhile26 {
    public static void main(String[] args) {
        Scanner rear = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        int HargaKopi=12000, HargaTeh=7000, HargaRoti=20000, totalHarga;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = rear.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("Jumlah Kopi: ");
            kopi = rear.nextInt();
            System.out.print("Jumlah Teh: ");
            teh = rear.nextInt();
            System.out.print("Jumlah Roti: ");
            roti = rear.nextInt();
            totalHarga = (kopi*HargaKopi) + (teh*HargaTeh) + (roti*HargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            rear.nextLine();
        } while (true);
        rear.close();
        System.out.println("Semua trasaksi selesai.");
    }
    
}

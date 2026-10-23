//Tarif parkir mobil = 2500 + (P mod 6) × 250 per jam = 3000
// Tarif parkir motor = 1500 + (P mod 6) × 250 per jam (gunakan nilai (P mod 6) yang SAMA dengan tarif mobil) = 2000

package Pertemuan9;

import java.util.Scanner;

public class Parkir26 {
    public static void main(String[] args) {
        Scanner rear = new Scanner(System.in);


        int jenis, durasi, total = 0;

        do {
            System.out.print("Pilih kendaraan (1.Mobil, 2.Motor, 0.Keluar):  ");
            jenis = rear.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir: ");
                durasi = rear.nextInt();

                if (jenis == 1) {
                    total = total + durasi * 3000;
                } else {
                    total = total + durasi * 2000;
                }
            } else if (jenis != 0) {
                System.out.println("Pilihan tidak valid!");
            }

        } while (jenis != 0);

        System.out.println("Total biaya parkir: Rp " + total);

        rear.close();
    }    
    


}
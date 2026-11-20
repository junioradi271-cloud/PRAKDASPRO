//Tugas 1 (uji wajib) jumlah nilai mahasiswa 5 + (P mod 11) = 9
//Tugas 1 (uji wajib) salah satu nilai yang diinput P mod 100 = 26
package pertemuan12;

import java.util.Scanner;

public class PengelolaanNilaiMahasiswa26 {
    public static void main(String[] args) {
        Scanner rear = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = rear.nextInt();

        int[] nilai = new int[jumlah];
        int total = 0;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = rear.nextInt();

            total += nilai[i];
        }

        double rata2 = (double) total / jumlah;

        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }
        
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] >= 60) {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " = LULUS");
            } else {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " = TIDAK LULUS");
            }
        }
    }
}

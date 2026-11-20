//Percobaan 4 Bagian A (uji wajib tambahan)
//key 50 + (P mod 50) = 76
package pertemuan12;

import java.util.Scanner;

public class SearchNilai26 {
    public static void main(String[] args) {
        Scanner rear = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = rear.nextInt();
        int[] nilai = new int[jumlah];

        for (int i = 0; i < nilai.length; i++) {
                System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
                nilai[i] = rear.nextInt();
        }

        System.out.print("Masukkan nilai yang dicari: ");
        int key = rear.nextInt();

        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println("Nilai " + key + "ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai " + key + "tidak ditemukan dalam array.");
        }
    }
}
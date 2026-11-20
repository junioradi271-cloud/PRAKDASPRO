//Percobaan 2 (uji wajib tambahan)
//salah satu nilai yang diinput 60 + (P mod 41) = 86
package pertemuan12;

import java.util.Scanner;

public class ArrayNilai26 {
    public static void main(String[] args) {
        Scanner rear = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        int JumlahLulus = 0;
        int JumlahTidakLulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = rear.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
                JumlahLulus++;
            } else {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (TIDAK LULUS)");
                JumlahTidakLulus++;
            }
           
        }
        System.out.println("Jumlah Mahasiswa lulus: " + JumlahLulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus: " + JumlahTidakLulus);
        
        rear.close();
    }
}

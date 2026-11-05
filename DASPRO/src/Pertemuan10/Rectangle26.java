//Percobaan 2 (uji tambahan,langkah 9) (baris, kolom) uji ke-1 (2 + (P mod 3), 4 + (P mod 3)) = baris = 4, kolom = 6
//Percobaan 2 (uji tambahan,langkah 9) (baris, kolom) uji ke-2 (5 + (P mod 3), 2 + (P mod 3)) = baris = 7, kolom = 4
//Percobaan 2 (Pertanyaan 2) baris, kolom 4 + (P mod 4), 6 + (P mod 4) = baris = 6, kolom = 8
package Pertemuan10;

import java.util.Scanner;

public class Rectangle26 {
    public static void main(String[] args) {
        Scanner rear = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris: ");
        int baris = rear.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = rear.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        rear.close();
    }
}

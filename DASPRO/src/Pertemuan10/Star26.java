//Percobaan 1 (uji tambahan,langkah 10) n (uji ke-1) 3 + (P mod 5) = 4
//Percobaan 1 (uji tambahan,langkah 10) n (uji ke-2) 9 + (P mod 5) = 10
//Percobaan 1 (Pertanyaan 1 & 2) n 4 + (P mod 4) = 6
//Percobaan 1 (Pertanyaan 3) n 10 + (P mod 6) = 12
package Pertemuan10;

import java.util.Scanner;

public class Star26 {
    public static void main(String[] args) {
        Scanner rear = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = rear.nextInt();

        for (int i = 1; i <= n; i+= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        rear.close();
    }
}

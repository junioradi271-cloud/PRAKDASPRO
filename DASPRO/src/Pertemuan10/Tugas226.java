//Tugas 2 (uji wajib) n 5 + (P mod 4) = 7
package Pertemuan10;

import java.util.Scanner;

public class Tugas226 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        int total=0;

        int i = 1;
        while (i <= n) { 
            int j = 0;
            while (j < n) { 
                int hasil = (j+1)*i;
                System.out.printf("%4d", hasil);
                total=total+hasil;
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("Jumlah seluruh angka: "+total);
        sc.close();
    }
    
}

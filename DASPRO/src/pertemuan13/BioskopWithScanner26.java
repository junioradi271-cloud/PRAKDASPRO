package pertemuan13;

import java.util.Scanner;

public class BioskopWithScanner26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int baris, kolom;
        String Nama, Pilihan;
        String[][] penonton = new String[4][2];

        while (true) { 
            System.out.print("Masukkan nama: ");
            Nama = sc.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();

            penonton[baris-1][kolom-1] = Nama;
            
            System.out.print("Input penonton lainnya? (Y/N): ");
            Pilihan = sc.nextLine();

            if (Pilihan.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
    
}

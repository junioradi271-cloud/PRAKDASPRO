package pertemuan5;

import java.util.Scanner;

public class Tugas1Pemilihan26 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();
        
        String pesan = (uktLunas) ? "Pembayaran UKT Terverivikasi\nSilakan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak\nSilakan lunasi UKT terlebih dahulu";

        System.out.println(pesan);
    }
     
}

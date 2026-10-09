package pertemuan6;

import java.util.Scanner;

public class Diskon26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int diskon, jumlahBuku;
        String jenisBuku;

        System.out.print("Masukkan Jenis Buku: ");
        jenisBuku = sc.nextLine();
        System.out.print("Masukkan Jumlah Buku: ");
        jumlahBuku = sc.nextInt();

        if (jenisBuku.equalsIgnoreCase ("Kamus") && jumlahBuku > 2) {
            diskon = 11;
        } else if (jenisBuku.equalsIgnoreCase("Kamus")) {
            diskon = 9;
        } else if (jenisBuku.equalsIgnoreCase("Novel") && jumlahBuku > 3 ) {
            diskon = 9;
        } else if (jenisBuku.equalsIgnoreCase("Novel")) {
            diskon = 8;
        } else if (!jenisBuku.equalsIgnoreCase("Kamus") && !jenisBuku.equalsIgnoreCase("Novel") && jumlahBuku > 3) {
            diskon = 5;
        } else {
            diskon = 0;
        } System.out.println("Total Diskon: "+diskon);
    }
    
}

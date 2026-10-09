package pertemuan4;

import java.util.Scanner;

public class kafe26 {
    public static void main(String[] args) {
        Scanner rear = new Scanner(System.in);

        String menu;
        char Ukuran_Cap;
        int jumlah;
        boolean keanggotaan;

        System.out.print("Masukkan Menu: ");
        menu = rear.nextLine();
        System.out.print("Masukkan Ukuran Cup: ");
        Ukuran_Cap = rear.next().charAt(0);
        System.out.print("Masukkan Jumlah: ");
        jumlah = rear.nextInt();
        System.out.print("Masukkan Keanggotaan (true/false):");
        keanggotaan = rear.nextBoolean();

        double hargaMenu = 0;

        switch (menu.toLowerCase()) {
            case "kopi" :
                hargaMenu = 12000;
                break;
            case "teh" :
                hargaMenu = 7000;
                break;
            case "coklat" :
                hargaMenu = 20000;
                break;
        }

        double totalHarga = hargaMenu * jumlah;

        switch (Ukuran_Cap) {
            case 'S' :
                 break;
            case 'M' :
                 totalHarga += 0.25 * totalHarga;
                 break;
            case 'L' :
                 totalHarga += 0.4 * totalHarga;
                 break;
        }

        double diskon = keanggotaan ? 0.1 : 0;
        double nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Item pembelian: " + jumlah + " " + menu + " dengan ukuran cup " + Ukuran_Cap);
        System.out.println("Nominal bayar: " + nominalBayar);
    }
    
}

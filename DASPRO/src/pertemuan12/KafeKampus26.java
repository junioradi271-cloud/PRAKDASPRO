package pertemuan12;

import java.util.Scanner;

public class KafeKampus26 {
    public static void main(String[] args) {
                Scanner rear = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino",
            "Chocolate Ice"
        };

        int[] harga = {
            15000, 13000, 10000, 12000,
            8000, 18000, 20000
        };

        System.out.println("===== MENU KAFE KAMPUS =====");

        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i] + " - Rp" + harga[i]);
        }

        System.out.print("\nMasukkan jumlah pesanan: ");
        int jumlah = rear.nextInt();
        rear.nextLine();

        if (jumlah <= 0) {
            System.out.println("Jumlah pesanan tidak valid!");
        } else {

            String[] pesanan = new String[jumlah];
            int[] hargaPesanan = new int[jumlah];
            int total = 0;

            for (int i = 0; i < jumlah; i++) {

                boolean ditemukan = false;

                while (!ditemukan) {
                    System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
                    String cari = rear.nextLine();

                    for (int j = 0; j < menu.length; j++) {

                        if (menu[j].equalsIgnoreCase(cari)) {
                            pesanan[i] = menu[j];
                            hargaPesanan[i] = harga[j];

                            total += harga[j];
                            ditemukan = true;

                            System.out.println("Menu ditemukan!");
                            System.out.println("Harga: Rp" + harga[j]);
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Menu tidak tersedia, silakan pilih kembali!");
                    }
                }
            }

            System.out.println("\n===== STRUK PEMESANAN =====");

            for (int i = 0; i < jumlah; i++) {
                System.out.println((i + 1) + ". " + pesanan[i]
                        + " - Rp" + hargaPesanan[i]);
            }

            System.out.println("---------------------------");
            System.out.println("Total biaya: Rp" + total);
            System.out.println("Terima kasih telah memesan!");
        }
    }

}
    

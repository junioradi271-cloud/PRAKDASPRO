package pertemuan2;

import java.util.Scanner;

public class StudiKasusKolam26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int panjang, lebar, diameter_kolam, sisi_taman_bunga, luas_taman_bunga;
        double luas_tanah, luas_kolam, jari_jari, Pi = 3.14, Luas_Tanah_Yang_Tidak_Terpakai;


        System.out.print("Masukkan panjang tanah: ");
        panjang = sc.nextInt();
        System.out.print("Masukkan lebar tanah: ");
        lebar = sc.nextInt();
        System.out.println("Masukkan Diameter: ");
        diameter_kolam = sc.nextInt();
        System.out.println("Masukkan sisi taman: ");
        sisi_taman_bunga = sc.nextInt();

        luas_tanah= panjang*lebar;
        jari_jari= diameter_kolam/2;
        luas_kolam= Pi*jari_jari*jari_jari;
        luas_taman_bunga= sisi_taman_bunga*sisi_taman_bunga;
        Luas_Tanah_Yang_Tidak_Terpakai= luas_tanah-luas_kolam-luas_taman_bunga;

        System.out.println("Luas Tanah Yang Tidak Terpakai: " +Luas_Tanah_Yang_Tidak_Terpakai);
    }
    
}

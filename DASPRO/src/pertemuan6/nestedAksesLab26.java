package pertemuan6;

import java.util.Scanner;

public class nestedAksesLab26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.print("Apakah mahasiswa aktif? (True/False): ");
        mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah sedang disanksi? (True/False): ");
        sedangDisanksi = sc.nextBoolean();
        System.out.print("Apakah punya izin dosen? (True/False): ");
        punyaIzinDosen = sc.nextBoolean();
        System.out.println("Apakah asisten Lab? (True/False): ");
        asistenLab = sc.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
    }
    
}

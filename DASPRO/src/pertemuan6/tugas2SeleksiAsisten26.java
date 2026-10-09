package pertemuan6;

import java.util.Scanner;

public class tugas2SeleksiAsisten26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah Mahasiswa Aktif? : ");
        boolean mahasiswaAktif = sc.nextBoolean();
        System.out.print("Apakah Mahasiswa sedang mendapatkan sanksi akademik? : ");
        boolean sanksi = sc.nextBoolean();

        if (!sanksi && mahasiswaAktif) {
            System.out.print("Masukkan nilai DASPRO: ");
            int DASPRO = sc.nextInt();
            System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? : ");
            boolean sertifikat = sc.nextBoolean();
            System.out.println("mahasiswa dipanggil untuk mengikuti wawancara");

            if (DASPRO >= 79 || sertifikat) {
                System.out.print("Masukkan nilai wawancara: ");
                int nilaiWawancara = sc.nextInt();

                if (nilaiWawancara >= 74) {
                    System.out.println("Mahasiswa Diterima menjadi asisten");
                } else {
                    System.out.println("Mahasiswa tidak diterima menjadi asisten");
                    System.out.println("nilai wawancara kurang memenuhi");
                }
            } else {
                System.out.println("mahasiswa gagal karena nilai DASPRO tidak memenuhi/tidak memilki sertifikat kompetensi pemograman");
            }
        } else {
            System.out.println("GAGAL! mahasiswa tidak memenuhi syarat");
        }
    }
    
}

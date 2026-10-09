package pertemuan4;

import java.util.Scanner;

public class SIAKAD26 {
    public static void main(String[] args) {
        Scanner rear = new Scanner(System.in);

        String nama, nim, kelas, No_Absen;
        double nilai_kuis, nilai_tugas, nilai_ujian, nilai_akhir;

        System.out.print("Masukkan Nama: ");
        nama=rear.nextLine();
        System.out.print("Masukkan NIM: ");
        nim=rear.nextLine();
        System.out.print("Masukkan Kelas: ");
        kelas=rear.nextLine();
        System.out.print("Masukkan No Absen: ");
        No_Absen=rear.nextLine();

        System.out.print("Masukkan nilai kuis: ");
        nilai_kuis=rear.nextDouble();
        System.out.print("Masukkan Nilai Tugas: ");
        nilai_tugas=rear.nextDouble();
        System.out.print("Masukkan Nilai Ujian: ");
        nilai_ujian=rear.nextDouble();

        nilai_akhir = (nilai_kuis + nilai_tugas + nilai_ujian) / 3;

        String nilai_huruf;
        String kualifikasi;

        if (nilai_akhir > 80 && nilai_akhir <= 100) {
            nilai_huruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilai_akhir > 73 && nilai_akhir <= 80) {
            nilai_huruf = "B+";
            kualifikasi = "Lebih Dari Baik";
        } else if (nilai_akhir > 65 && nilai_akhir <= 73) {
            nilai_huruf = "B";
            kualifikasi = "Baik";
        } else if (nilai_akhir > 60 && nilai_akhir <= 65) {
            nilai_huruf = "C+";
            kualifikasi = "Lebih Dari Cukup";
        } else if (nilai_akhir > 50 && nilai_akhir <= 60) {
            nilai_huruf = "C";
            kualifikasi = "Cukup";
        } else if (nilai_akhir > 39 && nilai_akhir <= 50) {
            nilai_huruf = "D";
            kualifikasi = "Kurang";
        } else {
            nilai_huruf = "E";
            kualifikasi = "Gagal";
        }

            System.out.println("Mahasiswa Dengan Nama" + nama + " (NIM" + nama + ") kelas " + kelas + " nomor absen " + No_Absen);
            System.out.println("Nilai Akhir: " + nilai_akhir);
            System.out.println("Nilai Akhir Huruf: " + nilai_huruf);
            System.out.println("Kualifikasi: " + kualifikasi);
            
    }
    
}

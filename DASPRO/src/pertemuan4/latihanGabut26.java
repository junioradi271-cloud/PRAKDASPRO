package pertemuan4;

import java.util.Scanner;

public class latihanGabut26 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner rear = new Scanner(System.in);

        double nilaiKehadiran, nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;

        System.out.print("Masukkan Nama: ");
        rear.nextLine();
        System.out.print("Masukkan Kelas: ");
        rear.nextLine();
        System.out.print("Masukkan No Absen: ");
        rear.nextLine();
        System.out.print("Masukkan NIM: ");
        rear.nextLine();
        System.out.print("Masukkan Nilai Kehadiran: ");
        nilaiKehadiran=rear.nextDouble();
        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas=rear.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        nilaiUts=rear.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        nilaiUas=rear.nextDouble();
       

        nilaiAkhir = (0.1*nilaiKehadiran)+(0.2*nilaiTugas)+(0.3*nilaiUts)+(0.4*nilaiUas);

        String nilaiHuruf, Penentuan;
        double Bobot;

        if (nilaiAkhir > 85 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            Penentuan = "Sangat Baik";
            Bobot = 4.0;

        } else if (nilaiAkhir > 75 && nilaiAkhir <= 85) {
            nilaiHuruf = "B+";
            Penentuan = "Baik Sekali";
            Bobot = 3.5;
        } else if (nilaiAkhir > 70 && nilaiAkhir <= 75) {
            nilaiHuruf = "B";
            Penentuan = "Baik";
            Bobot = 3.0;   
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 70) {
            nilaiHuruf = "C+";
            Penentuan = "Cukup Baik";
            Bobot = 2.5;
        } else if (nilaiAkhir > 55 && nilaiAkhir <= 65) {
            nilaiHuruf = "C";
            Penentuan = "Cukup";
            Bobot = 2.0;
        } else if (nilaiAkhir > 40 && nilaiAkhir <= 55) {
            nilaiHuruf = "D";
            Penentuan = "Kurang";
            Bobot = 1.0;
        } else {
            nilaiHuruf = "E";
            Penentuan = "Gagal";
            Bobot = 0;
        }
            
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Predikat: " + nilaiHuruf);
            System.out.println("Bobot nilai: " + Bobot);
            System.out.println("Hasil Pemahaman : " + Penentuan);


    }
    
}
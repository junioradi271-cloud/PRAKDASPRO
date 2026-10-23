package Pertemuan9;

import java.util.Scanner;

public class SiakadFor26 {
     public static void main(String[] args) {
        Scanner rear = new Scanner(System.in);

        double nilai, tertinggi=0, terendah=100;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke- " + i + ": ");
            nilai=rear.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
         rear.close();
        }
        System.out.println("Nilai Tertinggi: "+tertinggi);
        System.out.println("Nilai Terendah: "+terendah);

    }
}
    


// Jumlah mahasiswa (batas perulangan FOR) = 8 + (P mod 5) = 9
//Batas kelulusan pada Pertanyaan no. 4 (modifikasi kode) = 55 + (P mod 11) = 59
package Pertemuan9;

 import java.util.Scanner;

public class SiakadFor26 {
    public static void main(String[] args) {
        Scanner rear = new Scanner(System.in);

        double nilai, tertinggi=0, terendah=100;
        int Lulus=0, TidakLulus=0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke- " + i + ": ");
            nilai=rear.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
         
        }
        System.out.println("Nilai Tertinggi: "+tertinggi);
        System.out.println("Nilai Terendah: "+terendah);

    }
}
    


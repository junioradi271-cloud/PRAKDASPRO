package pertemuan5;

import java.util.Scanner;

public class Tugas2Pemilihan26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Jumlah SKS: ");
        int jumlahSKS = sc.nextInt();

        if (jumlahSKS < 24) {
            System.out.println("KRS valid");

        } else {
            System.out.println("melebihi batas");
        }
    }
    
}

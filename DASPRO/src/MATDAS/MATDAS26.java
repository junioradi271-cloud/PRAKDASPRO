package MATDAS;

import java.util.Scanner;

public class MATDAS26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai mahasiswa: ");
        Double nilai = input.nextDouble();
        System.out.print("Masukkan persentase kehadiran: ");
        Double kehadiran = input.nextDouble();

        if (nilai >= 60 && kehadiran >= 80)
        System.out.println("Mahasiswa lulus");
        else
        if (nilai < 60 || kehadiran < 80)
        System.out.println("Mahasiswa tidak lulus");
    }
    
}

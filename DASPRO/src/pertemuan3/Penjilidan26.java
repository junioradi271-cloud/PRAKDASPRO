package pertemuan3;

import java.util.Scanner;

public class Penjilidan26 {
    public static void main(String[] args) {
        Scanner Rear = new Scanner(System.in);

        int Lembar;
        int Biaya_Perlembar;
        int Biaya_Penjilidan;
        double Total_Biaya;

        System.out.println("Masukkan Lembar: ");
        Lembar=Rear.nextInt();
        System.out.println("Masukkan Biaya Perlembar: ");
        Biaya_Perlembar=Rear.nextInt();
        System.out.println("Masukkan Biaya Penjilidan: ");
        Biaya_Penjilidan=Rear.nextInt();

        Total_Biaya=(Lembar*Biaya_Perlembar)+Biaya_Penjilidan;

        System.out.println("Total Seluruh Biaya: "+Total_Biaya);

    }
    
}

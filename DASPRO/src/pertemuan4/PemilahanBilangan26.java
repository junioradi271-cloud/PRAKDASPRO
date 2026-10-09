package pertemuan4;

import java.util.Scanner;

public class PemilahanBilangan26 {
    public static void main(String[] args) {
        Scanner rear = new Scanner(System.in);

        int angka;
        
        System.out.print("Masukkan Sebuah Angka: ");
        angka=rear.nextInt();

        if (angka %2 == 0) {

            System.out.println(" Angka " + angka + " Termasuk Bilangan Genap " );
            
        } else {
           
            System.out.println(" Angka " + angka + " Termasuk Bilangan Ganjil ");
        }
    }
    
}

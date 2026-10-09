package pertemuan3;

import java.util.Scanner;

public class MenghitungLuasPersegiPanjang26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int panjang;
        int lebar;
        int luas;
       System.out.println("Masukkan Panjang Persegi Panjang: ");
        panjang=sc.nextInt();
       System.out.println("Masukkan Lebar Persegi Panjang: "); 
        lebar=sc.nextInt();

        luas=panjang*lebar;
        System.out.println("Luas Persegi Panjang adalah: " +luas);
    
}

}
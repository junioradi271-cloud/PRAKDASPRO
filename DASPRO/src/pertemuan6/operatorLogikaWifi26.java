package pertemuan6;

import java.util.Scanner;

public class operatorLogikaWifi26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;

        System.out.print("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = sc.nextBoolean();

        System.out.print("Apakah pengguna dosen? (True/False): ");
        dosen = sc.nextBoolean();

        System.out.print("Apakah akun sedang diblokir? (True/False): ");
        akunDiblokir = sc.nextBoolean();

        if ((mahasiswa && dosen) && !akunDiblokir) {
            System.out.println("Akses WiFi diberikan");
        } else {
            System.out.println("Akses WiFi ditolak");
        }
    }
    
}

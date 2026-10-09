package pertemuan6;

import java.util.Scanner;

public class Pemilihan2Percobaan1_26 {
    public static void main(String[] args) {
        Scanner rear = new Scanner(System.in);

        int tahun;

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
                System.out.println("Tahun Kabisat");
        } else
            System.err.println("Bukan Tahun Kabisat");
    }
    
}

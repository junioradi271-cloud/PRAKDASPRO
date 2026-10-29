package Pertemuan10;

import java.util.Scanner;

public class Star26 {
    public static void main(String[] args) {
        Scanner rear = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = rear.nextInt();

        for (int i = 1; i <= n; i+= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        rear.close();
    }
}

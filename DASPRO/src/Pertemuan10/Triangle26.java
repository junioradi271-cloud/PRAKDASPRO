package Pertemuan10;

import java.util.Scanner;

public class Triangle26 {
    public static void main(String[] args) {
        Scanner rear = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = rear.nextInt();

        int i = 0;
        while (i <= n) {
            System.out.println("[i=" + i + "] ");
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
        }
        rear.close();
    }
}

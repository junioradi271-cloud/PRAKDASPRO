package Quiz;

import java.util.Scanner;

public class ReantalPS26 {
    public static void main(String[] args) {
        Scanner rear = new Scanner(System.in);

      int jam_penuh, Sisa_Menit, Total_Bayar;
        double Biaya_Member=12.5, Biaya_yang_harus_dibayar;

        System.out.println("Jam penuh: ");
        jam_penuh=rear.nextInt();
        System.out.println("Sisa menit: ");
        Sisa_Menit=rear.nextInt();
       
       Total_Bayar=jam_penuh*7000+Sisa_Menit*150;

        System.out.println("Total_Bayar"+ Total_Bayar);

        

        Biaya_Member=Total_Bayar/12.5;

          System.out.println("Biaya Member: " +Biaya_Member);

          Biaya_yang_harus_dibayar=Total_Bayar+Biaya_Member;

        System.out.println("Biaya_yang_harus_dibayar: "+Biaya_yang_harus_dibayar);
    }
    
}

//OUTPUT
//Jam penuh: 
//2
//Sisa menit: 
//3
//Total_Bayar14450
//Biaya Member: 1156.0
//Biaya_yang_harus_dibayar: 15606.0

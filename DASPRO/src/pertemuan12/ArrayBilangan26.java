//Percobaan 1 (uji wajib tambahan) 
//bil[0], bil[1], bil[2], bil[3]
//P ; P+8 ; −(1+(P mod 7)) ; 20+(P mod 15) = 26 ; 26+8 = 33 ; -(1+(5)) = -6 ; 20+(11) = 31
package pertemuan12;

import java.util.Arrays;

public class ArrayBilangan26 {
    public static void main(String[] args) {
        
        int[] bil = {26, 33, -6, 31};

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]+ " , double = " +(bil[i]*2));
        }
        for (int nilai : bil) {
            System.out.println(nilai);
        }
    System.out.println(Arrays.toString(bil));
    }
}

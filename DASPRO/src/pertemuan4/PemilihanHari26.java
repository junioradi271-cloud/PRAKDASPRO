package pertemuan4;

import java.util.Scanner;

public class PemilihanHari26 {
    public static void main(String[] args) {
        Scanner rear = new Scanner(System.in);

        String DayName, DayType;

        System.out.print("Input Day Name: ");
        DayName = rear.nextLine();

        switch (DayName.toLowerCase()) {
            case "monday" :
            case "tuesday" :
            case "wednesday" :
            case "thursday" :
            case "friday" :
                DayType = "weekday";
                break;
            case "saturday" :
            case "sunday" :
                DayType = "weekend";
                break;
            default:
                DayType = "invalid day time";

        }

        System.out.println(DayName + " is a " + DayType);
    }
    
}

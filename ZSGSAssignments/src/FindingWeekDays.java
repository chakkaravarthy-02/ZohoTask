

import java.util.Scanner;

public class FindingWeekDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(WeekDays day:WeekDays.values()){
            if(n-1== day.ordinal()){
                System.out.println(day.name());
            }
        }
    }
}

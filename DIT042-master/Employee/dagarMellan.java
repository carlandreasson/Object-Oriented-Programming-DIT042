package Employee;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

//VG feature 2

public class dagarMellan {
    public static long olof_krister() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the current date DD MM YY separate with SPACE or enter between each number"); //fixa scanner
        int day = scan.nextInt();
        int month = scan.nextInt();
        int year= scan.nextInt();

        year = year+2000;
        System.out.println(day+"/"+month+"/"+year);
        LocalDate dateBefore = LocalDate.of(2002, 02, 22);
        LocalDate dateAfter = LocalDate.of(year, month, day);
        long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
        System.out.println(noOfDaysBetween);
        return noOfDaysBetween;
    }
}

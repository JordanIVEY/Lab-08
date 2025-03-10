import java.util.Scanner;

public class BirthDateTime {
    public static void getBirthDateTime(Scanner pipe) {
        int year = SafeInput.getRangedInt(pipe, "Enter birth year", 1950, 2015);
        int month = SafeInput.getRangedInt(pipe, "Enter birth month", 1, 12);
        int daysInMonth = switch (month) 
        {
            case 4, 6, 9, 11 -> 30;
            case 2 -> 29;
            default -> 31;
        };
        int day = SafeInput.getRangedInt(pipe, "Enter birth day", 1, daysInMonth);
        int hour = SafeInput.getRangedInt(pipe, "Enter birth hour", 1, 24);
        int minute = SafeInput.getRangedInt(pipe, "Enter birth minute", 1, 59);

        System.out.printf("Birth Date and Time: %d/%d/%d %d:%d\n", month, day, year, hour, minute);
    }
}

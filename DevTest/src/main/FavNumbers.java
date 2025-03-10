import java.util.Scanner;

public class FavNumbers {
    public static void getFavoriteNumbers(Scanner pipe) {
        int favInt = SafeInput.getInt(pipe, "Enter your favorite integer");
        double favDouble = SafeInput.getDouble(pipe, "Enter your favorite double");
        System.out.println("Favorite Integer: " + favInt);
        System.out.println("Favorite Double: " + favDouble);
    }
}
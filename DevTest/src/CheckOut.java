import java.util.Scanner;

public class CheckOut {
    public static void runCheckOut(Scanner pipe) {
        double total = 0.0;
        boolean moreItems;
        do {
            double price = SafeInput.getRangedDouble(pipe, "Enter item price", 0.50, 10.00);
            total += price;
            moreItems = SafeInput.getYNConfirm(pipe, "Do you have more items?");
        } while (moreItems);
        System.out.printf("Total Cost: $%.2f\n", total);
    }
}

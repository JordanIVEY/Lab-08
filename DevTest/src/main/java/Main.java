import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Call each program
        //GetUserName.getUserName(in);
        //FavNumbers.getFavoriteNumbers(in);
        //BirthDateTime.getBirthDateTime(in);
        //CheckOut.runCheckOut(in);
        //Reggie.runRegexTests(in);
       // PrettyHeader.printHeader("Welcome to Java Lab");
        CtoFTableDisplay.printTemperatureTable();

        in.close();
    }
}

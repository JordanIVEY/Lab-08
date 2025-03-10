import java.util.Scanner;

public class Reggie {
    public static void runRegexTests(Scanner pipe) {
        String ssn = SafeInput.getRegExString(pipe, "Enter SSN (XXX-XX-XXXX)", "^\\d{3}-\\d{2}-\\d{4}$");
        String ucID = SafeInput.getRegExString(pipe, "Enter UC Student M Number (M12345)", "^(M|m)\\d{5}$");
        String menuChoice = SafeInput.getRegExString(pipe, "Enter menu choice (O, S, V, Q)", "^[OoSsVvQq]$");

        System.out.println("SSN: " + ssn);
        System.out.println("UC ID: " + ucID);
        System.out.println("Menu Choice: " + menuChoice);
    }
}

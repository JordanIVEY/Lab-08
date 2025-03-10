import java.util.Scanner;

public class GetUserName {
    public static String getUserName(Scanner pipe) {
        return SafeInput.getZeroLengthString(pipe, "Enter your name");
    }
}
import java.util.Scanner;
import java.util.regex.Pattern;

public class SafeInput {

    public static String getZeroLengthString(Scanner pipe, String prompt) {
        System.out.print(prompt + ": ");
        return pipe.nextLine().trim();
    }

    public static int getInt(Scanner pipe, String prompt) {
        int result = 0;
        boolean validInput = false;
        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                result = pipe.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                pipe.next();
            }
        } while (!validInput);
        pipe.nextLine();
        return result;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double result = 0;
        boolean validInput = false;
        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                result = pipe.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid double.");
                pipe.next();
            }
        } while (!validInput);
        pipe.nextLine();
        return result;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int result;
        do {
            result = getInt(pipe, prompt + " (" + low + " - " + high + ")");
        } while (result < low || result > high);
        return result;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double result;
        do {
            result = getDouble(pipe, prompt + " (" + low + " - " + high + ")");
        } while (result < low || result > high);
        return result;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response;
        do {
            System.out.print(prompt + " (Y/N): ");
            response = pipe.nextLine().trim().toUpperCase();
        } while (!response.equals("Y") && !response.equals("N"));
        return response.equals("Y");
    }

    public static String getRegExString(Scanner pipe, String prompt, String pattern) {
        String response;
        Pattern regex = Pattern.compile(pattern);
        do {
            System.out.print(prompt + ": ");
            response = pipe.nextLine();
            if (!regex.matcher(response).matches()) {
                System.out.println("Invalid format. Try again.");
            }
        } while (!regex.matcher(response).matches());
        return response;
    }

    public static void prettyHeader(String msg) {
        int width = 60;
        int padding = (width - msg.length() - 6) / 2;
        System.out.println("*".repeat(width));
        System.out.println("***" + " ".repeat(padding) + msg + " ".repeat(padding) + "***");
        System.out.println("*".repeat(width));
    }
}
public class CtoFTableDisplay {
    public static double CtoF(double Celsius) {
        return (Celsius * 9/5) + 32;
    }

    public static void printTemperatureTable() {
        System.out.println("Celsius | Fahrenheit");
        for (int c = -100; c <= 100; c++) {
            System.out.printf("%7d | %10.2f\n", c, CtoF(c));
        }
    }
}

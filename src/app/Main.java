package app;

public class Main {

    private static final double CONV_K = 1.60934;

    public static void main(String[] args) {

        System.out.println("Welcome to the program for converting units measuring distance!");
        double miInitial = 5;
        double kmInitial = 12;
        double km = convMiToKm(miInitial);
        double mi = convKmToMi(kmInitial);
        System.out.printf("Result: %.3f mile(s) = %.3f kilometer(s), and %.3f kilometer(s) = %.3f mile(s).", miInitial, km, kmInitial, mi);

    }

    private static double convMiToKm(double miInitial) {
        return miInitial * CONV_K;

    }

    private static double convKmToMi(double kmInitial) {
        return kmInitial / CONV_K;

    }

}
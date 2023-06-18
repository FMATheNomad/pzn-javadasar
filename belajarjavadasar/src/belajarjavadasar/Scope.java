package belajarjavadasar;

public class Scope {
    public static void main(String[] args) {
        int a = 5; // Variabel lokal dalam method main

        if (a > 0) {
            int b = 10; // Variabel lokal dalam blok if

            System.out.println("Nilai a: " + a);
            System.out.println("Nilai b: " + b);
        }

        // Variabel b tidak dapat diakses di luar blok if
        // System.out.println("Nilai b di luar blok if: " + b);
    }
}

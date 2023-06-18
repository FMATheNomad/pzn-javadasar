package belajarjavadasar;

public class Method {
    public static void main(String[] args) {
        // Memanggil method dengan parameter
        greet("John");

        // Memanggil method dengan return value
        int sum = add(5, 3);
        System.out.println("Hasil penjumlahan: " + sum);

        // Memanggil method dengan variable arguments
        double average = calculateAverage(2.5, 4.7, 3.2);
        System.out.println("Rata-rata: " + average);

        // Memanggil method dengan overloading
        int product1 = multiply(2, 3);
        System.out.println("Hasil perkalian 1: " + product1);

        double product2 = multiply(2.5, 3.7);
        System.out.println("Hasil perkalian 2: " + product2);
    }

    // Method tanpa parameter
    public static void greet() {
        System.out.println("Halo, selamat datang!");
    }

    // Method dengan parameter
    public static void greet(String name) {
        System.out.println("Halo, " + name + "!");
    }

    // Method dengan return value
    public static int add(int a, int b) {
        return a + b;
    }

    // Method dengan variable arguments
    public static double calculateAverage(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    // Method dengan overloading (versi untuk integer)
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method dengan overloading (versi untuk double)
    public static double multiply(double a, double b) {
        return a * b;
    }
}

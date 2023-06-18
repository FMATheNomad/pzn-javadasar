package belajarjavadasar;

public class ExpressionStatementDanBlock {
    public static void main(String[] args) {
        // Contoh ekspresi
        int a = 5;
        int b = 3;
        int c = a + b;

        // Contoh pernyataan
        if (c > 5) {
            System.out.println("Nilai c lebih besar dari 5");
        } else {
            System.out.println("Nilai c tidak lebih besar dari 5");
        }

        // Contoh blok
        {
            int d = 10;
            int e = d * c;
            System.out.println("Nilai e: " + e);
        }
    }
}

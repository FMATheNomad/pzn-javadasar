package belajarjavadasar;

public class IfStatement {
    public static void main(String[] args) {
        int x = 10;

        if (x > 5) {
            System.out.println("Nilai x lebih besar dari 5");
        }

        int y = 2;

        if (y % 2 == 0) {
            System.out.println("Nilai y adalah bilangan genap");
        } else {
            System.out.println("Nilai y adalah bilangan ganjil");
        }

        int z = 0;

        if (z > 0) {
            System.out.println("Nilai z adalah bilangan positif");
        } else if (z < 0) {
            System.out.println("Nilai z adalah bilangan negatif");
        } else {
            System.out.println("Nilai z adalah nol");
        }
    }
}

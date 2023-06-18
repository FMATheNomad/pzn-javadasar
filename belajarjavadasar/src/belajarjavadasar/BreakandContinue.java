package belajarjavadasar;

public class BreakandContinue {
    public static void main(String[] args) {
        // Contoh penggunaan break
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;  // Keluar dari perulangan jika i == 3
            }
            System.out.println("Nilai i (break): " + i);
        }

        System.out.println("---------------------");

        // Contoh penggunaan continue
        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                continue;  // Melanjutkan ke iterasi berikutnya jika j == 3
            }
            System.out.println("Nilai j (continue): " + j);
        }
    }
}

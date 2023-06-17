package belajarjavadasar;

public class OperasiMatematika {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		System.out.println(a + b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a - b);
		System.out.println(a % b);
		// Augmented Assignment
		System.out.println(a += 10);
		System.out.println(a *= 10);
		System.out.println(a /= 10);
		System.out.println(a -= 10);
		System.out.println(a %= 10);
		// Unary Operator
		// Unary operator untuk operasi increment dan decrement
        int angka = 10;
        System.out.println("Angka awal: " + angka);
        angka++; // Increment nilai angka
        System.out.println("Setelah increment: " + angka);
        angka--; // Decrement nilai angka
        System.out.println("Setelah decrement: " + angka);

        // Unary operator untuk operasi negatif dan positif
        int nilai = 5;
        int negatif = -nilai; // Mengubah nilai menjadi negatif
        int positif = +nilai; // Mengubah nilai menjadi positif
        System.out.println("Nilai: " + nilai);
        System.out.println("Negatif: " + negatif);
        System.out.println("Positif: " + positif);

        // Unary operator untuk operasi boolean kebalikan
        boolean status = true;
        boolean kebalikan = !status; // Mengubah nilai boolean menjadi kebalikannya
        System.out.println("Status: " + status);
        System.out.println("Kebalikan: " + kebalikan);
	}
}

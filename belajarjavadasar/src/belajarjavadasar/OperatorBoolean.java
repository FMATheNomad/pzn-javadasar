package belajarjavadasar;

public class OperatorBoolean {
	public static void main(String[] args) {
        boolean nilai1 = true;
        boolean nilai2 = false;
        
        // Operator boolean
        boolean hasilAnd = nilai1 && nilai2; // Operator AND (&&)
        boolean hasilOr = nilai1 || nilai2; // Operator OR (||)
        boolean hasilNot1 = !nilai1; // Operator NOT (!)
        boolean hasilNot2 = !nilai2;
        
        // Menampilkan hasil operasi boolean
        System.out.println("Hasil AND: " + hasilAnd);
        System.out.println("Hasil OR: " + hasilOr);
        System.out.println("Hasil NOT nilai1: " + hasilNot1);
        System.out.println("Hasil NOT nilai2: " + hasilNot2);
    }
}

package belajarjavadasar;

public class OperatorPerbandingan {
	public static void main(String[] args) {
        int angka1 = 5;
        int angka2 = 10;
        
        // Operator perbandingan
        boolean samaDengan = (angka1 == angka2); // Sama dengan
        boolean tidakSamaDengan = (angka1 != angka2); // Tidak sama dengan
        boolean lebihBesar = (angka1 > angka2); // Lebih besar
        boolean lebihKecil = (angka1 < angka2); // Lebih kecil
        boolean lebihBesarSamaDengan = (angka1 >= angka2); // Lebih besar sama dengan
        boolean lebihKecilSamaDengan = (angka1 <= angka2); // Lebih kecil sama dengan
        
        // Menampilkan hasil perbandingan
        System.out.println("Apakah angka1 sama dengan angka2? " + samaDengan);
        System.out.println("Apakah angka1 tidak sama dengan angka2? " + tidakSamaDengan);
        System.out.println("Apakah angka1 lebih besar dari angka2? " + lebihBesar);
        System.out.println("Apakah angka1 lebih kecil dari angka2? " + lebihKecil);
        System.out.println("Apakah angka1 lebih besar sama dengan angka2? " + lebihBesarSamaDengan);
        System.out.println("Apakah angka1 lebih kecil sama dengan angka2? " + lebihKecilSamaDengan);
    }
}

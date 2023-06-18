package belajarjavadasar;

public class ForEach {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Contoh penggunaan for-each untuk array
        System.out.println("Array numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("---------------------");

        // Contoh penggunaan for-each untuk string
        String message = "Hello, World!";

        // Mengubah string menjadi array karakter
        char[] characters = message.toCharArray();

        System.out.println("String message:");
        for (char character : characters) {
            System.out.println(character);
        }
    }
}

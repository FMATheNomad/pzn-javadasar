package belajarjavadasar;

public class Array {
	public static void main(String[] args) {
		String[] stringArray;
		stringArray = new String[3];
		stringArray[0] = "Fariz";
		stringArray[1] = "Muhammad";
		stringArray[2] = "Aditya";
		
		// langsung juga boleh
		
		String[] stringArray2 = new String[3];
		stringArray2[0] = "Fariz";
		stringArray2[1] = "Muhammad";
		stringArray2[2] = "Aditya";
		
		// mengubah data array
		
		stringArray[0] = "Budi";
		
		// print line
		
		System.out.println(stringArray[0]);
		System.out.println(stringArray[1]);
		System.out.println(stringArray[2]);
		System.out.println(stringArray2[0]);
		System.out.println(stringArray2[1]);
		System.out.println(stringArray2[2]);
		
		// bisa dipersingkat
		
		String[] nameItBro = {
				"Fariz", "Muhammad", "Aditya"
		};
		int[] arrayInt = new int[] {
				1,2,3,4,5,6,7,8,9,10
		};
		long[] arrayLong = new long[] {
				10L, 20L, 30L
		};
		
		// print line
		
		System.out.println(nameItBro[0]);
		System.out.println(arrayInt[0]);
		System.out.println(arrayLong[0]);
		
		// untuk mengetahui ada berapa banyak data dari sebuah array
		
		System.out.println(arrayLong.length);
		
		// untuk mengganti nilainya dengan angka 0
		
		arrayLong[0] = 0;
		nameItBro[0] = null;
		
		int[][] array2D = new int[3][3]; // Membuat array dua dimensi dengan ukuran 3x3

        // Mengisi nilai array dua dimensi
        array2D[0][0] = 1;
        array2D[0][1] = 2;
        array2D[0][2] = 3;
        array2D[1][0] = 4;
        array2D[1][1] = 5;
        array2D[1][2] = 6;
        array2D[2][0] = 7;
        array2D[2][1] = 8;
        array2D[2][2] = 9;

        // Mengakses nilai array dua dimensi
        int nilai = array2D[1][2]; // Mengakses nilai 6 pada baris 1 dan kolom 2
        System.out.println("Nilai: " + nilai);

        // Menampilkan seluruh isi array dua dimensi
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
	}
}

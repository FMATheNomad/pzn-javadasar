package belajarjavadasar;

public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 10;
        Boolean iniBoolean = true;
        Long iniLong = 10L;
        Short iniShort = 100;
        System.out.println(iniInteger);
        System.out.println(iniBoolean);
        System.out.println(iniLong);
        System.out.println(iniShort);

        // Jika ingin inisialisasi tapi nilainya kosong, dapat dilakukan sebagai berikut:
        Byte iniByte = null;
        System.out.println(iniByte);

        // Jika ingin mengubah nilai, dapat dilakukan seperti ini:
        iniByte = 100;
        System.out.println(iniByte);

        // Konversi primitif ke non-primitif
        int iniInt = 100;
        Integer iniInteger2 = Integer.valueOf(iniInt);
        int iniIntAgain = iniInteger2.intValue();
        System.out.println(iniIntAgain);

        int iniObject = iniInt;
        short iniShort2 = (short) iniObject;
        byte iniByte2 = (byte) iniObject;
        System.out.println(iniObject);
    }
}



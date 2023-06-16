package belajarjavadasar;

public class TieDataBukanPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 10;
        Boolean iniBoolean = true;
        Long iniLong = 10L;
        Short iniShort;
        iniShort = 100;
        System.out.println(iniInteger);
        System.out.println(iniBoolean);
        System.out.println(iniLong);
        System.out.println(iniShort);

        // jika ingin inisialisasi tapi nilainya kosong bisa lakukan:
        Byte iniByte = null;
        System.out.println(iniByte);

        // jika ingin mengubah value bisa:
        iniByte = 100;
        System.out.println(iniByte);

        // jika seperti ini: byte iniByte = null; output= error

        // konversi primitif ke bukan primitif
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


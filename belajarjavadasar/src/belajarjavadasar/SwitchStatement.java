package belajarjavadasar;

public class SwitchStatement {
    public static void main(String[] args) {
        int day = 5;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Senin";
                break;
            case 2:
                dayName = "Selasa";
                break;
            case 3:
                dayName = "Rabu";
                break;
            case 4:
                dayName = "Kamis";
                break;
            case 5:
                dayName = "Jumat";
                break;
            case 6:
                dayName = "Sabtu";
                break;
            case 7:
                dayName = "Minggu";
                break;
            default:
                dayName = "Hari tidak valid";
        }

        System.out.println("Hari ke-" + day + " adalah " + dayName);
    }
}

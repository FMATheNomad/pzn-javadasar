package belajarjavadasar;

public class TipeDataNumber {

	public static void main(String[] args) {
		byte iniByte = 100;
		int iniInteger = 1000;
		short iniShort = 10000;
		long iniLong = 100000000;
		long iniLong2 = 10000000L;
		
		float iniFloat = 10.000F;
		double iniDouble = 100.000;
		
		int decimalInt = 34;
		int hexaDecimal = 0xFFFFFF;
		int binaryDecimal = 0b01010101;
		
		long balance = 10_000_000_000L;
		int sum = 60_000_000;
		
		byte iniByte2 = 10;
		short iniShort2 = iniByte2;
		int iniInteger2 = iniShort2;
		long iniLong3 = iniInteger2;
		float iniFloat2 = iniLong3;
		double iniDouble2 = iniFloat2;
		
		float iniFloat3 = (float) iniDouble2;
		long iniLong4 = (long) iniFloat3;
	}

}

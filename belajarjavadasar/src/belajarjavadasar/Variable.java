package belajarjavadasar;

public class Variable {
	public static void main(String[] args) {
		String name;
		name = "Fariz Muhammad Aditya";
		String address;
		address = "Subang";
		int age = 20;
		System.out.println(name);
		System.out.println(address);
		System.out.println(age);
		// mengganti value variabel
		name = "Mahmoud Abbas";
		System.out.println(name);
		// kata kunci var
		var name2 = "Fariz Muhammad Aditya";
		var age2 = 20;
		var address2 = "Subang";
		System.out.println(name2);
		System.out.println(age2);
		System.out.println(address2);
		// tak boleh dilakukan:
		/* var name2;
		 * name2 = "Fariz Muhammad Aditya"; ini bakal error */
		// kata kunci final
		final String name3 = "Fariz Muhammad Aditya";
		var age3 = 20;
		var address3 = "Subang";
		System.out.println(name3);
		System.out.println(age3);
		System.out.println(address3);
		// error: final String name3 = "Ngaran digenti";
	}
}

public class Animal {
	
	String name;
	String eat;
	String color;
	String weight;
	
	void printAnimal(String n, String w, String z, String s) {
		System.out.println("Animal name : " + n);
		System.out.println("Animal eat : " + w);
		System.out.println("Animal color : " + z);
		System.out.println("Animal weight : " + s);
		
	}
	void printCharacteristics(String k, String x, String d, String p) {
		System.out.println("\nCharacteristics");
		System.out.println("Sound : " + x);
		System.out.println("Type : " + k);
		System.out.println("Dietary : " + d);
		System.out.println("Thermoregulation : " + p);
		
	}
	void printFood(double c, double e) {
		System.out.println("\nFood");
		System.out.println("Price : " + e + " Ringgit ");
		System.out.println("Food intake per day : " + c + " Grams ");
		
		
	}
	void printStrength(double a) {
		System.out.println("\nStrength");
		System.out.println("Running : " + a + " M/s ");
	
	}
}
public class Main {

	public static void main(String[] args) {
		
		Animal cat = new Animal(); //create first new object cat
		
		System.out.println("Cat");
		cat.printAnimal("Princess", "Royal Canin", "Brown", "3.6 - 4.5 Kg");
		cat.printFood(2);
		cat.printStrength(48);
		
		System.out.println();
		System.out.println("---------------------------------");
		
		Animal tiger = new Animal(); //create second new object tiger
		
		System.out.println("Tiger");
		tiger.printAnimal("Delta", "Meat", "Orange", "90 - 310 Kg");
		tiger.printFood(25);
		tiger.printStrength(65);
		
		System.out.println();
		System.out.println("---------------------------------");
		
        Animal horse = new Animal(); //create third new object horse
        
        System.out.println("Horse");
		horse.printAnimal("Ponies", "Haylage", "Dark Brown", "380 - 1000 Kg");
		horse.printFood(20);
		horse.printStrength(88);
		
	}
}

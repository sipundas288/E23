package demo;

public class Sipun {
	public static void address(String at, int pin) {
		
		System.out.println("Address: "+at+ ","+pin);
	}
	public static void address(String state) {
		System.out.println("State: "+state);
	}
	public static void address() {
		System.out.println("Hello");
		
	}

	public static void main(String[] args) {
		address("Odisha");
		address("Sana Indipur",759018);
		address();
		
		

	}

}

package Priklad147;

public class Finalize {

	public static void main(String[] args) {
		
		int pocet;
		
		UkazFin ob = new UkazFin(0);
		
		for (pocet = 1; pocet < 423830; pocet++) {
			ob.generate(pocet);
		}
		
	}
	
}
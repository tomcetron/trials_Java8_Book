package Priklad147;

public class UkazFin {
	
	int x;
	
	UkazFin(int i){
		x = i;
	}
	
	protected void finalize() {
		System.out.println("Probiha finalizace objektu " + x);
	}
	
	// generuje objekt ktery je okamzite znicen
	void generate(int i) {
		UkazFin o = 	new UkazFin(i);
	}
	
}

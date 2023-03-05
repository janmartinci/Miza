
/**
 * Deklariramo javni razred Steklenica
 * @author Jan Martinčič
 *
 */
public class Steklenica {

	/**
	 * Statična konstanta lasnost material
	 */
	public static final String material = "Steklo";

	// Deklariramo zasebne lastnosti razreda Steklenica
	private int kolicinaVsebine; 	// v ml
	private String vrstaVsebine;
	private boolean jeOdprta;
	private int kapaciteta;			// v ml
	
	/**
	 * Javni konstruktor
	 */
	public Steklenica() {
		
		// Inicializiramo lastnosti objekta
		kolicinaVsebine = 0;
		vrstaVsebine = "";
		jeOdprta = false;
		kapaciteta = 0;
		
		System.out.println("Ustvarjam nov objekt tipa Steklenica");
		
	}
	
	/**
	 * Javni konstruktor
	 * @param k kapaciteta steklenice
	 */
	public Steklenica(int k) {
		
		// Inicializiramo lastnosti objekta
		kolicinaVsebine = 0;
		vrstaVsebine = "";
		jeOdprta = false;
		kapaciteta = k;
		
		System.out.println("Ustvarjam nov objekt tipa Steklenica s kapaciteto " + k);
		
	}
	
	/**
	 * Javna metoda za polnjenje steklenice
	 * prišteje natančo količino in doda vrsto vsebine
	 * 
	 * @param k količino vsebine
	 * @param v vrsta vsebine
	 * @return količina vsebine po polnjenju
	 * @throws Exception vrže izjemo, če je steklenica zaprta
	 */
	public int napolni(int k, String v) throws Exception {
	
		System.out.println("Steklenico polnim z : " + v);
		System.out.println("Količina vsebine pred polnjenjem: " + kolicinaVsebine);
		
		// Če je steklenica odprta, poskusi napolniti
		if (jeOdprta) {
			// Prištejemo količino vsebine
			kolicinaVsebine += k;

			// Dodamo vrsto vsebine
			vrstaVsebine += v;
			
			System.out.println("Količina vsebine po polnjenju: " + kolicinaVsebine);
			
		} else {
		
			System.out.println("Steklenica je zaprta!");
			
			// Vržemo izjemo za neuspešno polnjenje
			throw new Exception("Steklenica je zaprta!");
		}
		
		// Vrnemo količino vsebine
		return kolicinaVsebine;
	}
	
	/**
	 * Javna metoda za odpiranje steklenice
	 * spremeni vrednost jeOdprta na true
	 * @return true - odpiranje uspešno, false - odpiranje ni uspešno
	 */
	public boolean odpri() {
	
	System.out.println("Odpiram steklenico ...");
	
		// Če je steklenica že odprta
		if (jeOdprta) {
		
			// Vrnemo false
			return false;
		
		}
		// Če je zaprta
		else {
		
			// Odpremo steklenico
			jeOdprta = true;
			
			// Vrnemo true
			return true;
		
		}
	
	}
	
	/**
	 * Javna metoda za zapiranje steklenice
	 * spremeni vrednost jeOdprta na false
	 * @return true - zapiranje uspešno, false - zapiranje ni uspešno
	 */
	public boolean zapri() {
	
	System.out.println("Zapiram steklenico ...");
	
		// Če je steklenica že zaprta
		if (!jeOdprta) {
		
			// Vrnemo false
			return false;
		
		}
		// Če je odprta
		else {
		
			// Zapremo steklenico
			jeOdprta = false;
			
			// Vrnemo true
			return true;
		
		}
	
	}
	
	/**
	 * Javna getter metoda
	 * @return količina vsebine
	 */
	public int getKolicinaVsebine() {
	
		return kolicinaVsebine;
	
	}

}

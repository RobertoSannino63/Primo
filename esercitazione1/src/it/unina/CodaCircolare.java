package it.unina;

public class CodaCircolare {

	private Studente [] array ;
	private int testa, coda, nelem, dim;
	
	public CodaCircolare () {
		dim = 5;
		array = new Studente [dim];
	}
	
	public CodaCircolare (int dimensione) {
		dim = dimensione;
		array = new Studente [dim];	
	}
	
	public Boolean vuoto () {
		return (nelem == 0);
	}
	
	public Boolean pieno() {
		return (nelem == dim);
	}
	
	public void inserisci (Studente x) {
		if( pieno() ) {
			System.out.println("La coda è piena");
			return;
		}
		array[coda] = x;
		coda = (coda + 1) % dim;
		nelem++;
	}
	
	public Studente estrai () {
		if ( vuoto() ) {
			System.out.println("La coda è vuota");
			return null;
		}
		Studente x = new Studente();
		x = array[testa];
		testa = (testa + 1) % dim;
		nelem --;
		return x;
		
	}
	
	public void stampa () {
		for(int i = 0; i < nelem; i++) {
			System.out.println(array[i] + "\n");
		}
	}
}


















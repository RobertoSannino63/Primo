package esercitazione1;

import it.unina.CodaCircolare;
import it.unina.Studente;
import it.unina.StudenteBiomedica;
import it.unina.StudenteTLC;

public class Esercitazione {
	
	public static void main(String[] args) {
	
		Studente Roberto = new Studente();
		StudenteBiomedica Marco = new StudenteBiomedica("Marco", "Crauso", 20);
		StudenteTLC Enzo = new StudenteTLC("Enzo", "Mazzella", 19);
		
	/*	System.out.println(Roberto + "\n");
		System.out.println(Marco + "\n");
		System.out.println(Enzo + "\n");  */
		
		CodaCircolare coda = new CodaCircolare();
		
		coda.inserisci(Roberto);
		coda.inserisci(Marco);
		coda.inserisci(Enzo);
		
		coda.stampa();
		
	}

}

package it.unina;

public class StudenteBiomedica extends Studente {
	
	private String corso = new String("Biomedica");
	
	public StudenteBiomedica() {
		super();
	}
	
	public StudenteBiomedica (String nome, String cognome, int eta) {
		super(nome, cognome, eta);
	}
	
	public String toString ()  {
		return (super.toString() + " Corso: " + corso);
	}
}

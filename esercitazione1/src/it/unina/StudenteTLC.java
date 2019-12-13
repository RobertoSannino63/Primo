package it.unina;

public class StudenteTLC extends Studente {
	
	private String corso = new String("TLC");
	
	public StudenteTLC() {
		super();
	}
	
	public StudenteTLC(String nome, String cognome, int eta) {
		super(nome, cognome, eta);
	}

	public String toString() {
		return super.toString() + " Corso: " + corso;
	}
}

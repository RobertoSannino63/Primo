package it.unina;

public class Studente {
	private String Nome;
	private String Cognome;
	private int Eta;
	
	public Studente () {
		Nome = new String();
		Cognome = new String();
		Eta = 0;            
	}
	
	public Studente (String nome, String cognome, int eta) {
		Nome = new String(nome);
		Cognome = new String(cognome);
		Eta = eta;
	}
	
	public String getNome () {
		return new String(Nome); 
	}
	
	public String getCognome () {
		return Cognome;          
	}

	public int getEta () {
		return Eta;
	}
	
	public void setNome (String nuovoNome) {
		Nome = new String(nuovoNome);
	}
	
	public void setCognome (String nuovoCognome) {
		Cognome = nuovoCognome;
	}
	
	public void setEta (int nuovaEta) {
		Eta = nuovaEta;
	}
	
	public String toString () {
		return ("Nome: " + Nome + " Cognome: " + Cognome + " Età: " + Eta + " ");
	}
}

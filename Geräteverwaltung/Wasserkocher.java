package Geräteverwaltung;
//extends = erweitern um die Superklasse & beim Konstruktor super und attribute schreiben -> wasserkocher wird unterklasse
//da Attribute watt und gewicht in der superklasse dekleriert sind muss man sie hier nid schreiben

public class Wasserkocher extends Kuechengeraet{
	private int aufheizzeit;		//aufheizzeit is gekapselt -> nur Methoden der Klasse selbst können drauf zugreifen & nur innerhalb der Klasse
									//selbst sichtbar
	
	public Wasserkocher(int watt, int gewicht, int aufheizzeit) {
		super(watt, gewicht);
		this.aufheizzeit = aufheizzeit;
	}
//getter und seter von watt und gewicht in superklasse -> wird hier nid hingschriebn
	
	
	public int getAufheizzeit() {
		return aufheizzeit;
	}

	public void setAufheizzeit(int aufheizzeit) {
		this.aufheizzeit = aufheizzeit;		//this->referenzvariable wurde erzeugt
	}

	public String toString() {
		String neueZeile = "\n";
		String ausgabeText = "Wasserkocher:" + getWatt() + "," + getGewicht() + "," + getAufheizzeit() + neueZeile;
		return ausgabeText;
	}

	
}

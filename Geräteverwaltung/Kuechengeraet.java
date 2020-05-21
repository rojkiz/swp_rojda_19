package Ger�teverwaltung;

public class Kuechengeraet {
	
	//Superklasse vererbt watt und gewicht an Unterklassen
	private int watt, gewicht;		//private dient als kapselung
	public Kuechengeraet(int watt, int gewicht) {
		super();
		this.watt = watt;
		this.gewicht = gewicht;
	}
	public int getWatt() {
		return watt;
	}
	public void setWatt(int watt) {
		this.watt = watt;
	}
	public int getGewicht() {
		return gewicht;
	}
	public void setGewicht(int gewicht) {
		this.gewicht = gewicht;
	}

	
}

//bei getter: return n�tig weil man den wert bekommen will
//bei setter:  void als R�ckgabewert, also keinen-wei�t nur einen neuen Wert zu; Innerhalb der runden Klammern wird eine Variable
//vom gleichen Variablentypen wie die zu setzende Variable erzeugt
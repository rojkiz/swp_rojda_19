package Geräteverwaltung;

//extends = erweitern um die Superklasse & beim Konstruktor super und attribute schreiben -> mixer wird unterklasse
//da Attribute watt und gewicht in der superklasse dekleriert sind muss man sie hier nid schreiben
public class Mixer extends Kuechengeraet{
	
	private int umdrehungenProMinute;	//umdrehungenProMinute is gekapselt -> nur Methoden der Klasse selbst können drauf zugreifen & nur innerhalb der Klasse
										//selbst sichtbar
	
	public Mixer(int watt, int gewicht, int umdrehungenProMinute) {
		super(watt, gewicht);
		this.umdrehungenProMinute = umdrehungenProMinute;		
	}
//getter und seter von watt und gewicht in superklasse -> wird hier nid hingschriebn

	public int getUmdrehungenProMinute() {
		return umdrehungenProMinute;
	}

	public void setUmdrehungenProMinute(int umdrehungenProMinute) {
		this.umdrehungenProMinute = umdrehungenProMinute;		//this->referenzvariable wurde erzeugt
	}

		public String toString() {
			String neueZeile = "\n";
			String ausgabeText = "Mixer:" + getWatt() + "," + getGewicht() + "," + getUmdrehungenProMinute() + neueZeile;
			return ausgabeText;
		}
	
	
}

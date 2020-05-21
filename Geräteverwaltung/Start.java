package Geräteverwaltung;



public class Start {
	
	public static Wasserkocher Wasserkocher1 = new Wasserkocher(700,1200,7); //Objekte erzeugen und mit Werten füllen
	public static Mixer Mixer1 = new Mixer(2000,1500,30000); 
	
	 public static void main(String[] args) {
		  System.out.println(Mixer1);				//werte ausgeben
		  System.out.println(Wasserkocher1);
	 }

}

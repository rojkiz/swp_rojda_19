package Fakult�t;

public class fakult�t {

	
	
	public static int fac(int n) {  	//n = fakult�t
		
	
		int x=1;			//mit was es multipliziern anfangt
		for(int i=1; i<=n; i++) {
			x*=i;			//tut f�r x immer den neuen wert ausrechnen und rechnet mit dem weiter bis die schleife fertig is
		}
		System.out.println(x);
		return x;

	}
	
	public static void main(String[] args) {
		fac(4);
		}
	
}

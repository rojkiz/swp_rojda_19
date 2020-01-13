package rekursiveFakultät;

public class recfac {

	
		public static int fac_rec(int n ) {
			if(n==1) {			//Abbruchbedingung
				return 1;
			}
		return n*fac_rec(n-1);		//Rekursiojnsfortschritt
		}
		
	public static void main(String[] args) {
			fac_rec(4);
	}

}

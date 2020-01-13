package pascalschesDreieck;

public class pasDr {
	public static int pt(int n, int x) {
		
		if( x==0 ) {
			return 1;
		}
		
		if( n==x ) {
			return 1;
		}
		return pt(n-1,x-1) + pt(n-1,x);
	}
	
	public static void main(String[] args) {
		System.out.println(pt(4,2));
	}

}

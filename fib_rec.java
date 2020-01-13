package fibonacci_rek;

public class fib_rec {

	
	public static int fibo_rec(int n) {
		
		if( n==0 ) {
			return 0;
		}
		
		if( n==1 ) {
			return 1;
		}
		return fibo_rec(n-2) + fibo_rec(n-1);
	}
	
	
	public static void main(String[] args) {
		System.out.println(fibo_rec(10));
	}

}

package Primzahlen;

public class Primzahlen {
	private static boolean checkIfPrime(int x1, int x2)	{
			
			if(x2 == 1)	{
				return true;
			} else if(x1 % x2 == 0)	{
				return false;
			}
			return checkIfPrime(x1, x2 - 1);
			
		}
		
		public static void main(String[] args) {
			int zahl = 9;
			System.out.println(checkIfPrime(zahl, zahl - 1));
		}
}

package Quersumme;

public class Quersumme {
	public static int Summe(int x)	{
			
			if(x / 10 == 0)	{
				return x;
			}
			return Summe(x / 10) + x % 10;
			
		}
	
		public static void main(String[] args) {
			int x = 18;
			if(x < 0)
			{
				x = x * -1;
			}
			System.out.println(Summe(x));
		}
}

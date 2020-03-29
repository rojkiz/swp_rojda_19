package Formel;

public class Formel {
public static int formel(int x)	{
		
		if(x == 1)	{
			return 1;
		}
		else {
		return formel(x - 1) + 2 * x - 1;
		}
	}

	public static void main(String[] args) {
		int x = 6;
		System.out.println(formel(x));
	}
}

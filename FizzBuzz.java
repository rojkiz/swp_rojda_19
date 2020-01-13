package fizzbuzz;

public class FizzBuzz {

	public static void main(String[] args) {

		
				
				for(int i =1; i<101; i++){
					String s = i + ": ";
					boolean alreadyPrinted = false;
					
					if(i%3 == 0)
					{
						s += "fizz";
						alreadyPrinted = true;
					}
					
					if(i%4 == 0)
					{
						s += "buzz";
						alreadyPrinted = true;
					}
					
					if( !alreadyPrinted) {
						s += Integer.toString(i);
					}
					
					System.out.println(s);
				}
			
	}

}

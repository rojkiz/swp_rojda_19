package Benchmark;

import java.lang.*;
import java.util.ArrayList;
import java.util.Random;


public class benchmark {
 
	public static ArrayList<Integer> getRandomList(int length){
		
		
		ArrayList<Integer> arrayRandom = new ArrayList<Integer>(); 

	     for (int i=0; i<10; i++) 
	     { 
	      Random rand = new Random(); 
	      rand.setSeed(System.currentTimeMillis()); 
	      Integer r = rand.nextInt() % 256; 
	      arrayRandom.add(r); 

  } 

	     return arrayRandom; 
	    } 
	
	

	}




package pasDreieckIterativ;

import java.util.Scanner;

public class padDrIt {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Höhe des Dreiecks");
        int lines = sc.nextInt();
        int naechsteZeile[];
        int[][] pascal = new int[lines][lines];
        for(int i=1; i<=lines; i++) {
        naechsteZeile[i] = lines[i-1] + lines[i];
        lines = naechsteZeile; 
		}
		print(lines);
        }
	}



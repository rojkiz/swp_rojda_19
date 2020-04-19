package Zahlensuche;

public class Zahlensuche {

	public static void main(String[] args) {
		int search = 70;
		System.out.println("Suche nach: " + search);
		int arr[] = randomlist(20, 8);
		System.out.printf("Zahl %d ist an Stelle: %d\n",search,search(search,arr));
	}
	
	private static int[] randomlist(int size, int range) {
		int r[] = new int[size];
		int min = 0;
		int max = range;
		for (int i = 0; i < r.length; i++) {
			r[i] = (int)((Math.random() * (max+1 - min)) + min);
			if(i - 1 < 0) {
				min += r[i];
				max += r[i];
			}
			else {
				min = min + ( r[i] - r[i-1]);
				max = max + (r[i] - r[i-1]);
			}
		}
		return r;
	}
	
	private static int[] subArray(int from, int to, int[] arr) {
		int r[] = new int[to-from];
		for(int i = from; i < to; i++) {
			r[i-from] = arr[i];
		}
		return r;
	}
	
	private static int search(int num, int[] arr) {
		print(arr);
		System.out.println("\t|\t" + arr[arr.length/2]);
		if(arr[arr.length/2] == num) {
			return arr.length/2;
		}
		else if(arr.length == 1) {
			return -1;
		}
		else if(arr[arr.length/2] > num) {
			int r = search(num, subArray(0,arr.length/2, arr));
			System.out.println("\t:" + r);
			if(r < 0 || arr[arr.length/2 + r] != num) {
				return r;
			}
			else {
				return r + arr.length/2;
			}
		}
		else {
			int r = search(num, subArray(arr.length/2 ,arr.length, arr));
			System.out.println("\t:" + r);
			if(r < 0 || arr[arr.length/2 + r] != num) {
				return r;
			}
			else {
				return r + arr.length/2;
			}
		}
	}
	
	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}


}



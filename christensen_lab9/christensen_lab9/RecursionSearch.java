package christensen_lab9;

import java.util.Random;
import java.util.Arrays;

public class RecursionSearch {

	//checks how many times each method is ran
	public static int checksR;
	public static int checksI;
	public static int checksB;
	
	public static void main(String[] args) {
		
		Random r = new Random();
		int upperbound = 25;//size
		int target = 6; //the target
		
		int[] array = new int[upperbound];  //creates the array
		for(int j=0; j<upperbound; j++){
			array[j]=r.nextInt(upperbound);
		}
		
//--------------------------------------------------------------------------
//Print Statements(Demo)
		
//		System.out.println("***The Array***"); //to preview the array
//		System.out.println(Arrays.toString(array));
//		System.out.println();
		
		System.out.println("***Iterative Linear Search***");
		System.out.println("Target " + target + " found at index " + linearSearchI(array,target,(upperbound-1)));
		System.out.println(checksI + " searches required for input size " + upperbound);
		System.out.println();
		
		System.out.println("***Recursive Linear Search***");
		System.out.println("Target " + target + " found at index " + linearSearchR(array,target,(upperbound-1)));
		System.out.println(checksR + " searches required for input size " + upperbound);
		System.out.println();

		Arrays.sort(array);//sorts it so the method can work
		System.out.println("***Binary Search***");
		System.out.println("Target " + target + " found at index " + binarySearch(array,target,1,(upperbound-1)));
		System.out.println(checksB + " searches required for input size " + upperbound);
		System.out.println();
	}
	
//--------------------------------------------------------------------------
//Binary Search Iterative
	
	public static int binarySearch(int[] data, int target, int low, int high) {
		checksB++;
		if (low>high)
			return -1;
		else {
			int mid = (low + high) / 2;
			if (target == data[mid]) {
				return mid;
			}else if (target < data[mid]) {
				return binarySearch(data, target, low, mid - 1);
			
			}else {
				return binarySearch(data, target, mid + 1, high);
			}
			}
	}
	
//--------------------------------------------------------------------------
//Linear Search Iterative
	
	public static int linearSearchR(int[] data, int target, int size) {
		checksR++;
		int location = size;
		if (0>location)
			return -1;
		else {
			if (target == data[location])
				return location;
			else
				return linearSearchR(data, target, size - 1);
			}
	}
	
//--------------------------------------------------------------------------
//Linear Search Recursive
	
	public static int linearSearchI(int[] data, int target, int size) {
		for (int j = 0; j < size-1; j++) {
			checksI++;
			if(target == data[j])
				return j;		
		}
		return -1;
	}
}

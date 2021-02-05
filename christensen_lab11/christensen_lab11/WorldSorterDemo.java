package christensen_lab11;

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;

//output files SortedByAlpha.txt, SortedByLength.txt

public class WorldSorterDemo {
	public static void main (String [] args) {
		String word;
		String[] docArray = new String[100];
		int index = 0;
		String temp;
		try{
			Scanner fileInput = new Scanner (new File ("Housman.txt"), "UTF-8");
	        while (fileInput.hasNext()){	// check  for next token (String)
	        	word = fileInput.next().replaceAll("[^a-zA-Z0-9-]", "").toLowerCase();
	        	docArray[index] = word;
	        	index++;	      	        	
	        } 
	        System.out.println(index);
	        String[] lengthArray = new String[index];
	        
	        for (int i = 0; i<lengthArray.length; i++) {
	        	lengthArray[i] = docArray[i];
	        }
	        fileInput.close();
	        
        	System.out.println(Arrays.deepToString(lengthArray));
        	
        	StringLengthComparator comparat = new StringLengthComparator();
        	
        	
        	lengthArray = MergeSort.mergeSort(lengthArray, comparat);
        	
        	String[] alphaArray = docArray;
        	
        	for (int i = 0; i < index; i++) 
            {
                for (int j = i + 1; j < index; j++) { 
                    if (alphaArray[i].compareTo(alphaArray[j])>0) 
                    {
                        temp = docArray[i];
                        alphaArray[i] = alphaArray[j];
                        alphaArray[j] = temp;
                    }
                }
            }
        	try {
        		PrintWriter outputFile = new PrintWriter (new FileWriter ("SortedByLength.txt"));
			
        		for (int i = 0; i < lengthArray.length; i++) {
        			outputFile.println(lengthArray[i]);
        		}
        		outputFile.println();
        		outputFile.println("Word Count: " + lengthArray.length);
        		outputFile.close();
        	}catch (IOException exc) {
			System.out.println("There was a problem opening the file for output");
        	}
        	try {
        		PrintWriter outputFile = new PrintWriter (new FileWriter ("SortedByAlpha.txt"));
			int alphaArrayCount = 0;
        		for (int i = 0; i < alphaArray.length; i++) {
        			if(!(alphaArray[i]==null)) {
        				outputFile.println(alphaArray[i]);
        				alphaArrayCount++;
        			}
        			
        		}
        		outputFile.println();
        		outputFile.println("Word Count: " + alphaArrayCount);
        		outputFile.close();
        	}catch (IOException exc) {
			System.out.println("There was a problem opening the file for output");
        	}
		}catch (FileNotFoundException exc){
            System.out.println("There was a problem opening the input file");
        }
		
	}
}

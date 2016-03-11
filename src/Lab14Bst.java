// Lab14Bst.java
// The "Text Files of Names" Program
// This is the student, starting version of Lab 14B.

import java.io.*;

public class Lab14Bst
{
	private static String names[];
	private static int fileSize;
	
	public static void main (String args[]) throws IOException
	{		
		System.out.println("\nLab14B\n");
		names = new String[100];
		readFile("Names1.txt");
		displayArray();
		sortArray();              
//		displayArray();           // Uncomment this line for 100 point version only.                 
		writeFile("Names2.txt");  
	}
	
	public static void readFile(String fileName) throws IOException
	{
		{
			ExpoInFile read = new ExpoInFile("./src/" + fileName);
			System.out.println("\nJAVA1401.JAVA\n\n");
			String inString = read.readString(); 
			
			String readString = read.readString();
			while(inString != null)
			{
				System.out.println(inString);
				inString = read.readString();
			}
			read.closeFile();	
			System.out.println("\n\n");  
		}
	}
	
	public static void displayArray()
	{
		System.out.println("Names Array Contents\n");
	
		//for(int k = 1; k < names.length; k++);
	}
	
	public static void sortArray()
	{

	}
	
	public static void writeFile(String fileName) throws IOException
	{
	
	}
}








     
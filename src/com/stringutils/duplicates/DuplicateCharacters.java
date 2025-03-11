package com.stringutils.duplicates;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCharacters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String :");
		
		String str = sc.nextLine();
		
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char ch : str.toCharArray()) 
		{
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}
		
		System.out.println("Duplicate Elements : \n");
		for (char ch : hm.keySet()) 
		{	
			if (hm.get(ch) > 1) 
			{	
				System.out.println(ch + " -> " + hm.get(ch));
			}
		}
		
	}

}

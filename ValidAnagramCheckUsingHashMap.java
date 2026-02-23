package com.arushi.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ValidAnagramCheckUsingHashMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String : ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter second String : ");
		String str2 = sc.nextLine();
		
		if(str1.length() != str2.length())
		{
			System.out.println("String is NOT Anagram...");
			return;
		}
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < str1.length(); i++)
		{
			char ch = str1.charAt(i);
			if(ch == ' ') continue;
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		for(int i = 0; i < str2.length(); i++)
		{
			char ch = str2.charAt(i);
			if(!map.containsKey(ch)) {
				System.out.println("Not an Anagram...");
				return;
			}
			map.put(ch, map.get(ch) - 1);

		    if(map.get(ch) == 0) {
		        map.remove(ch);
		    }
		}
		
		if(map.isEmpty()) {
		    System.out.println("The given Strings are Anagram...");
		} else {
		    System.out.println("Not An Anagram...");
		}
		
	}

}

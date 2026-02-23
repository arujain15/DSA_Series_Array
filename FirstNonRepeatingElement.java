package com.arushi.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingElement {

	public static void main(String[] args) {
		int []arr = {2, 2, 3, 3, 4};
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(Integer num : arr)
		{
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		
		for(Integer num : arr)
		{
			if(map.get(num) == 1)
			{
				System.out.println("First Non-Repeating number : " + num);
				break;
			}
		}

	}

}

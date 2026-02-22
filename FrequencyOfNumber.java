package com.arushi.arrayd7;

import java.io.IO;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(IO.readln("Enter the size of the array : "));
		int[] arr = new int[size];
		
		System.out.print("Enter the elements of array : ");
		for(int i = 0; i < size;i++) {
			arr[i] = sc.nextInt();
		}
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(Integer num : arr)
		{
			map.put(num,map.getOrDefault(num, 0) + 1);
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
}

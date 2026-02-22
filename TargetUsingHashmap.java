package com.arushi.arrayd7;

import java.io.IO;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TargetUsingHashmap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(IO.readln("Enter the size of the array : "));
		int[] arr = new int[size];
		
		System.out.print("Enter the elements of array : ");
		for(int i = 0; i < size;i++) {
			arr[i] = sc.nextInt();
		}
		
		int target = Integer.parseInt(IO.readln("Enter the target : "));
		
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(arr[0], 0);
		 for (int i = 0; i < arr.length; i++) {
			 int complement = target - arr[i];
			 if(map.containsKey(complement))
			 {
				 System.out.println("Indices: " + map.get(complement) + ", " + i);
			        return; 
			 }
			 else {
				 map.put(arr[i], i);
			 }
			 
		 }
        
	}

}

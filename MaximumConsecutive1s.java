package com.arushi.array_d6;

import java.io.IO;
import java.util.Scanner;

public class MaximumConsecutive1s {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = Integer.parseInt(IO.readln("Enter the size of the array : "));
		
		int [] arr = new int[size];
		System.out.print("Enter the elements of the array : ");
		for(int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int currentCount = 0;
		int maxCount = 0;
		
		for(int i = 0; i < size; i++)
		{
			if(arr[i] == 1) {
				currentCount++;
				if(currentCount > maxCount)
				{
					maxCount = currentCount;
				}
			}
			else {
				currentCount = 0;
			}
		}
		
		System.out.println(maxCount);
	}
}

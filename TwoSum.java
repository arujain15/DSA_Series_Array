package com.arushi.array_d6;

import java.io.IO;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = Integer.parseInt(IO.readln("Enter the size of the array : "));
		
		int [] arr = new int[size];
		System.out.print("Enter the elements of the array : ");
		for(int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int target = Integer.parseInt(IO.readln("Enter the target : "));
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size; j++)
			{
				if((arr[i] + arr[j]) == target)
				{
					System.out.println("Indices : " + i + ", " + j);
					return;
					
				}
			}
		}

	}

}

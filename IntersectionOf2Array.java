package com.arushi.array_d6;

import java.io.IO;
import java.util.Scanner;

public class IntersectionOf2Array {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int size = Integer.parseInt(IO.readln("Enter the size of first array : "));
		
		int [] arr = new int[size];
		System.out.print("Enter the elements of the array : ");
		for(int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int size2 = Integer.parseInt(IO.readln("Enter the size of second array : "));
		
		int [] brr = new int[size];
		System.out.print("Enter the elements of the array : ");
		for(int i = 0; i < size2; i++)
		{
			brr[i] = sc.nextInt();
		}
		for(int i = 0; i < size; i++)
		{
			for(int j = 0; j < size2;j++)
			{
				if(arr[i] == brr[j])
				{
					System.out.println(arr[i] + " ");
					return;
				}
			}
		}
			
	}

}

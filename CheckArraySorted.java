package com.arushi.arrayd4;

import java.io.IO;
import java.util.Scanner;

public class CheckArraySorted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(IO.readln("Enter the size of array : "));
		
		int arr[] = new int[size];
		
		System.out.print("Enter the elements of array : ");
		for(int i = 0; i< arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		boolean isSorted = true;
		int c = 0;
		for(int i = 0; i < arr.length - 1; i++)
		{
			if(arr[i] > arr[i+1])
			{
				isSorted = false;
				break;
			}
		}
		System.out.println();
		if(isSorted == true)
		{
			System.out.println("Sorted");
		}
		else {
			System.out.println("Not Sorted");
		}
	}

}

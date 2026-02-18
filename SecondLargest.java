package com.arushi.arrayd3;

import java.io.IO;
import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(IO.readln("Enter the size of Array : "));
		int[] arr = new int[size];
		
		System.out.println("Enter the elements of array : ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;


		for(int i = 0;i < arr.length; i++)
		{
			if(arr[i] > largest)
			{
				secondLargest = largest;
				largest = arr[i];
			}
			else if(arr[i] > secondLargest && arr[i] < largest)
			{
				 secondLargest = arr[i] ;
			}
		}
		
		System.out.println("Second largest : " + secondLargest);
		
	}
}

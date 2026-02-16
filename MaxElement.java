package com.arushi.arrayd1;

import java.util.Scanner;

public class MaxElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = Integer.parseInt(sc.nextLine());
		
		int arr[] = new int[size];
		System.out.print("Enter elements of array : ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		int max = arr[0];
		for(int i = 1; i < size; i++)
		{
			
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		System.out.println();
		System.out.println("The max element in array : " + max);
		

	}

}

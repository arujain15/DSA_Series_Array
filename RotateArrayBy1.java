package com.arushi.arrayd5;

import java.io.IO;
import java.util.Scanner;

public class RotateArrayBy1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(IO.readln("Enter the size of array : "));
		int arr[] = new int[size];
		System.out.print("Enter the array elements : ");
		
		for(int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int t = arr[0];
		
		for(int i = 0; i < size - 1; i++)
		{
			arr[i] = arr[i+1];
		}
		arr[size - 1] = t;
		
		for(int i = 0; i < size ;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}

}

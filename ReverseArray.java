package com.arushi.arrayd3;

import java.io.IO;
import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(IO.readln("Enter the size of Array : "));
		int[] arr = new int[size];
		
		System.out.println("Enter the elements of array : ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print( arr[i] + " ");
		}
		
		System.out.println();
		for(int i = size - 1; i >= 0; i--)
		{
			System.out.print(arr[i] + " ");
		}
		
	}

}

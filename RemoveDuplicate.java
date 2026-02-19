package com.arushi.arrayd4;

import java.io.IO;
import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(IO.readln("Enter the size of array : "));
		
		int arr[] = new int[size];
		
		System.out.print("Enter the elements of array : ");
		for(int i = 0; i< arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		int c = 0;
		
		for(int i = 0; i < size;i++)
		{
			if(arr[c] != arr[i])
			{
				c++;
				arr[c] = arr[i];
			}
		}
		
		
		
		for(int i = 0; i <= c;i++)
		{
			System.out.print(arr[i] + " ");
		}
		

	}

}

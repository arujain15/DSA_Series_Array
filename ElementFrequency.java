package com.arushi.arrayd2;

import java.io.IO;
import java.util.Scanner;

public class ElementFrequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(IO.readln("Enter the size of array : "));
		
		int arr[] = new int[size];
		IO.print("Enter the elements of array : ");
		for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
		
		int key = Integer.parseInt(IO.readln("Enter the element whose frequency you want : "));
		int c =0;
		for(int i = 0; i < size; i++)
		{
			if(key == arr[i])
			{
				c++;
			}
		}
		
		IO.println("The frequency of " + key + " is : " + c);
	}
}

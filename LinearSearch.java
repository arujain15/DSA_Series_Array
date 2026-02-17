package com.arushi.arrayd2;

import java.io.IO;
import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(IO.readln("Enter the size of array : "));
		
		int arr[] = new int[size];
		IO.print("Enter the elements of array : ");
		for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

		boolean flag = false;
		
		int key = Integer.parseInt(IO.readln("Enter the element to find : "));
		
		for(int i = 0; i< size; i++)
		{
			if(key == arr[i])
			{
				flag = true;
				break;
			}
		}
		
		if(flag == true)
		{
			IO.println("Element Found");
		}
		else
		{
			IO.println("Element not found");
		}
	}

}

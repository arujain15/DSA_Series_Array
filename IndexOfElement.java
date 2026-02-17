package com.arushi.arrayd2;

import java.io.IO;
import java.util.Scanner;

public class IndexOfElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(IO.readln("Enter the size of array : "));
		
		int arr[] = new int[size];
		IO.print("Enter the elements of array : ");
		for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
		
		int index = -1;
		
		int key = Integer.parseInt(IO.readln("Enter the element to search index : "));
		
		for(int i = 0; i < size; i++)
		{
			if(key == arr[i])
			{
				index = i;
				break;
			}
		}
		
		System.out.println("Index = " + index);
	}
}

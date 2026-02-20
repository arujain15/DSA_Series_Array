package com.arushi.arrayd5;

import java.io.IO;
import java.util.Scanner;

public class FindMissingNumberInSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = Integer.parseInt(IO.readln("Enter the number of elements : "));
		int arr[] = new int[size - 1];
		
		System.out.print("Enter the elements : ");
		
		for(int i = 0; i < arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int sumOfIndex= size * (size + 1)/2;
		int sumOfEle = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sumOfEle += arr[i];
		}
		System.out.println(sumOfIndex);
		System.out.println(sumOfEle);
		
		int missingingEle = sumOfIndex - sumOfEle;
		
		System.out.println("Missing Number = " + missingingEle);
	}

}



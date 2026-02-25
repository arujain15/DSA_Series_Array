package com.arushi.arrayd3;

import java.util.Arrays;

public class ZerosAtEnd2 {

	public static void main(String[] args) {
		int []arr = {0, 1, 3, 4, 0, 9, 5};
		int brr[] = new int[arr.length];
		
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 0)
			{
				brr[index++] = arr[i];
			}
		}
		
		System.out.println(Arrays.toString(brr));

	}

}

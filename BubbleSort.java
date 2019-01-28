package com.submit;

public class BubbleSort {

	public static void main(String[] args) {
		int [] arr = {9,8,7,6,5,4,3,2,1};
		print(arr);
		bubbleSort(arr);
		print(arr);
	}

	public static void print(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
	}
	
	public static void bubbleSort(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length-i; j++) {
				if(arr[j-1]>arr[j]) {
					int tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
}

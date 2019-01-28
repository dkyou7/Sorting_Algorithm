package com.submit;

public class InsertionSort {

	public static void main(String[] args) {
		int [] arr = {9,8,7,6,5,4,3,2,1};
		print(arr);
		InsertionSort(arr);
		print(arr);
	}
	private static void InsertionSort(int[]arr) {
		int tmp, index=0;
		for (int i = 1; i < arr.length; i++) {	//0 아니고 1부터 시작한다.
			tmp = arr[i]; //데이터 기준을 잡는다.
			for (int j = i-1; j>=0 && arr[j]>tmp; j--) {	// <--- 기준점 한칸씩 뒤로 밀면서 앞쪽 다 검사한다.
				arr[j+1] = arr[j];	//조건 맞으면 한칸씩 밀어준다.
				index = j;	//조건에 부합되는 인덱스를 저장한다.( 인덱스에 넣어줄 꺼 저장!)
			}
			arr[index] = tmp;	//기준되는 데이터를 넣어준다.
		}
	}
	private static void print(int [] arr) {
		for(int data : arr) {
			System.out.print(data+" ");
		}
		System.out.println();
	}
}

package com.submit;

public class MergeSort {
	public static void main(String[] args) {
		int [] arr = {9,8,7,6,5,4,3,2,1};
		print(arr);
		mergeSort(arr);
		print(arr);
	}

	private static void mergeSort(int [] arr) {
		int [] tmp = new int[arr.length];	//임시로 배열 길이만큼의 배열을 만든다.
		mergeSort(arr,tmp,0,arr.length-1);	//오버로딩된  mergesort 호출한다.
	}
	private static void mergeSort(int [] arr,int [] tmp, int start,int end) {
		if(start<end) {	// 배열의 시작부터 끝까지 갈때까지만 수행한다.
			int mid = (start+end)/2;
			mergeSort(arr,tmp,start,mid);	//왼쪽부분 전부 쪼개준다.
			mergeSort(arr,tmp,mid+1,end);	//오른쪼구분 전부 쪼개준다.
			merge(arr,tmp,start,mid,end);	//병합해준다.
		}
	}
	//첫 호출은 가장 잘게 쪼개진 두개를 합칠 때 호출된다. 
	private static void merge(int [] arr,int [] tmp,int start,int mid,int end) {
		for (int i = start; i <= end; i++) {
			tmp[i] = arr[i];	//arr의 값을 tmp에 복사해놓는다.
		}
		int n1 = start;		//시작 인덱스	. tmp1의 인덱스 증가시키기 위함
		int n2 = mid+1;		//두번째 배열 시작 인덱스. tmp2의 인덱스 증가시키기 위함
		int index = start;	//전체 인덱스. arr의 인덱스를 증가시키기 위함
		while(n1<=mid && n2<=end) {	//둘중 하나라도 도달할 때까지 계속 비교한다.
			if(tmp[n1]<=tmp[n2]) {	//둘중 작은 수를 arr 배열에 넣는다.
				arr[index]=tmp[n1];
				n1++;
			}else {
				arr[index] = tmp[n2];
				n2++;
			}
			index++;	//어찌되었던 인덱스는 증가한다...
		}
		//둘중 하나가 끝나서 나왔을 경우 나머지 배열의 잔여물들이 남았을 수 있다.
		for (int i = 0; i <= mid-n1; i++) {
			arr[index+i] = tmp[n1+i];	//n1이 남았을 경우 처리해준다.
			//n2가 남았을 경우 원래 뒤쪽에 남아 처리되지 않았던 배열이기 때문에 상관없음.
		}
	}
	private static void print(int [] arr) {
		for(int data : arr) {
			System.out.print(data+" ");
		}
		System.out.println();
	}
}

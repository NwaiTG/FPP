package finalp;

import java.util.Arrays;

public class MinSort{
	int[] arr;
	MinSort(int[] arr){
		this.arr = arr;
	}
	
	public void sort(){
		if(arr == null || arr.length <= 1) return;
		int len = arr.length;
		for(int i = 0; i < len; i++){
			int minIndex = minpos(i, len);
			swap(i, minIndex);
		}
	}
	
	int minpos(int index, int len){
		int minIndex = index;
		int num = arr[index];
		for(int i = index+1; i < len; i++){
			if(num > arr[i]){
				num = arr[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	void swap(int i, int minIndex){
		int temp = arr[i];
		arr[i] = arr[minIndex];
		arr[minIndex] = temp;
	}
	
	public static void main(String[] args){
	int[] test = {21, 13, 1 ,-22, 51, 5, 18};
	MinSort ms = new MinSort(test);
	ms.sort();
	System.out.println(Arrays.toString(ms.arr));
	}
}
package Lec43;

import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
		int k = 4;
	}
	public static int Kth_Largest_Element(int []arr,int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0; i<k; i++) {
			pq.add(arr[i]);
		}
		for (int i = k; i < arr.length; i++) {
			if(arr[i]>pq.peek()) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		return pq.peek();
	}

}

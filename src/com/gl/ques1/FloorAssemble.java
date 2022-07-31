package com.gl.ques1;

import java.util.Collections;
import java.util.PriorityQueue;

public class FloorAssemble {
	
	public void solve(int arr[],int N) {
		
		PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
		int max = N;
		
		for(int i=0;i<N;i++) {
			System.out.println("Day : "+(i+1));
			
			pQueue.offer(arr[i]);
			
			while(!pQueue.isEmpty() && pQueue.peek()==max) {
				System.out.print(pQueue.poll()+" ");			
				max--;	
			}
			
			System.out.println();
		}
		
	}

}

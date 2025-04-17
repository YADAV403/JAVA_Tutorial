package com.collections;

import java.util.*;

public class Q {
	public static void main(String[] args) {
		
//		creation of queue
		Queue<Integer> q = new PriorityQueue<Integer>();
		System.out.println(q);
		
		System.out.println();
		
//		addition of elements
		q.add(1);
		q.offer(3);
		q.add(4);
		q.offer(2);
		System.out.println(q);
		
		System.out.println();
		
//		retrieval of elements
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
		
		System.out.println();
		
//		deletion of elements
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);
		System.out.println(q.remove());
		System.out.println(q);
		
		System.out.println();
		
//		verification of elements
		System.out.println(q.contains(1));
		System.out.println(q.contains(4));
		
		System.out.println();
		
//		creation of arraydeque
		ArrayDeque<String> ad = new ArrayDeque<>();
		System.out.println(ad);
		
		System.out.println();
		
//		addition of elements
		ad.offer("prashanth");
		ad.offerFirst("sahithi");
		ad.offerLast("vinay");
		System.out.println(ad);
		
		System.out.println();
		
//		retrieval of elements
		System.out.println(ad.peek());
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		
		System.out.println();
		
//		deletion of elements
		System.out.println(ad);
		System.out.println(ad.poll());
		System.out.println(ad.pollFirst());
		System.out.println(ad.pollLast());
		System.out.println(ad);
	}

}

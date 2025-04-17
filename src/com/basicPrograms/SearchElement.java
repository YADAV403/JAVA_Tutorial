package com.basicPrograms;

public class SearchElement {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int searchElement = 1;
		boolean flag = false;
		for(int i=0; i<a.length; i++) {
			if(searchElement==a[i]) {
				System.out.println("Search Element found at "+i+" index");
				flag = true;
				break;
			}
		}
		if(flag==false)
			System.out.println("Search Element not found");
	}

}

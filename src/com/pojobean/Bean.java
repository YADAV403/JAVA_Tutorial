package com.pojobean;

import java.io.Serializable;

public class Bean implements Serializable {
	 
	private int id = 101;
	
	public Bean() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}

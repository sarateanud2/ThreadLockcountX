package com.thread.lock.common;

public class CommonResource {
	
	private int x = 0;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public int uppX(){
		return x++;
	}
}

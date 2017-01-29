package com.thread.lock.count;

import java.util.concurrent.locks.ReentrantLock;

import com.thread.lock.common.CommonResource;

public class CountThread implements Runnable {
	
	CommonResource common;
	ReentrantLock looker;

	public CountThread(CommonResource common, ReentrantLock looker) {
		super();
		this.common = common;
		this.looker = looker;
	}



	@Override
	public void run() {
		
		try {
			looker.lock();
			common.setX(1);
			for(int i = 1; i < 5; i++){
				System.out.printf("%s %d \n", Thread.currentThread().getName(), common.getX());
				common.uppX();
				Thread.sleep(100);
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			looker.unlock();
		}

	}

}



 
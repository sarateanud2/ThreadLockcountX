package com.thread.lock.main;

import java.util.concurrent.locks.ReentrantLock;

import com.thread.lock.common.CommonResource;
import com.thread.lock.count.CountThread;

public class Main {

	public static void main(String[] args) {
		CommonResource commonResource = new CommonResource();
		ReentrantLock reLock = new ReentrantLock();
		
		for(int i = 1; i < 6; i++){
			Thread thread = new Thread(new CountThread(commonResource, reLock));
			thread.setName("Thrad_" + i);
			thread.start();
		}

	}

}
package com.java.concurency;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	BlockingQueue<String> blockingQueue = null;

	public Consumer(BlockingQueue<String> queue) {
		this.blockingQueue = queue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				String element = this.blockingQueue.take();
				System.out.println("Consumed : " + element);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

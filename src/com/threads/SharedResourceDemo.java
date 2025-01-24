package com.threads;

class SharedResource{
	
	
	private boolean flag =false;
	
	public synchronized void producer() {
		
		while(flag) {
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() +" is produce an item..");
		flag = true;
		notifyAll();
		
	}
	
	
	public synchronized void consumer() {
		
		
		while(!flag) {
			
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() +" is consume an item..");
		flag = false;
		notifyAll();
		
	}
	
}

public class SharedResourceDemo {

	
	public static void main(String[] args) {
		
		
		
		SharedResource sharedResource = new SharedResource();
		
		Thread producer = new Thread(()->{
			for(int i=0;i<5;i++) {
				sharedResource.producer();
			}
		});
		
		Thread consumer = new Thread(()->{
			for(int i=0;i<5;i++) {
				sharedResource.consumer();
			}
		});
		
		producer.setName("Factory");
		consumer.setName("Shop");
		producer.start();
		consumer.start();
		
		
		
	}
}

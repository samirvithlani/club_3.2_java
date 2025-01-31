package com.threads;

public class DeadLoackExample {

	private static final Object res1 = new Object();
	private static final Object res2 = new Object();

	public static void main(String[] args) {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {

				synchronized (res1) {

					System.out.println("Thread 1: locak resource 1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (res2) {

						System.out.println("Thread 1: locak resource 2");
					}
				}

			}
		});
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {

				synchronized (res2) {

					System.out.println("Thread 2: locak resource 2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (res1) {

						System.out.println("Thread 2: locak resource 1");
					}
				}

			}
		});
		
		thread1.start();
		thread2.start();

	}
}

package com.threads;

class myAccount {

	int balance = 1000;

	public void withdraw(int amount) {

		System.out.println(Thread.currentThread().getName() + " is accessing withdraw method..");
		System.out.println(Thread.currentThread().getName() + " checkinig balance " + this.balance);
		
		
		
		

		synchronized (this) {
			if(balance>=1000) {
				this.balance = this.balance - amount;
				System.out.println(Thread.currentThread().getName() + " After withdraw balance = " + balance);
			}
			else {
				System.out.println(Thread.currentThread().getName() + " is failed to withdeaw...");
			}
			
			
		}
	}

}

class Papa extends Thread {

	myAccount myAccount = null;

	public Papa(myAccount myAccount) {
		this.myAccount = myAccount;
	}

	@Override
	public void run() {

		myAccount.withdraw(1000);
	}

}

class Mummy extends Thread {

	myAccount myAccount = null;

	public Mummy(myAccount myAccount) {
		this.myAccount = myAccount;
	}

	@Override
	public void run() {

		myAccount.withdraw(1000);
	}
}
class Kaka extends Thread {

	myAccount myAccount = null;

	public Kaka(myAccount myAccount) {
		this.myAccount = myAccount;
	}

	@Override
	public void run() {

		myAccount.withdraw(1000);
	}
}

public class BankAccount {

	public static void main(String[] args) {

		myAccount m = new myAccount();
		Papa p = new Papa(m);
		p.setName("papa");

		Mummy mummy = new Mummy(m);
		mummy.setName("mummy");
		
		Kaka k = new Kaka(m);
		k.setName("kaka");

		p.start();
		mummy.start();
		k.start();

	}

}

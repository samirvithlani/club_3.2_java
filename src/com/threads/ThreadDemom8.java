package com.threads;


class Prints{
	
	public synchronized void printTable(int no) {
		
		for(int i=1;i<=10;i++) {
			System.out.println(no  + "*"+i + " = "+no*i);
		}
		
	}
}

class Table1 extends Thread{
	
	//instance...
	Prints p = null;
	public Table1(Prints p) {
		
		this.p = p;
	}
	@Override
	public void run() {
		
		p.printTable(10);	
	}
	
}
class Table2 extends Thread{
	
	Prints p = null;
	public Table2(Prints p) {
		
		this.p = p;
	}
	@Override
	public void run() {
		
		p.printTable(20);	
	}
	
}

public class ThreadDemom8 {

	
	public static void main(String[] args) {
		
		Prints p = new Prints();
		Table1 t1  = new Table1(p);
		Table2 t2  = new Table2(p);
		t1.start();
		t2.start();
		
		
		
	}
}

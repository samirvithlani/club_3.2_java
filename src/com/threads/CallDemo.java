package com.threads;

class Calling {
    private boolean isCallOnHold = true;

    public synchronized void doCall(int flag) {
        System.out.println(Thread.currentThread().getName() + " call started...");
        System.out.println(Thread.currentThread().getName() + " call is running...");

        if (flag == 1) {
            System.out.println("New call is on hold...");
            try {
                while (isCallOnHold) {
                    System.out.println(Thread.currentThread().getName() + " is waiting...");
                    wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //jay
            System.out.println(Thread.currentThread().getName() + "'s call received...");
            System.out.println(Thread.currentThread().getName() + "'s call is running...");
            System.out.println(Thread.currentThread().getName() + "'s call ended...");
        } else {
            System.out.println(Thread.currentThread().getName() + " is notifying the waiting call...");
            isCallOnHold = false;
            notify();
        }
    }
}

class Call1 extends Thread {
    Calling c;

    public Call1(Calling c) {
        this.c = c;
    }

    @Override
    public void run() {
        c.doCall(1);
    }
}

class Call2 extends Thread {
    Calling c;

    public Call2(Calling c) {
        this.c = c;
    }

    @Override
    public void run() {
        c.doCall(0);
    }
}

public class CallDemo {
    public static void main(String[] args) {
        Calling call = new Calling();
        Call1 t1 = new Call1(call);
        Call2 t2 = new Call2(call);

        t1.setName("Jay");
        t2.setName("Parth");

        t1.start();
        try {
            Thread.sleep(1000); // Ensures `t1` starts first
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}

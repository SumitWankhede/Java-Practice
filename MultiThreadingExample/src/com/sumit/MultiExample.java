package com.sumit;

/**
 * Created by Sumit on 25-Jul-17.
 */
public class MultiExample extends Thread{
    public void run(){
        System.out.println("thread is running....");
    }

    public static void main(String[] args) {

        // Thread Class implementation
        MultiExample obj = new MultiExample();
        obj.start();

        // Runnable interface implementation
        MultiExample1 obj1 = new MultiExample1();
        Thread t1 = new Thread(obj1);
        t1.start();

        // Test Sleep()
        TestThreadSleep st1 = new TestThreadSleep();
        TestThreadSleep st2 = new TestThreadSleep();

        st1.start();
        st2.start();

        System.out.println("Break.....");
        try {
            sleep(500);
        }catch(InterruptedException ex){
            System.out.println(ex);
        }

        // Test join()
        TestThreadSleep st3 = new TestThreadSleep();
        TestThreadSleep st4 = new TestThreadSleep();
        TestThreadSleep st5 = new TestThreadSleep();

        st3.start();
        try{
            st3.join(1500);
        }catch (InterruptedException ex){
            System.out.println(ex);
        }

        st4.start();
        st5.start();
    }
}

class MultiExample1 implements Runnable{
    public void run(){
        System.out.println("thread is running...");
    }
}

class TestThreadSleep extends Thread{
    public void run(){
        for(int i = 0; i<5 ; i++){
            try{
                Thread.sleep(500);
            }catch(InterruptedException ex){
                System.out.println(ex);
            }
            System.out.println(i);
        }
    }
}
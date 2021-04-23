package com.hometask.threads;


public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread myThreads = new MyThread();
		myThreads.run(5);
		RunnableThread ty = new RunnableThread();
		Thread.sleep(1000);
		ty.run(5);
	}

}

class MyThread extends Thread{
	int p ;
	public void run(int p) {	
		for(int i=0; i < p; i++) {
			 int n1=1,n2=1,n3;    
			 System.out.print(n1+" "+n2);   
			 for(i=2;i<p;++i) {
			  n3=n1+n2;    
			  System.out.print(" "+n3);    
			  n1=n2;    
			  n2=n3;    
			 }    
			
		        System.out.println(" "+"Threads"+"     "+ i);
		}
		
	}
	
}

 class  RunnableThread extends MyThread implements Runnable{

	public void run(int p) {
		
		for(int i=0; i < p; i++) {
			 int n1=1,n2=1,n3;    
			 System.out.print(n1+" "+n2);   
			 for(i=2;i<p;++i) {
			   n3=n1+n2;    
			   System.out.print(" "+n3);    
			   n1=n2;    
			   n2=n3;    
			 }
			 
			System.out.println(" "+"RunnableThreads"+"   " + i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}	
}

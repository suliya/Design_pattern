package com.thread;

class MyRunnableThread3 implements Runnable{
	//ʵ��Runnable�ӿڣ�����ʵ����Դ����
	public void run(){
		for(int i=0;i<30;i++){
			System.out.println(Thread.currentThread().getName()+" ���� -->"+ i);
		}
	}
}

public class StrongRun {

	public static void main(String[] args) {
		MyRunnableThread3 t3=new MyRunnableThread3();
		Thread tm=new Thread(t3,"�߳�");
		tm.start();
		try {
			tm.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(int i=0;i<30;i++){
			if(i>20){
				try {
					tm.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			System.out.println("main�߳� ����--> "+ i);
		}

	}

}
package com.observer;

import java.util.Vector;

//观察者接口
interface IObserver{
	public void refresh(String data);
}

//主题接口
interface ISubject{
	public void register(IObserver obs);//注册观察者
	public void unregister(IObserver obs);//撤销观察者
	public void notifyObservers();//通知所有观察者
}

//主题实现类
class Subject implements ISubject{

	private Vector<IObserver> vec=new Vector();
	private String data;
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public void register(IObserver obs) {
		vec.add(obs);
		
	}

	@Override
	public void unregister(IObserver obs) {
		if(vec.contains(obs)){
			vec.remove(obs);
		}
	}

	@Override
	public void notifyObservers() {
		for(int i=0;i<vec.size();i++){
			IObserver obs=vec.get(i);
			obs.refresh(data);
		}
	}
	
}

//一个具体的观察者类
class Observer implements IObserver{

	@Override
	public void refresh(String data) {
		System.out.println("i have gotten the data "+ data);
	}
	
}

public class Test {

	public static void main(String[] args) {
		IObserver obs=new Observer();
		Subject sub=new Subject();
		sub.register(obs);;
		sub.setData("hello");
		sub.notifyObservers();

	}

}

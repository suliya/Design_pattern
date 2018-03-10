package com.abstractFactory;

interface Icar{	}
class TopCar implements Icar{	}
class MidCar implements Icar{	}
class LowCar implements Icar{	}

interface Ibus{ }
class TopBus implements Ibus{ }
class MidBus implements Ibus{ }

//定义抽象工厂
abstract class AbstractFactory{
	
}

//定义抽象子工厂
abstract class AbstractFactory1 extends AbstractFactory{
	public abstract Icar creatCar();
	public abstract Ibus creatBus();
}

abstract class AbstractFactory2 extends AbstractFactory{
	public abstract Icar creatCar();
}

class TopFactory extends AbstractFactory1{
	public Icar creatCar(){
		return new TopCar();
	}
	public Ibus creatBus(){
		return new TopBus();
	}
}

class MidFactory extends AbstractFactory1{
	public Icar creatCar(){
		return new MidCar();
	}
	public Ibus creatBus(){
		return new TopBus();
	}
}

class LowFactory extends AbstractFactory2{
	public Icar creatCar(){
		return new LowCar();
	}
}

public class CarTest {

	public static void main(String[] args) {
		AbstractFactory1 ab=new TopFactory();
		Ibus bus=ab.creatBus();
		System.out.println(bus.getClass().getName());

	}

}

package com.simpleFactory;



interface Icar{
	
}
class TopCar implements Icar{
	
}
class MidCar implements Icar{
	
}
class LowCar implements Icar{
	
}

//�򵥹���
class CarsSimpleFactory{
	public static final String TOPTYPE="toptype";
	public static final String MIDTYPE="midtype";
	public static final String LOWTYPE="lowtype";
	
	public static Icar creat(String mark){
		Icar obj=null;
		if(mark.equals(TOPTYPE)){
			obj=new TopCar();
		}
		else if(mark.equals(MIDTYPE)){
			obj=new MidCar();
		}
		else if(mark.equals(LOWTYPE)){
			obj=new LowCar();
		}
		return obj;
		
	}
	
}

public class CarTest {

	public static void main(String[] args) {
		Icar obj=CarsSimpleFactory.creat("toptype");
		System.out.println(obj.getClass().getName());

	}

}

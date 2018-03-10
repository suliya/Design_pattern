package com.builder;

class Util1{
	int a;
	int b;
}

class Util2{
	int a;
	int b;
}

class Util3{
	int a;
	int b;
}

class Product{
	Util1 u1;
	Util1 u2;
	Util1 u3;
}

interface IBuild{
	public void creatUtil1();
	public void creatUtil2();
	public void creatUtil3();
	public Product composite();
}

class BuildProduct1 implements IBuild{

	Product p=new Product();
	
	public void creatUtil1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void creatUtil2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void creatUtil3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product composite() {
		// TODO Auto-generated method stub
		return p;
	}
	
}

class BuildProduct2 implements IBuild{

	Product p=new Product();
	
	public void creatUtil1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void creatUtil2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void creatUtil3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product composite() {
		// TODO Auto-generated method stub
		return p;
	}
	
}


class BuildProduct3 implements IBuild{

	Product p=new Product();
	
	public void creatUtil1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void creatUtil2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void creatUtil3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product composite() {
		// TODO Auto-generated method stub
		return p;
	}
	
}

class Director{
	private IBuild b;
	public Director(IBuild b){
		this.b=b;
	}
	public Product build(){
		b.creatUtil1();
		b.creatUtil2();
		b.creatUtil3();
		return b.composite();
	}
}

public class Builder {
   public static void main(String[] args){
	   IBuild b=new BuildProduct2();
	   Director d=new Director(b);
	   Product p=d.build();
   }
}

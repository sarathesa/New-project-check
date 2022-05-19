package org.test;

public class ClassA {

	public static int a;
	private void empId( ) {
	a=10;
	}
	public static void main(String[] args) {
		ClassA e= new ClassA();
		System.out.println("before init "+e.a);
		e.empId();
		System.out.println("after init "+e.a);
		
		ClassA e1 =new ClassA();
		System.out.println("before init" +e1.a);
		e1.empId();
		System.out.println("after ini"+e1.a);
		
		
	}
	

	}


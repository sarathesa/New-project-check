package org.check;

public class Check {
int a=10;
int b=20;
private void add(int a,int b) {
	
	this.a=a;
	this.b=b;
	
}
public static void main(String[] args) {
	Check c=new Check();
	c.add(100, 1000);
	System.out.println(c.a);
	System.out.println(c.b);
}

}

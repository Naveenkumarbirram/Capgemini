package org.spring_reference;

public class B 
{
	private int y;
    private A ob1;
	public B(int y, A ob1) {
		super();
		this.y = y;
		this.ob1 = ob1;
	}
	public B() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public A getOb1() {
		return ob1;
	}
	public void setOb1(A ob1) {
		this.ob1 = ob1;
	}
	@Override
	public String toString() {
		return "B [y=" + y + ", ob1=" + ob1 + "]";
	}
    

}

package Java8;
interface I
{
	//It will compile
	public void m1();
	public void m2();
	//if declare a abstract method we should implement that method in
	//sub class
	//public void m3();
	//But in java 8 we can declare a abstract method without effecting 
	//implemented class methods
	default void m4() 
	{
		System.out.println("default method");	
	}
}
class c implements I
{
	public void m1() {}
	public void m2() {}
}
class d implements I
{
	public void m1() {}
	public void m2() {}
}
class e implements I
{
	public void m1() {}
	public void m2() {}
}
public class DefaultMethodInInterface {
	public static void main(String[] args) {

	}

}

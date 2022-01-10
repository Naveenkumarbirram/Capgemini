package Java8;

interface interf
{
	public void add(int a,int b);	
}
public class Method_Reference1 
{
	public static void sum(int x,int y)
	{
		System.out.println("The sum: "+(x+y));
	}
	public static void main(String[] args)
	{
		//This is a Normal lambda Expression
		interf i=(a,b)->System.out.println("The sum: "+(a+b));
		i.add(10, 20);
		//We can do this with the method reference if it is already implemented
		interf i1=Method_Reference1::sum;
		i1.add(100, 200);
	}
}

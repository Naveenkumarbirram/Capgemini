package Java8;

interface lamb
{
	public int add(int a);	
	//public void sub(int b);
}
interface lamb1
{
	public void sum(int a);	
	//public void sub(int b);
}
interface lamb2
{
	public void summation(int a,int b);	
	//public void sub(int b);
}


public class lambdaadding
{
	public static void main(String[] args) 
	{
		lamb object=(a)->a+5;
				System.out.println(object.add(10));
		
		lamb1 obj=(a) ->System.out.println("jfhfh");
        obj.sum(40);
        
        lamb2 obj1=(a,b)->System.out.println(a+b);
        obj1.summation(20,50);
	}

}

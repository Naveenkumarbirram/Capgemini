package oops;

public class staticmethod 
{
	//static variables
	static int i=10;
	static String name1="Java Programming";
	static int j=11;
	static String name2="python Programming";
	static int k=12;
	static String name3="c++ Programming";
	static int l=13;
	static String name4="R Programming";
	public static void main(String[] args) 
	{
		//calling static variables inside a main method without creating object
		System.out.println(i);
		System.out.println(name1);
		System.out.println("====================");
		System.out.println(j);
		System.out.println(name2);
		System.out.println("====================");
		System.out.println(k);
		System.out.println(name3);
		System.out.println("====================");
		System.out.println(l);
		System.out.println(name4);
		System.out.println("====================");
	}
}

package Assignments;

public class MultipleStaticblocks
{
	//Declaring variables
	static int num;
	static String my_str;
	//first static block
	static {
		System.out.println("static block-1");
		num=305;
		my_str="first static block";
	}
	//second static block
	static {
		System.out.println("static block-2");
		num=213;
		my_str="second static block";
	}
	//third static block
	static {
		System.out.println("static block-3");
		num=123;
		my_str="third static block";
	}
	//fourth static block
	static {
		System.out.println("static block-4");
		num=543;
		my_str="fourth static block";
	}
	public static void main(String[] args) 
	{
		System.out.println(num);
		System.out.println(my_str);
		
	}

}

package oops;

public class enumconstructor 
{
	enum weeks
	{
	     sunday,monday,tuesday,wednsday,thursday,friday,saturday;	
	     weeks()
	     {
	    	 System.out.println("This is Constructor for enum");
	     }
	}
	public static void main(String[] args) 
	{
		weeks[] w=weeks.values();
		weeks w1=weeks.sunday;
		System.out.println(w1);
		for(weeks ww:w)
		{
			System.out.println(ww+" "+ww.ordinal());
		}
		
		
	}
	

}

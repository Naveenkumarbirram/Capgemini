package oops;

public class enumeration 
{
	
	enum Mail
	{ 
		INBOX,COMPOSE,SENT;
	}
	public static void main(String[] args)
	{
		Mail[] mm = Mail.values();
	    for (Mail mmm : mm)
	    { 
		   System.out.println(mmm);
	     }
	}
}

package PracticeAssessments;
import java.lang.String;
class Activity
{
	String string1;
	String string2;
	String operator;
	Activity(String string1, String string2, String operator) {
		//super();
		this.string1 = string1;
		this.string2 = string2;
		this.operator = operator;
	}
}
public class Source 
{
	String handleException(Activity a)
	{
		if(a.string1==null&&a.string2==null)
		{
			throw new NullPointerException("Null values found");
		}
		if(a.operator!="+"&&a.operator!="-")
		{
			return "+";
		}
		else
		{
			return "No Exception found";	
		}	
	}
	String doOperation(Activity a)
	{
		String str=a.string1+a.string2;
		switch(a.operator)
		{
		case "+":System.out.println(a.string1+a.string2);
		case "-":System.out.println(str.substring(0,a.string1.length()));  		
		}
		return null;
		//return str;
	}
	public static void main(String[] args)
	{
		Activity a=new Activity("hello","World","+");  
		Source s=new Source();
		s.doOperation(a);
		s.handleException(a);	
	}
}

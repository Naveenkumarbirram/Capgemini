package PracticeAssessments;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Base
{
	public static void validate() throws RuntimeException, FileNotFoundException
	{
		String name="Naveen";
		if(name=="Naveen")
		{
			throw new FileNotFoundException();
		}
		else
		{
			throw new ArithmeticException("Not validated");
		}
	}
	public static void main(String... args) throws FileNotFoundException, RuntimeException
	{
			validate();
		
	}
	

}

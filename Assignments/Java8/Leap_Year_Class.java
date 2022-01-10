package Java8;

import java.time.Year;
import java.util.Scanner;

public class Leap_Year_Class 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year");
		int n=sc.nextInt();
		Year y=Year.of(n);
		if(y.isLeap())
		{
			System.out.println(n+" is a Leap year");
		}
		else
		{
			System.out.println(n+" is not a leap year");
		}
		
	}

}

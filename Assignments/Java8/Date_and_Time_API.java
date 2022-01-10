package Java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Date_and_Time_API
{
	public static void main(String[] args)
	{
		//if we wan't to print current date
		LocalDate date=LocalDate.now();
		System.out.println(date);
		//If we wan't current date according to our required format
		int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yyyy=date.getYear();
		System.out.printf("%d-%d-%d",dd,mm,yyyy);
		System.out.println();


		//if we wan't to print current time we go for
		LocalTime time=LocalTime.now();
		System.out.println(time);
		int h=time.getHour();
		int m=time.getMinute();
		int s=time.getSecond();
		int n=time.getNano();
		System.out.printf("%d-%d-%d-%d",h,m,s,n);
		System.out.println();

		//If wan't to print date and time at a time
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		int dd1=dt.getDayOfMonth();
		int mm1=dt.getMonthValue();
		int yy=dt.getYear();
		System.out.printf("Current Date is: "+"%d-%d-%d",dd1,mm1,yy);
		System.out.println();
		int h1=dt.getHour();
		int m1=dt.getMinute();
		int s1=dt.getSecond();
		int n1=dt.getNano();
		System.out.printf("Current Time is: "+"%d-%d-%d-%d",h1,m1,s1,n1);
		System.out.println();

		//If we wan't to print required date and time
		LocalDateTime dt1=LocalDateTime.of(2000,07,05,22,20);
		System.out.println(dt1);
		//If we wan't to print date after 6 months
		System.out.println("After 6 months "+dt1.plusMonths(6));
		System.out.println("Before 6 months "+dt1.minusMonths(6));

		//If we wan't to know how many days and months between current and given datetime
		//Eg--->If we wan't to know our birthday to now how many days and months and years
		LocalDate l=LocalDate.of(2000,07,05);
		LocalDate l1=LocalDate.now();
		Period p=Period.between(l,l1);
		System.out.printf("My Age is %d years %d Months and %d days",p.getYears(),p.getMonths(),p.getDays());

		//		//If we wan't to know time in hours from our birthadate to now
		//		LocalTime t=LocalTime.of(22,20);
		//		LocalTime t1=LocalTime.now();
		//		Period p1=Period.between(t,t1);



	}

}

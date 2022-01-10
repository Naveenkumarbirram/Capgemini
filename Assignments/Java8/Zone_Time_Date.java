package Java8;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Zone_Time_Date 
{
	public static void main(String[] args) 
	{
		ZoneId zone=ZoneId.systemDefault();
		System.out.println(zone);//Asia/Calcutta

		//If we wan't to know another zone time and date
		ZoneId l1=ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt=ZonedDateTime.now(l1);
		System.out.println(zt);
	}

}

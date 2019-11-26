/**
 * 
 */
package com.yuxi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import org.junit.Test;

/**
 * @author 86176
 *
 */
public class TestGetSeconds {
	
   @Test
   public void getTomorrowSeconds() {
		Date date=new Date();
		LocalDateTime localDateTime=LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
		LocalDateTime tomorrowTime=LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault())
				.plusDays(1).withHour(0).withMinute(0).withSecond(0).withNano(0);
		System.out.println((int) ChronoUnit.SECONDS.between(tomorrowTime, localDateTime)); 
	}
   
}

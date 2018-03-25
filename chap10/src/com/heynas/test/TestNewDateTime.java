package com.heynas.test;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.TimeZone;

/**
 * Description:  TestNewDateTime<br>
 * Copyright: © 2016 Heynas Studio. All rights reserved.<br>
 * Company: Heynas<br>
 *
 * @author William
 * @version 1.0
 */
public class TestNewDateTime {
	public static void main(String[] args) {

		ZoneId zoneId1 = ZoneId.systemDefault();
		ZoneId zoneId2 = ZoneId.of("Asia/Tokyo");
		ZoneId zoneId3 = ZoneId.of("GMT+09:00");

		ZoneOffset zoneOffset1 = ZoneOffset.of("+09:00");
		ZoneOffset zoneOffset2 = ZoneOffset.ofTotalSeconds(3600);

		System.out.println(zoneId1);
		System.out.println(zoneId2);
		System.out.println(zoneId3);

//		Set setIds = ZoneId.getAvailableZoneIds();
//		for (Iterator iterator = setIds.iterator(); iterator.hasNext(); ) {
//			Object next = iterator.next();
//			System.out.println(next);
//		}

		Clock clock1 = Clock.systemDefaultZone();
		Clock clock2 = Clock.system(zoneId2);
		Clock clock3 = Clock.system(zoneId3);
		Clock clock4 = Clock.system(zoneOffset1);
		Clock clock5 = Clock.systemUTC();
		Clock clock6 = Clock.system(ZoneOffset.ofTotalSeconds(0));

		System.out.println(clock1);
		System.out.println(clock2);
		System.out.println(clock3);
		System.out.println(clock4);
		System.out.println(clock5);
		System.out.println(clock6);

		System.out.println(clock1.millis());
		System.out.println(clock2.millis());
		System.out.println(clock3.millis());
		System.out.println(clock4.millis());
		System.out.println(clock5.millis());
		System.out.println(clock6.millis());

		System.out.println(System.currentTimeMillis());

		Clock clock7 = clock1.withZone(ZoneId.of("GMT+02:00"));
		System.out.println(clock7);
		System.out.println(clock7.millis());

		Instant instant1 = clock1.instant();
		Instant instant2 = Instant.now();
		Instant instant3 = Instant.now(clock1);
		Instant instant4 = Instant.now(clock7);

		System.out.println(instant1);
		System.out.println(instant2);
		System.out.println(instant3);
		System.out.println(instant4);

		Instant instant5 = instant1.plusSeconds(3600);
		System.out.println(instant5);

		Instant instant6 = instant1.plus(2, ChronoUnit.HOURS);

		System.out.println(instant6);

		Duration duration1 = Duration.ZERO;
		Duration duration2 = Duration.ofHours(1);

		System.out.println(duration1.toMillis());
		System.out.println(duration2.toMillis());

		Clock clock8 = Clock.offset(clock1,duration2);
		System.out.println(clock8);
		System.out.println(clock8.instant());

		LocalDate localDate1 = LocalDate.now();
		LocalDate localDate2 = LocalDate.now(clock1);
		LocalDate localDate3 = LocalDate.now(ZoneId.of("Asia/Tokyo"));

		System.out.println(localDate1);
		System.out.println(localDate2);
		System.out.println(localDate3);


		LocalTime localTime1 = LocalTime.now();
		LocalTime localTime2 = LocalTime.now(clock1);
		LocalTime localTime3 = LocalTime.now(ZoneId.of("Asia/Tokyo"));

		System.out.println(localTime1);
		System.out.println(localTime2);
		System.out.println(localTime3);

		LocalDateTime localDateTime1 = LocalDateTime.now();
		LocalDateTime localDateTime2 = LocalDateTime.now(clock1);
		LocalDateTime localDateTime3 = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));

		System.out.println(localDateTime1);
		System.out.println(localDateTime2);
		System.out.println(localDateTime3);

		LocalDateTime localDateTime4 = LocalDateTime.of(2018,1,1,1,1,1);
		System.out.println(localDateTime4);
		LocalDateTime localDateTime5 = LocalDateTime.parse("2018-01-01T11:11:11");

		System.out.println(localDateTime5);

		ZonedDateTime zonedDateTime1 = ZonedDateTime.now();
		ZonedDateTime zonedDateTime2 = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

		System.out.println(zonedDateTime1);
		System.out.println(zonedDateTime2);

		System.out.println(zonedDateTime2.toLocalDate());
		System.out.println(zonedDateTime2.toLocalTime());
		System.out.println(zonedDateTime2.toLocalDateTime());

		System.out.println(zonedDateTime2.toInstant());

		ZonedDateTime zonedDateTime3 = zonedDateTime2.withZoneSameInstant(ZoneOffset.ofTotalSeconds(0));
		System.out.println(zonedDateTime3);

		System.out.println(Year.now());
		System.out.println(YearMonth.now());
		System.out.println(MonthDay.now());

	}
}

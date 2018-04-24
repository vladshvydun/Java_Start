/*
 * Написать программу которая вернет количество миллисекунд 
 * прошедших от такого же числа, но в прошлом месяце до сегодняшней 
 * даты. Например если сегодня 3 августа, то узнать сколько миллисекунд 
 * прошло с 3 июля.
 */

package com.gmail.vld.shv;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		System.out.println("The difference in milliseconds Today and a Month ago:");
		System.out.println(differenceOfDate());
	}

	public static long differenceOfDate() {
		Calendar cl = Calendar.getInstance();
		Date dateToday = new Date();
		dateToday = cl.getTime();

		cl.set(Calendar.MONTH, Calendar.FEBRUARY);
		Date dateMonthAgo = new Date();
		dateMonthAgo = cl.getTime();

		return dateToday.getTime() - dateMonthAgo.getTime();
	}

}

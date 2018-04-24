/*
 * �������� ��������� ������� ������ ���������� ����������� 
 * ��������� �� ������ �� �����, �� � ������� ������ �� ����������� 
 * ����. �������� ���� ������� 3 �������, �� ������ ������� ����������� 
 * ������ � 3 ����.
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

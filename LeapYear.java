package com.cg;

import java.time.LocalDate;
import java.time.Year;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Year y= Year.of(2000);
		LocalDate start= y.atDay(1);
		LocalDate end= y.atDay(1).plusYears(1);
		
		long l=start.datesUntil(end).count();
		if(l==366) {
			System.out.println("leap year");
		}else {
			System.out.println("not a leap year");
		}

		
	}

}

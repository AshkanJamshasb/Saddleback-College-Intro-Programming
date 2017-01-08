/* Chapter No. 6 - Exercise No.  33
File Name:          Program6_33_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jul. 19, 2016

Problem Statement: Displays current date, time, and year

Overall Plan:
1. Get the system's current time
2. Convert the time into seconds and different time variables
3. call the method getMonthName to get the name of the month
4. call getNumberOfDaysInMonth to see how many days are in each month
5. call the isLeapYear method to see the amount of leap years that have passed
6. runs calculations that intigrates each mothod with eachother
7. prints the year, date, and time to the user

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
currentHour long 			1-24		 	the current hour
currentMin 	long			0-60			the current minute
currentSec 	long 			0-60 			the current second
days 		long 			0-31			the current day of the month
daysOfYear	int 			365/366 		the variable that changes if there is a leap year
hours 		long 			any long 		hours since 1970
minutes 	long  			any long 		minutes scince 1970
month 		int  			1-12 			the current month
seconds 	long 			any long		the number of seconds since 1970
year 		int 			any int 		the current year
*/
import java.util.Scanner;

public class Program6_33_Jamshasb {

	public static void main(String[] args) {

		
		long seconds, minutes, days, currentHour, currentMin, currentSec, hours;
		int year = 1970, month = 1, daysOfYear;

		seconds = System.currentTimeMillis() / 1000 - (7 * 60 * 60); //Convert the time into seconds (makes it easier to work with) (-7 for our time zone)

		//Finding the time
		currentSec = seconds % 60;
		minutes =  seconds / 60;
		currentMin = minutes % 60;
		hours = minutes / 60; 
		currentHour = hours % 24;
		days = hours / 24 + 1; //+1 is for the current day

		// Calculating the year		
		if (isLeapYear(year)) {
			daysOfYear = 366;
		} else {
			daysOfYear = 365;
		}
		while (days >= daysOfYear) {
			days = days - (isLeapYear(year) ? 366 : 365);
			year++;
		}

		//Calculating the month
		while (days >= getNumberOfDaysInMonth(year, month)) {
			days = days - getNumberOfDaysInMonth(year, month);
			month++;
		}

		System.out.println("Current date and time is " + getMonthName(month) + days + ", " + year + " " + currentHour + ":" + currentMin + ":" + currentSec);
	}

	/************************************************/
	/* Name: getMonthName(int month) 				*/
	/************************************************/
	/* Purpose: to name the month of the year		*/
	/* Parameters: 									*/
	/*	int month 									*/	
	/* Return: 	the name of the month				*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	monthName 	String 			any String 		the name of the each month
	*/
	public static String getMonthName(int month) {
		String monthName = null;
		switch(month) {
			case 1 : 
				monthName = "January ";
				break;
			case 2 : 
				monthName = "February ";
				break;
			case 3 : 
				monthName = "March ";
				break;
			case 4 : 
				monthName = "April ";
				break;
			case 5 : 
				monthName = "May ";
				break;
			case 6 : 
				monthName = "June ";
				break;
			case 7 : 
				monthName = "July ";
				break;
			case 8 : 
				monthName = "August ";
				break;
			case 9 : 
				monthName = "September ";
				break;
			case 10 : 
				monthName = "October ";
				break;
			case 11 : 
				monthName = "November ";
				break;
			case 12 : 
				monthName = "December ";
				break;
			default: 
				monthName = "invalid ";
		}
		return monthName;
	}

	/****************************************************/
	/* Name: getNumberOfDaysInMonth(int year, int month)*/
	/****************************************************/
	/* Purpose: to assign the number of days in a month	*/
	/* Parameters: 										*/
	/*	int year 										*/
	/*	int month										*/
	/* Return: the number of days in a certain month	*/
	/****************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	month 	 	int 			28-31 	 		the number of days in each month
	*/
	public static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;
		if (month == 4 ||month == 6 ||month == 9 ||month == 11) 
			return 30;
		if (month == 2)
			if (isLeapYear(year)) {
				return 29;	
			} else {
				return 28;
			}
		return 404; //If the month was messed up
	}

	/************************************************/
	/* Name: isLeapYear(int year) 			 		*/
	/************************************************/
	/* Purpose: decide weather it is a leap year	*/
	/* Parameters: 									*/
	/*	int year									*/		
	/*												*/
	/* Return: 	a boolean of true or false			*/
	/************************************************/
	/* Data dictionary 
	--------------------------------------------------	
	NAME		TYPE			VALUE RANGE		DESCRIPTION
	======== 	=========== 	===========		====================
	year 	 	int 			any int 		the current year that the user is using the program
	*/
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}


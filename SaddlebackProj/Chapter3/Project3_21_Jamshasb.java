/* Chapter No. 3 - Exercise No.  21
File Name:          Project3_21_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Jun. 29, 2016

Problem Statement: Caclulates the day of the week given a certain date.

Overall Plan:
1. 
2. 
3. 
4. 
5. 

Classes needed and Purpose (Input, Processing, Output)
main class - GoodTime

DATA DICTIONARY
---------------
NAME		TYPE			VALUE RANGE		DESCRIPTION
======== 	=========== 	===========		====================
h 			int 			(0-6)			The day of the week
isLeapYear	bloolean		true/flase		determines weather or not it is a leap year
j 			int 			(20-infinity)	the century
k 			int 			(0-99)			the year of the century
m 			byte 			(1-12)			the month
q 			int 			(1-31)			the day of the month
scan		Scanner			user input		allows user input
year 		short			any short 		the year the user wants
*/
import java.util.Scanner;

public class Project3_21_Jamshasb {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int h, q, k, j;
		byte m;
		short year;
		q = 0;
		System.out.print("Enter year less that 32767: (i.e. 2015): ");
		year = scan.nextShort();

		if (year<0) {
			System.out.println("Error: Not a valid year entry, cannot be below zero!");
			System.exit(1);
		}

		boolean isLeapYear = (year%4==0&&year%100!=0)||(year%400==0);
		j = (year/100); // century
		k = (year%100); // year of the century

		System.out.print("Enter your month: (1-12): ");
		m = scan.nextByte(); //month
		if(m==1){
			m=13;
			year-=1;
		} else if (m==2) {
			m=14;
			year-=1;
		} else if (m==13||m==14) {
			System.out.println("Error: Not a valid input for month! Number cannot exceed 12 and cannot be less than 1!");
			System.exit(1);
		}
		j = (year/100); // century
		k = (year%100); // year of the century
		switch (m) {
				case 13: //Jan. has 31 days
		System.out.print("Enter the day in January: (1-31): ");
		q = scan.nextInt();
		if (q>31||q<1) {
			System.out.println("Error: Not a valid day in January!");
			System.exit(1);
		}
					break;
				case 14: //Feb. has 28 days
        if (isLeapYear) {
            System.out.print("Enter the day in Feburary: (1-29): ");
            q = scan.nextInt();
            if (q>29||q<1) {
                System.out.println("Error: Not a valid day in Feburary!");
                System.exit(1);
            }
        } else {
    		System.out.print("Enter the day in Feburary: (1-28): ");
    		q = scan.nextInt();
    		if (q>28||q<1) {
    			System.out.println("Error: Not a valid day in Feburary!");
    			System.exit(1);
            }
	    }
					break;
				case 3: //Mar. has 31 days
		System.out.print("Enter the day in March: (1-31): ");
		q = scan.nextInt();
		if (q>31||q<1) {
			System.out.println("Error: Not a valid day in March!");
			System.exit(1);
		}
					break;
				case 4: //Apr. has 30 days
		System.out.print("Enter the day in April: (1-30): ");
		q = scan.nextInt();
		if (q>30||q<1) {
			System.out.println("Error: Not a valid day in April!");
			System.exit(1);
		}
					break;
				case 5: //May has 31 days
		System.out.print("Enter the day in May: (1-31): ");
		q = scan.nextInt();
		if (q>31||q<1) {
			System.out.println("Error: Not a valid day in May!");
			System.exit(1);
		}
					break;
				case 6: //Jun. has 30 days
		System.out.print("Enter the day in June: (1-30): ");
		q = scan.nextInt();
		if (q>30||q<1) {
			System.out.println("Error: Not a valid day in June!");
			System.exit(1);
		}
					break;
				case 7: //Jul. has 31 days
		System.out.print("Enter the day in July: (1-31): ");
		q = scan.nextInt();
		if (q>31||q<1) {
			System.out.println("Error: Not a valid day in July!");
			System.exit(1);
		}
					break;
				case 8: //Aug. has 31 days
		System.out.print("Enter the day in August: (1-31): ");
		q = scan.nextInt();
		if (q>31||q<1) {
			System.out.println("Error: Not a valid day in August!");
			System.exit(1);
		}
					break;
				case 9: //Sep. has 30 days
		System.out.print("Enter the day in September: (1-30): ");
		q = scan.nextInt();
		if (q>30||q<1) {
			System.out.println("Error: Not a valid day in September!");
			System.exit(1);
		}
					break;
				case 10: //Oct. has 31 days
		System.out.print("Enter the day in October: (1-31): ");
		q = scan.nextInt();
		if (q>31||q<1) {
			System.out.println("Error: Not a valid day in October!");
			System.exit(1);
		}
					break;
				case 11: //Nov. has 30 days
		System.out.print("Enter the day in November: (1-30): ");
		q = scan.nextInt();
		if (q>30||q<1) {
			System.out.println("Error: Not a valid day in November!");
			System.exit(1);
		}
					break;
				case 12: //Dec. has 31 days
		System.out.print("Enter the day in December: (1-31): ");
		q = scan.nextInt();
		if (q>31||q<1) {
			System.out.println("Error: Not a valid day in December!");
			System.exit(1);
		}
					break;
				default:
					System.out.println("Error: Not a valid input for month! Number cannot exceed 12 and cannot be less than 1!");
					System.exit(1);
				;
		}
		h = ((q)+((26*(m+1))/10)+(k)+(k/4)+(j/4)+(5*j))%7; //Day of the week
		switch (h) {
			case 0:
				System.out.println("Day of the week is Saturday");
				break;
			case 1:
				System.out.println("Day of the week is Sunday");
				break;
			case 2:
				System.out.println("Day of the week is Monday");
				break;
			case 3:
				System.out.println("Day of the week is Tuesday");
				break;
			case 4:
				System.out.println("Day of the week is Wednesday");
				break;
			case 5:
				System.out.println("Day of the week is Thursday");
				break;
			case 6:
				System.out.println("Day of the week is Friday");
				break;
		}
	}
}

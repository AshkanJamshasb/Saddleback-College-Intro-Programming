/* Chapter No. 3 - Exercise No. 3-21
   File Name     : datOneGroup.java
   Group         : #4 - .dat One Group
   Programmers   : Nathan Nhek, Alec Castaneda, Ash Jamshasb, Charles Prescott
   Due Date      : Tuesday July 5th, 2016

   Problem Statement: 
   The program will find get the year, month, and day as numeric input from the user. It will
    then calculate the day of the week using Zeller's formula
   
   Overall Plan: 
   1. Set up variable for input, declare and initialize day
   2. Prompt user to enter input for the year, month
   3. Calculate if the year entered is a leap year
   4. Switch the month variable for different month cases
   5. Prompt user to enter input for the day
   6. Create formula for Zeller's formula to calculate the day of the week
   7. Switch the day number to output the correct day of the week

   Classes needed and Purpose (Input, Processing, Output)
   main class -  datOneGroup
   DATA DICTIONARY (ALPHABETICAL)
   ***********
   *VARIABLES*
   ***********
   NAME       TYPE    VALUE RANGE DESCRIPTION
   ========== ======= =========== ===========================================
   day        int     1 - varies  variable for day
   dayNum     int     0-6         the day of the week
   input      Scanner NA          used for input
   isLeapYear boolean 0-1         determines if leap year or not
   j          int     any int     used for Zeller's formula
   k          int     any int     used for Zeller's formula
   month      int     1-12        variable for month
   year       int     0-10,000    variable for year
*/
import java.util.Scanner;

public class datOneGroup {
  public static void main(String [] args) {

    // Variables
    Scanner input = new Scanner(System.in);
    int day = 0;

    // Input year
    System.out.println("Welcome to the day of the week program!");
    System.out.print("Enter year: (0-10000): ");
    int year = input.nextInt();
    if(year < 0 || year > 10000) {
      System.out.println("Invalid year entry. A valid year entry must be within 0 and 10,000.");
      System.exit(1);
    }

    // Input month
    System.out.print("Enter month: (1-12): ");
    int month = input.nextInt();
    if(month <= 0 || month > 12) {
      System.out.println("Invalid month entry. A valid month entry must be within 1 and 12.");
      System.exit(1);
    }

    // Calculate leap year
    boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

    // Switch the user input for month. Based on the month entered different day ranges must be entered. Case 2 (February) checks
    //  for a leap year based on the user input for year
    switch(month) {
      case 1 : System.out.print("Enter day: (1-31): ");
               day = input.nextInt();

               // Zeller's formula - January - month is 13 in the equation, year is the previous year
               month = 13;
               year -= 1;

               if(day < 1 || day > 31) {
                 System.out.println("Invalid day entry for January.");
                 System.exit(1);
               }
               break;

      case 2 : if(isLeapYear) {
                 System.out.print("Enter day: (1-29): ");  
                 day = input.nextInt();

                 // Zeller's formula - February - month is 12 in the equation, year is the previous year
                 if(day < 1 || day > 29) {
                   System.out.println("Invalid day entry for February.");
                   System.exit(1);
                 }

                 month = 14;
                 year -= 1;                 
               }
               else {
                 System.out.print("Enter day: (1-28): ");
                 day = input.nextInt();

                 if(day < 1 || day > 28) {
                   System.out.println("Invalid day entry for February.");
                   System.exit(1);
                 }

                 month = 14;
                 year -= 1;                 
               }
               break;

      case 3 : System.out.print("Enter day: (1-31): ");
               day = input.nextInt();

               if(day < 1 || day > 31) {
                 System.out.println("Invalid day entry for March.");
                 System.exit(1);
               }
               break;

      case 4 : System.out.print("Enter day: (1-30): ");
               day = input.nextInt();

               if(day < 1 || day > 30) {
                 System.out.println("Invalid day entry for Apri.");
                 System.exit(1);
               }
               break;

      case 5 : System.out.print("Enter day: (1-31): ");
               day = input.nextInt();

               if(day < 1 || day > 31) {
                 System.out.println("Invalid day entry for May.");
                 System.exit(1);
               }
               break;

      case 6 : System.out.print("Enter day: (1-30): ");
               day = input.nextInt();

               if(day < 1 || day > 30) {
                 System.out.println("Invalid day entry for June.");
                 System.exit(1);
               }
               break;

      case 7 : System.out.print("Enter day: (1-31): ");
               day = input.nextInt();

               if(day < 1 || day > 31) {
                 System.out.println("Invalid day entry July.");
                 System.exit(1);
               }
               break;

      case 8 : System.out.print("Enter day: (1-31): ");
               day = input.nextInt();

               if(day < 1 || day > 31) {
                 System.out.println("Invalid day entry for August.");
                 System.exit(1);
               }
               break;

      case 9 : System.out.print("Enter day: (1-30): ");
               day = input.nextInt();

               if(day < 1 || day > 30) {
                 System.out.println("Invalid day entry for September.");
                 System.exit(1);
               }
               break;

      case 10: System.out.print("Enter day: (1-31): ");
               day = input.nextInt();

               if(day < 1 || day > 31) {
                 System.out.println("Invalid day entry for October.");
                 System.exit(1);
               }
               break;

      case 11: System.out.print("Enter day: (1-30): ");
               day = input.nextInt();

               if(day < 1 || day > 30) {
                 System.out.println("Invalid day entry for November.");
                 System.exit(1);
               }
               break;

      case 12: System.out.print("Enter day: (1-31): ");
               day = input.nextInt();

               if(day < 1 || day > 31) {
                 System.out.println("Invalid day entry for December.");
                 System.exit(1);
               }
               break;
      default: System.out.print("Invalid entry.");
               System.exit(1);
               break;
    }

    // Calculate variables k and j to be used in Zeller's formula
    int k = year % 100;
    int j = year / 100;

    // Calculate the day number using Zeller's formula
    int dayNum = (day + ((26 * (month + 1)) / 10) + (k) + (k / 4) + (j / 4) + (5 * j)) % 7;

    // Output the day of the week
    switch(dayNum) {
      case 0 : System.out.println("Day of the week is Saturday");
               break;
      case 1 : System.out.println("Day of the week is Sunday");
               break;
      case 2 : System.out.println("Day of the week is Monday");
               break;
      case 3 : System.out.println("Day of the week is Tuesday");
               break;
      case 4 : System.out.println("Day of the week is Wednesday");
               break;
      case 5 : System.out.println("Day of the week is Thursday");
               break;
      case 6 : System.out.println("Day of the week is Friday");
               break;                            
      default: System.out.println("404 error not found.");
               System.exit(1);
               break;
    }


  }
}


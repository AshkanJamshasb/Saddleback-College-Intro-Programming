/* Chapter No. 4 - Exercise No.  7
File Name:          Program4_7_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Aug. 4, 2016

Problem Statement: To convert celcius to degrees or degrees to celcius

Overall Plan:
1. Decalre valus for different teperature objects
2. Call different methods with different purposes from the Temperature class to alter the temps
3. Compares if one temperature s cooler than the other
4. Compares if another temperature is warmer than the other
5. Changes the temp of the temperate

Classes needed and Purpose (Input, Processing, Output)
Temperature - to change different atriibutes about the temperature

DATA DICTIONARY
---------------
NAME      TYPE          temp RANGE   DESCRIPTION
========  ===========   ===========   ====================
temp1     Object        Temperature   the first temperature that will be altered
temp2     Object        Temperature   the second temperature that will be altered
temp3     Object        Temperature   the third temperature that will be altered
temp4     Object        Temperature   the fourth temperature that will be altered
temp5     Object        Temperature   the fifth temperature that will be altered
temp6     Object        Temperature   the sixth temperature that will be altered
*/
public class Program4_7_Jamshasb {

  public static void main(String[] args){
 
    Tempreture temp1 = new Tempreture();
    Tempreture temp2 = new Tempreture(32,'F');
    Tempreture temp3 = new Tempreture(-40);
    Tempreture temp4 = new Tempreture(-40,'F');
    Tempreture temp5 = new Tempreture(100,'C');
    Tempreture temp6 = new Tempreture(212,'F');


    System.out.println("\n" + temp1);
    System.out.println(temp2);
    System.out.println(temp3);
    System.out.println(temp4);
    System.out.println(temp5);
    System.out.println(temp6 + "\n");


    System.out.println("Is the second tempurature cooler than the first temperature? " + temp2.isLess(temp1));
    System.out.println("Is the third temperature warmer than the fouth temperature? " + temp4.isGreater(temp5));
    System.out.println("Is the third temperature warmer than the fouth temperature? " + temp4.isGreater(temp5) + "\n");
   
    System.out.println("Celsius of -40 degrees F: " + temp4.getCelsius());
    System.out.println("Fahrenhite of -40 degrees C: " + temp3.getCelsius() + "\n");
    temp1.settemp(15);
    temp2.settype('C');
    temp5.setBoth(34,'F');
  }
}

/* Chapter No. 4 - Exercise No.  7
File Name:          Program4_7_Jamshasb.java
Programmer:         Ashkan Jamshasb
Date Last Modified: Aug. 3, 2016

DATA DICTIONARY
---------------
NAME      TYPE          temp RANGE   DESCRIPTION
========  ===========   ===========   ====================
types     char          C/F           The letter deciding if it is farenheit or celcius
temp      long          any long     the temperature that is being calculated
*/
class Tempreture {

  private long temp;
  private char type;
 
  //Constructors
  public Tempreture(long temp) {
    this.temp=temp;
   this.type='C';
  }
  public Tempreture(char type) {
   this.temp=0;
    this.type=type;
  }
  public Tempreture(long temp,char type) {
    this.temp=temp;
    this.type=type;
  }
  public Tempreture() {
    this.temp=0;
    this.type='C';
  }

  /*
    Precondition: N/A
    Postcondition: The temperature in celcius
  */  
  public long getCelsius() {
    if (type == 'C') {
      return temp;
    } else {
      return (5*( temp - 32 )) / 9;
    }
  }
 
  /*
    Precondition: N/A
    Postcondition: Temperature in fahrenheite
  */  
  public long getFahrenhite() {
    if (type == 'C') {
      return ((9*( temp / 5 ))/5) + 32;
    } else {
      return temp;
    }
  }

  /*
    Precondition: the original temp of either celcius of fahrenheit
    Postcondition: to maaake the temp either celcius of fahrenheite
  */  
  public void settemp(long temp) {
    this.temp=temp;
  }
 
  /*
    Precondition: the original temp of the type
    Postcondition: to change the temp of the type (C/F)
  */  
  public void settype(char type) {
    this.type=type;
  }
 
  /*
    Precondition: the temperature and the type
    Postcondition: tthe altered value of the temperature and the type
  */  
  public void setBoth(long temp,char type) {
    this.temp=temp;
    this.type=type;
  }
 
  /*
    Precondition: The temperature ocject
    Postcondition: a boolean value to see if the tepms are equal
  */  
  public boolean equals(Tempreture obj) {
    if (type == 'C') {
      if (temp == obj.getCelsius()) {
        return true;
      } else {
        return false;
      }
    } else {
      if (temp == obj.getFahrenhite()) {
        return true;
      } else {
        return false;
      }
    }
  }
  
  /*
    Precondition: The temperature object
    Postcondition: a boolean value to see if a temp is higher than another
  */  
  public boolean isGreater(Tempreture obj) {
    if (type == 'C') {
      if (temp > obj.getCelsius()) {
        return true;
      } else {
        return false;
      }
    } else {
      if (temp > obj.getFahrenhite()) {
        return true;
      } else {
        return false;
      }
    }
  }
  
  /*
    Precondition: The temperature object
    Postcondition: a boolean value to see if a temp is lower than another
  */  
  public boolean isLess(Tempreture obj) {
    if (type == 'C') {
      if (temp < obj.getCelsius()) {
        return true;
      } else {
        return false;
      }
    } else {
      if (temp < obj.getFahrenhite()) {
        return true;
      } else {
        return false;
      }
    }
  }
 
  /*
    Precondition: N/A
    Postcondition: the temperature in their respective types
  */  
  public String toString() {
    if (type == 'C') {
     return "The tempreture in celsius is: "+temp+"\nThe tempreture in Fahrenhite is: "+getFahrenhite();
    } else {
      return "The tempreture in celsius is: "+getCelsius()+"\nThe tempreture in Fahrenhite is: "+temp; 
    } 
  } 
}


import java.util.Scanner;

public class Program3-Extra_Credit {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a complete sentene without puncuation any marks marks: ");
		String stingger = scan.nextLine(); //The sentence the user inputed
		
			int firstSpace = stingger.indexOf(" "); //Looks for the end of the first work
			
			int endOfString = stingger.length();//Length of the whole sentence
			
			String theEnd = stingger.substring(firstSpace + 1, endOfString);//The second part of the sentence 
			String theBeginning = stingger.substring(0, firstSpace);//The first part of the sentence
			

			System.out.println(theEnd.substring(0, 1).toUpperCase()+theEnd.substring(1)+" "+theBeginning.substring(0, 1).toLowerCase()+theBeginning.substring(1));
	}
}
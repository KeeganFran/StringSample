import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the string manipulation program!");
		System.out.println("Please give me a string to mess around with.");
		
		String userEntry = in.nextLine();
		
		System.out.println("So you entered "+userEntry);
		
		//Turn to capital letters
		String allCaps = userEntry.toUpperCase();
		System.out.println("The upper case version is "+allCaps);
		
		//Turn to lower case
		String noCaps = userEntry.toLowerCase();
		System.out.println("The lower case version is "+noCaps);
		
		//Find the length of a string
		int size = userEntry.length();
		System.out.println("The String has "+size+" characters");
		
		//Find a character
		if (userEntry.contains(" ")) {
			System.out.println("Your string had more than one word");
		}else {
			System.out.println("Your string only had one word");
		}
		
		//Replace a letter
		String replaced = userEntry.replace("e", "i");
		System.out.println("I've just replaced all of your \"e\"s with \"i\"s! "+replaced);
		
		//Compare a string
		if (userEntry.equals("quit")) {
			System.out.println("Apparently, you want to quit.");
		}else {
			System.out.println("You did not type \"quit\", so I'll keep going!");
		}
		
		//Starts with/ends with
		if (userEntry.startsWith("a")&&userEntry.endsWith("a")) {
			System.out.println("I find it interesting you started and ended with A");
		}
		if (userEntry.startsWith(Character.toString(userEntry.charAt(userEntry.length()-1)))){
			System.out.println("Wow! You started and ended with the same character!");
		}
		//Take a substring
		String firstHalf = userEntry.substring(0,userEntry.length()/2);
		String secondHalf= userEntry.substring(userEntry.length()/2);
		
		System.out.println("The first half of your string is "+firstHalf+"\nAnd the second half is "+secondHalf);
		
		//Split the string
		String[] words = userEntry.split(" ");
		//loop through the words and print them out (We'll cover this later!)
		System.out.println("The words of your String are:");
		for (int x=0;x<words.length;x++) {
			System.out.println("- "+words[x]);
		}
		
		//Comparing again
		if (noCaps.compareTo("medium")>0) {
			System.out.println("Your string comes after the word \"medium\"");
		}else if (noCaps.compareTo("medium")<0) {
			System.out.println("Your string comes before the word \"medium\"");
		}else {
			System.out.println("Your word IS \"medium\"!");
		}
		
	}
}

//2. WAP to print Duplicates characters from the String.
import java.util.*;
import java.lang.String;
public class DuplicateInString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your string : ");
		String string=scan.nextLine();
		scan.close();
		
		String duplicateChars =new String();
		for(int i=0;i<string.length();i++) 
		{	
			if(string.lastIndexOf(string.charAt(i))!=i && duplicateChars.indexOf(string.charAt(i)) < 0)
				duplicateChars+=string.charAt(i)+ "\n";
		}
		if(!duplicateChars.isBlank())
		{
			System.out.println("Duplicate elements in string are: ");
			System.out.println(duplicateChars);
		}
		else
			System.out.print("There are no duplicate Characters. "); 
	}

}

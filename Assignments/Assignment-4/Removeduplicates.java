//2.WAP to print Duplicates characters from the String.
import java.util.*;
import java.lang.String;
public class Removeduplicates {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your string: ");
		String val=scan.nextLine().toLowerCase();
		scan.close();
		
		String output=new String();				
		for(int i=0;i<val.length();i++) 
		{	
			boolean isNewChar = true;			
			for(int j=0;j<i;j++) 
			{				
				if(val.charAt(i)==val.charAt(j)) 
				{ 					
					isNewChar = false;
					break;
				}
				
			}
			if(isNewChar)
				output+=val.charAt(i);
		}
		System.out.print(output);
	}
}
		
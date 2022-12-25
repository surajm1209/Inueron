//3. WAP to check if '2552' is palindrome or not.
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your String :");
		String str=scan.next();
		scan.close();
		boolean isPalindrom = true;
		for(int i=0,j=str.length()-1 ; i<str.length();i++,j-- )		
		{
			if(str.charAt(i) != str.charAt(j))
			{
				isPalindrom = false;
				break;
			}	
		}
		if(isPalindrom)		
			System.out.println(str +" :is palindrome");
		else		
			System.out.println(str +" not a palindrome");		
	}

}

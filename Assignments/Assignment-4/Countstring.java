//4. WAP to count the number of consonants, vowels, special characters in a String.

import java.util.Scanner;
public class Countstring {

	public static void main(String[] args) {
		
		System.out.print("Enter your String : ");
		Scanner sc=new Scanner(System.in);
		int consonents=0,vowels=0,spec_char=0,digits=0;
		String str=sc.nextLine().toLowerCase();
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i); 
			if(ch>='a'&& ch<='z')
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
					vowels++;
				else
					consonents++;				
			}
			else if(ch>='0'&&ch<='9')		
				digits++;
			else
				spec_char++;
		}
		sc.close();
		System.out.println("consonents= "+consonents);
		System.out.println("vowels= "+vowels);
		System.out.println("spec_char= "+spec_char);
		System.out.println("digits= "+digits);

	}
}

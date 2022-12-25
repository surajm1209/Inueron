//5. WAP to implement Anagram Checking least inbuilt methods being used.
import java.util.*;
public class Panagram { 
    public static void main(String args[])  
    {  
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter first String : ");
        String str =sc.nextLine().toLowerCase();
		sc.close();  
        boolean allLetterPresent = true;  
        //loop iterate over each character of the given string  
        for (char ch = 'a'; ch <= 'z'; ch++)   
        {  
            //checks if the string does not contains all the letters  
            if (!str.contains(String.valueOf(ch)))   
            {  
                allLetterPresent = false;  
                break;  
            }  
        }  
        if (allLetterPresent)    
            System.out.println("Pangram String");  
        else  
            System.out.println("Not a Pangram String"); 

    }  
}  

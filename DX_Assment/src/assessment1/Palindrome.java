/**
 * 
 */
package assessment1;
import java.lang.StringBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author georg
 *
 */
public class Palindrome {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter Something: ");
		 //Enter data using BufferReader 
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
        // Reading data using readLine 
        String line1 = reader.readLine(); 
        System.out.print(line1 + " ");
        if (isPalindrome(line1)) {
        	System.out.print("is a palindrome");	
        }else {
            System.out.print("is not a palindrome");	
		}
                ;
	}
	
	public static Boolean isPalindrome(String s) {
		// TODO Auto-generated method stub
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		int halfLenght = s.length()/2;
		int len1, len2;
		len1 = halfLenght;
		if(halfLenght*2==s.length()) {
			len2 = halfLenght;
			}
		else {
			len2 = halfLenght+1;
		}
			
		String firstHalf = s.substring(0, len1);
		String secondHalf = new StringBuilder(s.substring(len2)).reverse().toString();
		return firstHalf.equalsIgnoreCase(secondHalf);
	}
	

}

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PalindromeChecker {
public void tester()
{
  String lines[] = loadStrings("palindromes.txt");
  System.out.println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public String onlyLetters(String sString){
 String str = "";
  for(int i = 0; i < sString.length(); i++){
    if(Character.isLetter(sString.charAt(i)) == true){
      str += sString.charAt(i);
    }
  }
  return str;
}
public boolean palindrome(String sWord) {
 String jword = onlyLetters(sWord).toLowerCase();
  String reversedWord = reverse(jword);
  return jword.equals(reversedWord);
}

public String reverse(String word) {
  String str = new String();
  for (int i = word.length() - 1; i >= 0; i--) {
    str += word.charAt(i);
  }
  return str;
}
}

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PalindromeChecker {
public void tester()
{
  String lines[] = loadStrings("palindromes.txt");
  String[] lines = new String[6]; 
    try{
        File myFile = new File("palindromes.txt");
        Scanner myReader = new Scanner(myFile);
        int counter = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            lines[counter] = data;
            counter++;
        }
        myReader.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  System.out.println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      System.out.println("true");
    }
    else
    {
      System.out.println("false");
    }
  }
}
public boolean palindrome(String sWord) {
    String str = "";
  for(int i = sWord.length()-1; i >=0; i--){
      str += sWord.charAt(i);
  }
  str= str.toLowerCase();
if (str.equals(reverse(sWord))){
  return true;
}
return false;
}

public String reverse(String word) {
  String str = new String();
  for (int i = word.length() - 1; i >= 0; i--) {
    if(Character.isLetter(str.charAt(i))){
    str += word.charAt(i);
  }

}
str = str.toLowerCase();
return str;
  
}
}


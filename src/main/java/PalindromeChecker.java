import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PalindromeChecker {
public void tester()
{
  //String lines[] = loadStrings("palindromes.txt");
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
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public boolean palindrome(String word)
{
  //your code here
String s = new String();
for(int i = word.length(); i > 0; i--){
    s += word.substring(i-1,i);
  }
  if(s.equals(word)){
    return true;
  }
  return false;
}
public String reverse(String str)
{
    String s = new String();
  for(int i = str.length(); i > 0; i--){
    s += str.substring(i-1,i);
  }
  return s;
}
  public String noCapitals(String sWord){
  String s = new String(); 
  for(int i = 0; i < sWord.length(); i++){
      char c = sWord.charAt(i);
    
    if(Character.isUpperCase(c)){
      s += Character.toLowerCase(c);
    }
    else{
      s +=c;
    }
  }
  return s;
}
public String noSpaces(String sWord){
  String s ="";
  for(int i = 0; i < sWord.length(); i++){
    char currentChar = sWord.charAt(i);
  
    if(currentChar != ' '){
      s+= currentChar; 
    
  }
}
return s;
}
public int numLetters(String sString){
  int count = 0;
  for(int i = 0; i < sString.length(); i++){
       char currentChar = sString.charAt(i);
  if(Character.isLetter(currentChar)){
    count++;
  }
}
return count;
}
public String onlyLetters(String sString){
  String s ="";
  for(int i = 0; i < sString.length(); i++){
       char currentChar = sString.charAt(i);
  if(Character.isLetter(currentChar)){
    s+=currentChar;
    }
  }
return s;
}
}

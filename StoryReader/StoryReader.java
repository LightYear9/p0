import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class StringOccurrence {
  public static String fileToString(String filePath){
     Scanner sc = null;
     String input = null;
     //adding string buffer to append, concatenate, and manipulate strings
     StringBuffer sb = null;
     try {
        sc = new Scanner(new File(filePath));
        sb = new StringBuffer();
        while (sc.hasNextLine()) {
           input = sc.nextLine();
           sb.append(" "+input);
        }
     }
     catch(Exception ex) {
        ex.toString();   
     }
     return sb.toString();
  }
  public static void main(String args[]) throws FileNotFoundException {
     String filePath = "/users/terrylight/revature/p0/storyreader/poem.txt";
     String txt = fileToString(filePath);
     String arr[] = txt.split(" ");
     for(String token : arr) {
        System.out.println(" ");
        System.out.println(token);
     }
  }
}

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.concurrent.TimeUnit;



public class StringOccurrence {
    public static String fileToString(String filePath) {
        Scanner sc = null;
        String input = null;
        //adding string buffer to append, concatenate, and manipulate strings
        StringBuffer sb = null;
        try {
            sc = new Scanner(new File(filePath));
            sb = new StringBuffer();
            while (sc.hasNextLine()) {
                input = sc.nextLine();
                sb.append(" " + input);
            }
        } catch (Exception ex) {
            ex.toString();
        }
        return sb.toString();
    }

    //Prints out a word every second
      public static void printWithDelays(String arr[], TimeUnit unit, long delay)
            throws InterruptedException {
            for(String token : arr) {
                System.out.println(" ");
                System.out.println(token);
                unit.sleep(delay);
           }
       }
    public static void main(String args[]) throws FileNotFoundException, InterruptedException {
        String filePath = "/users/maria/funny.txt";
        String txt = fileToString(filePath);
        String arr[] = txt.split(" ");
        printWithDelays(arr, TimeUnit.MILLISECONDS, 500);
  /*      for (String token : arr) {
            System.out.println(" ");
            System.out.println(token);
            unit.sleep(delay);*/
        }
    }


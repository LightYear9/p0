import java.util.Scanner;
//import java.awt.event.KeyEvent;


//The reaction game is a game that tells someone whether 
//they remember if the current shape matches the last shape

public class ReactionGame{
    public static void main(String[] args)
    {
        Scanner rG= new Scanner(System.in);
        String myChoice;
       

        do{
        Shape numShape = new Shape();
        numShape.printShape();
        System.out.println("Try again?");
        System.out.println("N | Y");
        myChoice = rG.next();
        }while(myChoice.equalsIgnoreCase("y"));

        //System.out.println(" no <-  | -> yes");
        //myChoice= keyPressed();
        
    }
}





//There will be a real time counter for when the minute finishes
//The will be a random number that indicates what shape displays.
//After the player guesses the program a new random number is generated.
//There will be a comparison between the shape number
//There will be a counter for how many right
//There will be a linked list to store the previous nodes.


//Future possibilities like storing high scores, bonus points,
//package p0;

//The reaction game is a game that tells someone whether 
//they remember if the current shape matches the last shape

public class ReactionGame{
    public static void main(String[] args)
    {
        Shape numShape = new Shape();
         numShape.printShape();
    }

}


class Shape {
    private int num;

    public Shape(){
        this.num=(int)(Math.random() * 5);
    }

    public int getNum(){
        return num;
    }

    public void printShape(){ 
            System.out.println( "My number is " + this.num);

            // case 0: System.out.println(rectangle()); break;
            // case 1: System.out.println(circle()); break;
            // case 2: System.out.println(triangle()); break;
            // case 3: System.out.println(octagon()); break;
            // case 4: System.out.println(star()); break;
    }
}




//There will be a real time counter for when the minute finishes
//The will be a random number that indicates what shape displays.
//After the player guesses the program a new random number is generated.
//There will be a comparison between the shape number
//There will be a counter for how many right
//There will be a linked list to store the previous nodes.

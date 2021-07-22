import java.awt.event.KeyEvent;

public class Shape {
    private int num;

    public Shape(){
        this.num=(int)(Math.random() * 4);
    }

    public int getNum(){
        return num;
    }
/* 
    public boolean keyPressed(KeyEvent event){
        if(event.getKeyCode()== KeyEvent.VK_LEFT){
        return false;
        }
        if(event.getKeyCode()== KeyEvent.VK_RIGHT){
        return true;
    }
        return false;
} */

    public void printShape(){ 
    
            System.out.println( "My new number is " + this.num);
            switch(num){
            case 0: pyramid(); break;
            case 1: square(); break;
            case 2: Cross(); break;
            case 3: Diamond(); break;
            // case 4: System.out.println(star()); break;
            }
        }

    public void pyramid(){
           //i for rows and j for columns      
            //row denotes the number of rows you want to print  
            int i, j, row = 9;       
            //Outer loop work for rows  
            for (i=0; i<row; i++)   
            {  
            //inner loop work for space      
            for (j=row-i; j>1; j--)   
            {  
            //prints space between two stars  
            System.out.print(" ");   
            }   
            //inner loop for columns  
            for (j=0; j<=i; j++ )   
            {   
            //prints star      
            System.out.print("* ");   
            }   
            //throws the cursor in a new line after printing each line  
            System.out.println();   
            }   


    }

    public void square(){

        int i, j, min, n; //n is the number up to you want to print  

        n=5; 
        //loo for upper left part  
        for (i = 1; i <= n; i++)    
        {   
        for (j = 1; j <= n; j++)   
        {   
        min = i < j ? i : j;   
        System.out.print(n - min + 1+ " ");   
        }  
        //loop for upper right part  
        for (j = n - 1; j >= 1; j--)   
        {   
        min = i < j ? i : j;   
        System.out.print(n - min + 1+ " ");   
        }   
        System.out.println();   
        }   
        //loop for lower left part  
        for (i = n - 1; i >= 1; i--)    
        {   
        for (j = 1; j <= n; j++)    
        {   
        min = i < j ? i : j;   
        System.out.print(n - min + 1+ " ");   
        }   
        //loop for lower right part  
        for (j = n - 1; j >= 1; j--)    
        {   
        min = i < j ? i : j;   
        System.out.print(n - min + 1+ " ");   
        }   
        System.out.println();   
        }   

        } 

public void Cross(){
    
        int n=5;         
        char c = '^';
        int i=1;
        int j;
         int k=n*2-1;
        while(i<=k){ 
             j=1;
            while(j<=k){           
                if(j==i || j==k-i+1)
                System.out.print(c);
                System.out.print(" ");             
                j++;
                            }     
                System.out.println();
            i++;
                   }              
        }
    

        public void Diamond(){
            int n, i, j, space = 1;
            n = 5;
            space = n - 1;
            for (j = 1; j<= n; j++)
            {
            for (i = 1; i<= space; i++)
            {
            System.out.print(" ");  
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++)
            {
            System.out.print("+");
            }
            System.out.println("");
            }
            space = 1;
            for (j = 1; j<= n - 1; j++)
            {
            for (i = 1; i<= space; i++)
            {
            System.out.print(" ");
            }
            space++;
            for (i = 1; i<= 2 * (n - j) - 1; i++)
            {
            System.out.print("+");
            }
            System.out.println("");
            }
                    }

}



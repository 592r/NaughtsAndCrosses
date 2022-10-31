import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner coolScanner = new Scanner(System.in);
        Scanner myScanner = new Scanner(System.in);
        Scanner charlieScanner = new Scanner(System.in);

        System.out.println("Hello Welcome To Naughts and Crosses");
        System.out.println("Do you want to play against the computer? (y/n)");
        
        String input = charlieScanner.nextLine();
        boolean playingWithComputer;
        
        int round = 0;

        if (input.equals("y")){
            playingWithComputer = true;
        } else {
            playingWithComputer = false;
        }
        
        
        //Some stuff I did
        // Nice one, to check if something is equal in java we have to use .equals(). I changed it below
        if (playingWithComputer.equals(true)){
            
            
        } else {
            
            // #TODO Ask for player one name and if they want naughts or crosses
            
            // #TODO Ask for player two name
            
            while (gameOver.equals(false)){
                
                if(round % 2 == 0){
                    // Even round number, player one's turn
                    
                    // #TODO Ask where player two wants to put their move (row then column)
                    
                } else {
                    
                    //Odd Round Number, player two's turn
                    
                    // #TODO Ask where player two wants to put their move
                }
                   
                
            }
            
            
        }
        
        
        boolean coolBoolean = true;
        boolean myBoolean = true;
        System.out.println("Do you want to be naughts or crosses? (y/n)");
        input = coolScanner.nextLine();

        showScreen();



    }

    public static void showScreen(){

        System.out.println(row());
        System.out.println(row());
        System.out.println(row());


    }

    public static String row(){

        String row = "|*******************|\n|     |      |      |\n|*******************|";

        return row;
    }
}

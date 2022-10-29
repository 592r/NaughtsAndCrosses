import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner coolScanner = new Scanner(System.in);
        Scanner myScanner = new Scanner(System.in);
        Scanner charlieScanner = new Scanner(System.in);

        System.out.println("Hello Welcome To Naughts and Crosses");
        System.out.println("Do you want to play against your friend or the computer? (y/n)");
        String input = charlieScanner.nextLine();
        boolean playingWithComputer;

        if (input.equals("y")){
            playingWithComputer = true;
        } else {
            playingWithComputer = false;
        }

        boolean coolBoolean = true;
        boolean myBoolean = true;
        System.out.println("Do you want to be naughts or crosses? (y/n)");
        input = coolScanner.nextLine();

        showScreen();



    }

    public static void showScreen(){

        System.out.println(cell());

    }

    public static String cell (){

        String cell = "***\n*X*\n***";

        return cell;
    }
}
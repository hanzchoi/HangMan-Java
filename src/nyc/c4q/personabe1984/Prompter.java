package nyc.c4q.personabe1984;

import java.util.Scanner;

public class Prompter {

    private Game mGame;

    public Prompter(Game game){
        mGame = game;
    }

    public void play(){
        while(mGame.getRemainingTries() > 0){
            displayProgress();
            promptForGuess();
        }
    }


    public boolean promptForGuess(){
        Scanner console = new Scanner(System.in);
        boolean isHit = false;
        boolean isValidGuess = false;
        while( !isValidGuess)
        {
            System.out.println("Enter a letter:  ");
            String guessAsString = console.nextLine();
            char guess = guessAsString.charAt(0);

            try
            {
                isHit = mGame.applyGuesses(guess);
                isValidGuess = true;
            }
            catch(IllegalArgumentException iae)
            {
                System.out.printf("%s. Please try again.\n", iae.getMessage());
            }
        }
        return isHit;
    }

    public void displayProgress(){
        System.out.printf(" You have %d tries left to solve %s \n", mGame.getRemainingTries() , mGame.getCurrentProgress());
    }


}

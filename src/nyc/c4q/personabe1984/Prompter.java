package nyc.c4q.personabe1984;

import java.util.Scanner;

public class Prompter {

    private Game mGame;

    public Prompter(Game game){
        mGame = game;
    }

    public void play(){
        while(mGame.getRemainingTries() > 0 && !mGame.isSolved()){
            displayProgress();
            promptForGuess();
        }
        if(mGame.isSolved()){
            System.out.printf("Congradulation you won with %d tries remaining. \n", mGame.getRemainingTries());
        }else{
            System.out.printf("Sorry the word was %s. \n", mGame.getAnswer());
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
            try
            {
                isHit = mGame.applyGuess(guessAsString);
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

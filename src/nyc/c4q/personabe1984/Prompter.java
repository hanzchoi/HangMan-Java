package nyc.c4q.personabe1984;

import java.io.Console;
import java.util.Scanner;

public class Prompter {

    private Game mGame;

    public Prompter(Game game){
        mGame = game;
    }

    public boolean promptForGuess(){
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a letter:  ");
        String guessAsString = console.nextLine();
        char guess = guessAsString.charAt(0);
        return mGame.applyGuesses(guess);
    }

}

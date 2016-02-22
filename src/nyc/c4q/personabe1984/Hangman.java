package nyc.c4q.personabe1984;


public class Hangman {

    public static void main(String[] args){

        Game game = new Game("Treehouse");

        Prompter prompter = new Prompter(game);
        boolean isHit = prompter.promptForGuess();

        if(isHit){
            System.out.println("is a hit");
        }else{
            System.out.println("is a miss");
        }
    }


}

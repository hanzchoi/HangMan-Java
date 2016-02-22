package nyc.c4q.personabe1984;

public class Game {
    private String mAnswer;
    private String mHits;
    private String mMisses;

    public Game(String answer){
        mAnswer = answer;
        mHits = "";
        mMisses = "";
    }

    public boolean applyGuesses(char letter){
        boolean isHit = mAnswer.indexOf(letter) >= 0;
        if(isHit){
            mHits += letter;
        }else{
            mMisses += letter;
        }
        return isHit;
    }


}

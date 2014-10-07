package lesson6;


public class GuessMachine {
    private int number,numGuesses,guess;
    
    public GuessMachine(){
        number = (int)Math.floor((Math.random() * 100) + 1);
        guess = 0;
        numGuesses=0;
        
    }
    public boolean setGuess (int n){
        if (n > 0 && n <= 100){
            guess = n;
            numGuesses++;
            return true;
        }
        else{
            return false;
        }
    }
    public int getNumGuess(){
        return numGuesses;
    }
    public String giveHint (){
        if (guess == number){
            return ". You got it!";
        }
        else if (guess > number){
            return ". Guess lower!";
        }
        else 
            return ". Guess higher!";
    }
}

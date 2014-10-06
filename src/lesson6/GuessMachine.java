
public class GuessMachine {
    private int number,numGuesses,guess;
    
    public GuessMachine(){
        number = ((int)Math.random()*100)+1;
        guess = 0;
        numGuesses=0;
        
    }
}

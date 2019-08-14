package pl.pawluk.guessingNumbersGame;

public class Application {

    public static void main(String[] args){

        GuessNumber.setMin(0);
        GuessNumber.setMax(1000);
        GuessNumber.setGuess(10);
        GuessNumber.start();
    }
}

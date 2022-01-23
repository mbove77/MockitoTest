package player;

public class Player {

    private Dice dice;
    private int minNumberToWin;

    public Player(Dice dice, int minNumberToWin) {
        this.dice = dice;
        this.minNumberToWin = minNumberToWin;
    }

    public boolean play() {
        int diceNumber = dice.roll();

        if(diceNumber > minNumberToWin) {
            return  true;
        } else {
            return false;
        }
    }
}

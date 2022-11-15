package JTrisGame.app.model;

public class Player implements I_Player{

    private final int id;

    private final char symbol;

    public Player(int id) {
        if(id%2==1)
            this.symbol='x';
        else
            this.symbol='o';
        this.id = id;
    }

    @Override
    public char getSymbol() {
        return this.symbol;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String toString(){
        return "Player: " + this.id + "[" + this.symbol + "]";
    }

}

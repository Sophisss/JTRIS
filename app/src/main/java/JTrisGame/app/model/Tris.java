package JTrisGame.app.model;

public class Tris implements I_Tris{

    private char [][] matrix;

    private final int row = 3;

    private final int column = 3;

    private final Player p1, p2;
    private Player currentPlayer, winner;

    public Tris(int id1,int id2){
        if ((id1%2 == id2%2))
            id2++;
        this.p1 = new Player(id1);
        this.p2 = new Player(id2);
        startGame();
    }

    private void startGame() {
        this.matrix = new char[row][column];
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                this.matrix[i][j] = '-';
            }
        }
        this.currentPlayer = this.p1;
        this.winner = null;
    }

    @Override
    public Player getCurrentPlayer() {
        return this.currentPlayer; }

    @Override
    public void setCurrentPlayer() {
        if(this.currentPlayer==this.p1)
            currentPlayer=p2;
        else currentPlayer=p1; }

    @Override
    public Player getWinner() {
        return this.winner;
    }

    @Override
    public void setWinner(Player winner) {
        this.winner = winner;
    }

    @Override
    public int getRow() {
        return this.row;
    }

    @Override
    public int getColumn() {
        return this.column;
    }

    @Override
    public Player getP1() {
        return this.p1;
    }

    @Override
    public Player getP2() {
        return this.p2;
    }

    @Override
    public void setCasella(int i, int j) {
            matrix[i][j] = this.currentPlayer.getSymbol();

            if(verifyWinner())
                setWinner(this.getCurrentPlayer());
            else setCurrentPlayer();
        }

    @Override
    public void restart(){
        startGame();
    }

    @Override
    public void printMatrix(){
        for(int i=0; i < this.row; i++){
            for(int j=0; j < this.column; j++){
                System.out.printf(this.matrix[i][j] + " ");
            }
            System.out.println(' ');
        }
    }

    /**
     * Controlla se &egrave; possibile fare la mossa sulla casella indicata.
     * @param i riga della cella
     * @param j colonna della cella
     * @return <code>true</code> se la casella &egrave; libera e si pu&ograve; fare
     * <code>false</code> altrimenti.
     */
    public boolean possibleMovement(int i, int j){
        return (matrix[i][j]=='-');
    }

    /**
     * Controlla se c'&egrave; un giocatore.
     * @return <code>true</code> se &egrave; presente, <code>false</code> altrimenti.
     */
    private boolean verifyWinner() {
        char symbol;
        boolean result = false;

        //Check rows
        for (int i = 0; i < this.getRow(); i++) {
            symbol = matrix[i][0];
            if (symbol != '-' && symbol == matrix[i][1] &&
                    symbol == matrix[i][2])
                result = true;
        }

        //Check columns
        if (!result)
            for (int i = 0; i < this.getColumn(); i++) {
                symbol = matrix[0][i];
                if (symbol != '-' && symbol == matrix[1][i] &&
                        symbol == matrix[2][i])
                    result = true;
            }

        if(!result)
            result = ('-' != (symbol = matrix[0][0])) && ((symbol == matrix[1][1]) && (symbol == matrix[2][2]))
                    || ('-' != (symbol = matrix[0][2])) && ((symbol == matrix[1][1]) && (symbol == matrix[2][0]));

        return result;
    }
}

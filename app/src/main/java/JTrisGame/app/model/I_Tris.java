package JTrisGame.app.model;

public interface I_Tris {

    Player getCurrentPlayer();

    void setCurrentPlayer();

    Player getWinner();

    void setWinner(Player winner);

    int getRow();

    int getColumn();

    Player getP1();

    Player getP2();

    void setCasella(int i, int j);

    void restart();

    void printMatrix();
}

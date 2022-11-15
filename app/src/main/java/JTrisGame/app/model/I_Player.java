package JTrisGame.app.model;

/**
 * Rappresenta il giocatore caratterizzato da un id e da un simbolo
 * che user&agrave; durante la partita.
 */
public interface I_Player {

    /**
     * Ritorna il simbolo assegnato al giocatore.
     * @return il simbolo del giocatore.
     */
    char getSymbol();

    /**
     * Ritorna l'id del giocatore.
     * @return id del giocatore.
     */
    int getId();
}

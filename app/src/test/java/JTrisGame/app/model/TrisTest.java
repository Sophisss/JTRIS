package JTrisGame.app.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrisTest {

    @Test
    public void testTrisClass(){
        Tris tris = new Tris(3,3);
        assertEquals(3, tris.getRow());
        assertEquals(3, tris.getColumn());
        assertNull(tris.getWinner());
        assertEquals(tris.getP1(), tris.getCurrentPlayer());
        tris.setCasella(2,2);
        assertEquals(tris.getP2(), tris.getCurrentPlayer());
        tris.setCasella(0,0);
        tris.setCasella(1,2);
        tris.setCasella(1,0);
        tris.setCasella(0,2);
        assertEquals(tris.getP1(), tris.getWinner());
        tris.printMatrix();
        tris.restart();
        assertEquals(tris.getP1(), tris.getCurrentPlayer());
        assertNull(tris.getWinner());

    }
}

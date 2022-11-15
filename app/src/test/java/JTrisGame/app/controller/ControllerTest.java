package JTrisGame.app.controller;

import JTrisGame.app.model.Tris;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ControllerTest {
    Tris tris = new Tris(2,5);
    Controller controller = new Controller(tris);

     @Test
    public void testControllerClass(){
         System.out.println("-----Controller test matrix-----");
        controller.trisSetCasella(2,2);
        controller.trisSetCasella(0,0);
        controller.trisSetCasella(2,1);
        controller.trisSetCasella(1,1);
        controller.trisSetCasella(2,0);
        assertEquals(tris.getP1(), tris.getWinner());
         tris.printMatrix();
        controller.trisRestart();
        assertEquals(tris.getP1(), tris.getCurrentPlayer());
        assertNull(tris.getWinner());

    }

}

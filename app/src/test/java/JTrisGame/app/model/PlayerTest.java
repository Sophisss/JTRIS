package JTrisGame.app.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void testPlayerConstructor() {
        Player player = new Player(4);
        assertEquals('o', player.getSymbol());
        assertEquals(4, player.getId());
        System.out.println(player);
    }
}
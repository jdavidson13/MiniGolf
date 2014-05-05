	

    package minigolf;
     
    import static org.junit.Assert.*;
    import java.util.ArrayList;
    import org.junit.BeforeClass;
    import org.junit.Test;
     
    /**
     * @author Josh Duong
     * @author Jon Davidson
     * @author Shaz Hosein
     * @author John McLain
     */
     
    public class MainTest {
           
            private static ArrayList<Player> players;
            private static Course c;
            private static Round r;
     
            @BeforeClass
            public static void setUpBeforeClass() throws Exception {
                    r = new Main().newRound(players, c);
            }
     
            @Test /* Test to verify that the Round object created by Main.newRound()
                   * is not null. */
            public void testNewRoundIsNotNull() {
                    assertNotNull(r);
            }
           
            @Test /* Test to verify that the Round object created by Main.newRound()
                   * is a valid Round object. */
            public void testNewRoundIsCorrectObjectType() {
                    assertTrue(r instanceof Round);
            }
    }


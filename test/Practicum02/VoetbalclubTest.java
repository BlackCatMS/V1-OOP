package Practicum02;

import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {
    // Testgeval 1: Check of de naam automatisch "FC" wordt bij "" & null.

    @Test
    public void checkName() {
        System.out.println("Running name tests... Names \"\", null, should be changed to \"FC\"");
        Voetbalclub testBlank = new Voetbalclub("");
        Voetbalclub testVoid = new Voetbalclub(null);
        assertEquals("FC", testBlank.getClubName(), "Expected name to automatically convert to \"FC\". This didn't happen.");
        assertEquals("FC", testVoid.getClubName(),"Expected name to automatically convert to \"FC\". This didn't happen.");
        System.out.println("BlankNameTest passed. The club name was successfully changed to " + testBlank.getClubName());
        System.out.println("NullNameTest passed. The club name was successfully changed to " + testVoid.getClubName());
    }

    // Testgeval 2: "w", "g", "v" geven respectievelijk 3, 1, 0 punten mee. Foutieve invoer past niet aantalGespeeld() aan.
    @Test
    public void checkScore() {
        System.out.println("Running score tests... ");
        Voetbalclub testScore = new Voetbalclub("Test");
        testScore.verwerkResultaat('w');
        assertEquals(3, testScore.aantalPunten(), "Expected a score of 3 points. This didn't happen");
        testScore.verwerkResultaat('g');
        assertEquals(4, testScore.aantalPunten(), "Expected a score of 4 points (3 + 1). This didn't happen");
        testScore.verwerkResultaat('v');
        assertEquals(4, testScore.aantalPunten(), "Expected a score of 4 points (3 + 1 + 0). This didn't happen");
        assertEquals(3, testScore.aantalGespeeld(), "Expected 3 matched played. This didn't happen.");
        testScore.verwerkResultaat('a');
        assertEquals(4, testScore.aantalPunten(), "Expected a score of 4 points (Unchanged score). This didn't happen");
        assertEquals(3, testScore.aantalGespeeld(), "Expected 3 matched played (Unchanged amount) This didn't happen");
        System.out.println("Score tests passed.");
    }
}
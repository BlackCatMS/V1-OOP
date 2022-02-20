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
        System.out.println("BlankNameTest passed. The club name was successfully changed to " + testBlank.getClubName() + " from \"\"");
        System.out.println("NullNameTest passed. The club name was successfully changed to " + testVoid.getClubName()+ " from null");
    }

    // Testgeval 2: "w", "g", "v" geven respectievelijk 3, 1, 0 punten mee. Foutieve invoer past niet aantalGespeeld() aan.
    @Test
    public void checkScore() {
        System.out.println("Running score tests... ");
        Voetbalclub testScore = new Voetbalclub("Test");
        // In deze test worden resultaten na elke assertEquals() gewijzigd, en opnieuw gecontroleerd of de waardes kloppen.
        testScore.verwerkResultaat('w');
        assertEquals(3, testScore.aantalPunten(), "Expected a score of 3 points. This didn't happen");
        testScore.verwerkResultaat('g');
        assertEquals(4, testScore.aantalPunten(), "Expected a score of 4 points (3 + 1). This didn't happen");
        testScore.verwerkResultaat('v');
        assertEquals(4, testScore.aantalPunten(), "Expected a score of 4 points (3 + 1 + 0). This didn't happen");
        assertEquals(3, testScore.aantalGespeeld(), "Expected 3 matched played. This didn't happen.");
        testScore.verwerkResultaat('a');
        // Foutieve invoer, zoals een onherkende ch, zou aantalGespeeld() niet aanpassen.
        assertEquals(4, testScore.aantalPunten(), "Expected a score of 4 points (Unchanged score). This didn't happen");
        assertEquals(3, testScore.aantalGespeeld(), "Expected 3 matched played (Unchanged amount) This didn't happen");
        System.out.println("Score tests passed.");
    }

    // Testgeval 3: "w", "g", "v" geven respectievelijk 3, 1, 0 punten mee.
    @Test
    public void checkString() {
        System.out.println("Running toString test...");
        Voetbalclub testScore = new Voetbalclub("Test");
        testScore.verwerkResultaat('w');
        testScore.verwerkResultaat('g');
        testScore.verwerkResultaat('v');
        // Een winst, een gelijkspel en een verlies brengen het volgende op:
        // 3 gespeeld, 1 winst, 1 gelijkspel, 1 verlies, 4 punten,
        // Deze test controleert of de output van toString() deze resultaten correct verwerkt.
        assertEquals("Test 3 1 1 1 4", testScore.toString(), "Expected correct processing of the handled games, but instead encountered errors.");
        System.out.println("toString test passed.");
    }

    // Testgeval 4: Herhaaldelijk verwerken van deze resultaten moet zorgen voor een correcte optelling van wedstrijdaantallen en punten.
    @Test
    public void checkSum() {
        System.out.println("Running score tests... Adding up 5 matches: 3w, 1g, 1v, with 2 incorrect inputs.");
        Voetbalclub testScore = new Voetbalclub("Test");
        // Er worden 7 resultaten verwerkt: drie winsten, één gelijkspel en één verloren wedstrijd.
        // Er worden ook 2 foutieve inputs verwerkt. Dit draagt niet bij aan aantalGespeeld()
        testScore.verwerkResultaat('w');
        testScore.verwerkResultaat('3');
        testScore.verwerkResultaat('w');
        testScore.verwerkResultaat('g');
        testScore.verwerkResultaat('v');
        testScore.verwerkResultaat('w');
        testScore.verwerkResultaat('l');
        assertEquals(10, testScore.aantalPunten(), "Expected a score of 10 points (9 + 1). This didn't happen.");
        assertEquals(5, testScore.aantalGespeeld(), "Expected 5 matches played. This didn't happen.");
        System.out.println("Score tests (total) passed.");
    }
}

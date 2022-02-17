package Practicum02;

import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {
    // Testgeval 1: Check of de naam automatisch "FC" wordt bij "".
    @Test
    public void checkNameBlank() {
        System.out.println("Running BlankNameTest... Name \"\" should be changed to \"FC\"");
        Voetbalclub testBlank = new Voetbalclub("");
        assertEquals("FC", testBlank.getClubName(), "Expected name to automatically convert to \"FC\". This didn't happen.");
        System.out.println("BlankNameTest passed. The club name was successfully changed to " + testBlank.getClubName());
    }

    // Testgeval 1: Check of de naam automatisch "FC" wordt bij null.
    @Test
    public void checkNameNull() {
        System.out.println("Running NullNameTest... Name null should be changed to \"FC\"");
        Voetbalclub testVoid = new Voetbalclub(null);
        assertEquals("FC", testVoid.getClubName(),"Expected name to automatically convert to \"FC\". This didn't happen.");
        System.out.println("NullNameTest passed. The club name was successfully changed to " + testVoid.getClubName());
    }

    // Testgeval 2: "w", "g", "v" geven respectievelijk 3, 1, 0 punten mee. Foutieve invoer past niet aantalGespeeld() aan.

}
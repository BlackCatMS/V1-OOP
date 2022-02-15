package Practicum02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZwembadTest {

    @Test
    public void testBerekendeInhoud() {
        System.out.println("testBerekendeInhoud");
        Zwembad z1 = new Zwembad(2.2, 5.5, 1.5);
        assertEquals(16.5, z1.inhoud(), "test machine broke");
    }

}
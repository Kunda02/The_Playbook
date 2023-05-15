package hu.unideb.inf.sfm.ij.theplaybook.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PBTest {
    @Test
    void getUsername_code1() {
        User user = new User();
        user.setUsername("Sanyi");
        assertEquals("Sanyi",user.getUsername());
    }
    @Test
    void getUsername_code2() {
        User user = new User();
        user.setUsername("Teréz");
        assertEquals("Teréz",user.getUsername());
    }
    @Test
    void getPassword_code1() {
        User user = new User();
        user.setPassword("jelszó");
        assertEquals("jelszó",user.getPassword());
    }
    @Test
    void getPassword_code2() {
        User user = new User();
        user.setPassword("#&@1");
        assertEquals("#&@1",user.getPassword());
    }
}

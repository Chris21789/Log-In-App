import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginClassTest {

    @Test
    void getUsername() {
        LoginClass l = new LoginClass("DonaldDuck", "Goofy");
        assertEquals("DonaldDuck", l.getUsername());
    }

    @Test
    void setUsername() {
        LoginClass l = new LoginClass("DonaldDuck", "Goofy");
        l.setUsername("MickyMouse");
        assertEquals("MickyMouse", l.getUsername());
    }

    @Test
    void getPassword() {
        LoginClass l = new LoginClass("DonaldDuck", "Goofy");
        assertEquals("Goofy", l.getPassword());
    }

    @Test
    void setPassword() {
        LoginClass l = new LoginClass("DonaldDuck", "Goofy");
        l.setPassword("Pluto");
        assertEquals("Pluto", l.getPassword());
    }
}
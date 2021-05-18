package TV;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TV_Test {
    @Test
    void testThatTvNameIsSet() {
        TV newTV;
        newTV = new TV();
        assertEquals("Ehizman", newTV.getName());
    }

    @Test
    void testThatTvCanPowerOn() {
        TV newTV;

        newTV = new TV();
        assertEquals("Ehizman", newTV.getName());
        newTV.setOn(true);

        assertTrue(newTV.isOn());

    }
}

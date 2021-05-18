package TV;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TV_Test {
    @Test
    void testThatTvNameIsSet() {
        TV newTV;
        newTV = new TV(0,1);
        assertEquals("Ehizman", newTV.getName());
    }

    @Test
    void testThatTvCanPowerOn() {
        TV newTV;

        newTV = new TV(0,1);
        assertEquals("Ehizman", newTV.getName());
        newTV.setOn(true);

        assertTrue(newTV.isOn());
    }

    @Test
    void testThatTvCanPowerOff() {
        TV newTV;

        newTV = new TV(0,1);
        newTV.setOn(true);
        assertTrue(newTV.isOn());

        newTV.setOn(false);
        assertFalse(newTV.isOn());
    }

    @Test
    void testThatTvCanMoveToNextChannel() {
        TV newTV;

        newTV = new TV(0,1);
        newTV.setOn(true);
        newTV.moveToNextChannel();

        assertEquals(2, newTV.getCurrentChannel());
    }

    @Test
    void testThatTvChannelIsSetToDefault_1AtCreation() {
        TV newTV;
        newTV = new TV(0,1);
        assertEquals(1, newTV.getCurrentChannel());
    }

    @Test
    void testThatTvVolumeIsSetToDefault_0AtCreation() {
        TV newTV;
        newTV = new TV(0,1);
        assertEquals(0, newTV.getCurrentVolume());
    }

    @Test
    void testThatTvCanMoveToNextChannelMultipleTimes() {
        TV newTV;

        newTV = new TV(0,1);
        assertEquals(0, newTV.getCurrentVolume());
        assertEquals(1, newTV.getCurrentChannel());
        newTV.setOn(true);
        newTV.moveToNextChannel();
        newTV.moveToNextChannel();

        assertEquals(3, newTV.getCurrentChannel());
    }

    @Test
    void testThatTvCanSetChannel() {
        TV newTV;

        newTV = new TV(0,1);
        newTV.setChannel(10);
        assertEquals(10, newTV.getCurrentChannel());
    }

//    @Test
//    void testThatTvCannotSetChannelWhenOff)(){}
}

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
/*
* TV cannot change channel when off
* */
    @Test
    void testThatTvCannotMoveToNextChannelWhenOff() {
        TV newTV;

        newTV = new TV(0,1);
        newTV.setOn(true);
        newTV.moveToNextChannel();
        assertEquals(2, newTV.getCurrentChannel());
        newTV.setOn(false);

        assertEquals(0,newTV.getCurrentChannel());
    }
/*
* upon creation tv should be set at channel 1 and at volume 1
*/
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
        assertEquals(1, newTV.getCurrentVolume());
    }

    @Test
    void testThatTvCanMoveToNextChannelMultipleTimes() {
        TV newTV;

        newTV = new TV(0,1);
        assertEquals(1, newTV.getCurrentVolume());
        newTV.setOn(true);
        newTV.moveToNextChannel();
        newTV.moveToNextChannel();

        assertEquals(3, newTV.getCurrentChannel());
    }

    @Test
    void testThatTvCanSetChannel() {
        TV newTV;

        newTV = new TV(0,1);
        newTV.setOn(true);
        newTV.setChannel(10);
        assertEquals(10, newTV.getCurrentChannel());
    }

    @Test
    void testThatTvCannotSetChannelWhenOff() {
        TV newTV;

        newTV = new TV(0,1);
        newTV.setOn(true);
        newTV.setOn(false);
        newTV.setChannel(10);
        assertEquals(0, newTV.getCurrentChannel());
    }

    @Test
    void testThatTvCanIncreaseVolume() {
        TV newTV;

        newTV = new TV(0,1);
        newTV.setOn(true);
        newTV.increaseVolume();

        assertEquals(2, newTV.getCurrentVolume());
    }

    @Test
    void testThatTvCannotIncreaseVolumeWhenOff() {
        TV newTV;

        newTV = new TV(0,1);
        newTV.setOn(true);
        newTV.increaseVolume();
        newTV.increaseVolume();
        assertEquals(3, newTV.getCurrentVolume());
        newTV.setOn(false);
        newTV.increaseVolume();
        assertEquals(0, newTV.getCurrentVolume());
    }

    @Test
    void testThatTvCanBeMute(){
        TV newTV;

        newTV = new TV(0,1);
        newTV.setOn(true);
        newTV.setMute(true);

        assertTrue(newTV.isMute());
    }

    @Test
    void testThatWhenTvIsMuteVolumeIsSetTo0(){
        TV newTV;

        newTV = new TV(0,1);
        newTV.setOn(true);
        newTV.increaseVolume();
        newTV.setMute(true);

        assertEquals(0, newTV.getCurrentVolume());
    }

    @Test
    void testThatTvCanBeUnmute(){
        TV newTV;

        newTV = new TV(0,1);
        newTV.setOn(true);
        newTV.setMute(true);
        newTV.setMute(false);

        assertFalse(newTV.isMute());
    }

    @Test
    void testThatWhenTvIsUnmuteVolumeIsSameAsBeforeMute(){
        TV newTV;

        newTV = new TV(0,1);
        newTV.setOn(true);
        newTV.increaseVolume();
        newTV.increaseVolume();
        assertEquals(3, newTV.getCurrentVolume());
        newTV.setMute(true);
        newTV.setMute(false);
        assertEquals(3,newTV.getCurrentVolume());
    }
    @Test
    void testThatWhenTvCanIncreaseVolumeWhenMute(){
        TV newTV;

        newTV = new TV(0,1);
        newTV.setOn(true);
        newTV.increaseVolume();
        newTV.increaseVolume();
        assertEquals(3, newTV.getCurrentVolume());
        newTV.setMute(true);
        newTV.increaseVolume();
        newTV.increaseVolume();
        newTV.setMute(false);
        assertEquals(5,newTV.getCurrentVolume());
    }

    @Test
    void testVolumeIsSetAlwaysSetToZeroUponCreation() {
        TV newTv;
        newTv = new TV(2,0);
        assertEquals(1,newTv.getCurrentVolume());
    }

    @Test
    void testThatChannelIsAlwaysSetToOneUponCreation(){
        TV newTv;
        newTv = new TV();
        assertEquals(1,newTv.getCurrentChannel());
    }

    @Test
    void testThatTvCanReduceVolume() {
        TV newTV;

        newTV = new TV();
        newTV.setOn(true);
        newTV.decreaseVolume();

        assertEquals(0, newTV.getCurrentVolume());
    }

    @Test
    void testThatTvCannotDecreaseVolumeWhenOff() {
        TV newTV;

        newTV = new TV(0,1);
        newTV.setOn(true);
        newTV.increaseVolume();
        newTV.increaseVolume();
        assertEquals(3, newTV.getCurrentVolume());
        newTV.setOn(false);
        newTV.decreaseVolume();
        assertEquals(0, newTV.getCurrentVolume());
    }
}

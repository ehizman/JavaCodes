package TV;

import assignments.AC.AC;
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
        newTV.moveToNextChannel();
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
    void testThatTvVolumeIsSetToDefault_1AtCreation() {
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
        newTV.increaseVolume();
        newTV.decreaseVolume();
        assertEquals(1, newTV.getCurrentVolume());
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

    @Test
    void testThatTvCanMoveToPreviousChannel() {
        TV newTV;

        newTV = new TV(0,1);
        newTV.setOn(true);
        newTV.moveToNextChannel();
        newTV.moveToPreviousChannel();
        assertEquals(1, newTV.getCurrentChannel());
    }
    /*
     * TV cannot change channel when off
     * */
    @Test
    void testThatTvCannotMoveToPreviousChannelWhenOff() {
        TV newTV;

        newTV = new TV(0,1);
        newTV.setOn(true);
        newTV.moveToNextChannel();
        assertEquals(2, newTV.getCurrentChannel());
        newTV.setOn(false);
        newTV.moveToPreviousChannel();
        assertEquals(0,newTV.getCurrentChannel());
    }

    @Test
    void testThatAcCannotBeMuteWhenOff() {
        TV newTv;

        newTv = new TV();
        newTv.setMute(true);

        assertFalse(newTv.isMute());
    }

    @Test
    void testThatWhenPoweredOnTvSetsVolumeToPreviousVolume(){
        TV newTv;

        newTv = new TV();
        newTv.setOn(false);
        assertFalse(newTv.isOn());
        newTv.setOn(true);
        assertEquals(1,newTv.getCurrentVolume());
    }

    @Test
    void testThatTvHasAMaximumVolumeOfTen(){
        TV newTV;

        newTV = new TV();
        newTV.setOn(true);
        newTV.setMute(true);
        newTV.setMute(false);
        newTV.setOn(false);
        newTV.setMute(true);
        assertFalse(newTV.isMute());
        newTV.setOn(true);
        newTV.increaseVolume();//2
        newTV.increaseVolume();//3
        newTV.increaseVolume();//4
        newTV.increaseVolume();//5
        newTV.increaseVolume();//6
        newTV.increaseVolume();//7
        newTV.increaseVolume();//8
        newTV.increaseVolume();//9
        newTV.increaseVolume();//10
        newTV.increaseVolume();
        assertEquals(10, newTV.getCurrentVolume());
    }


    @Test
    void testThatTvHasAMinimumVolumeOfOne() {
        TV newTV;

        newTV = new TV();
        newTV.setOn(true);
        newTV.decreaseVolume();
        assertEquals(1, newTV.getCurrentVolume());
    }
}

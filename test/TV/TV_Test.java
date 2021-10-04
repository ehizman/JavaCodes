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
    TV is volume and channel is initialized to 1 at creation
    TV maximum volume : 10
    TV minimum volume : 1
    Tv when muted is at volume: 0
    TV increases volume by 1
    Tv decreases volume by 1
    TV maximum channel : 10
    tv minimum channel: 1
    tv remembers previous volume when turned on after the first time
    tv remembers previous channel when turned on after the first time
    tv cannot increase volume when off
    tv cannot decrease volume when off
    tv cannot set channel when off
    tv cannot move to next channel when off
    tv cannot move to previous channel when off
    when tv is set on mute volume is set to 0
    when tv is unmute, volume is set to previous volume before mute
    tv cannot set mute and unmute when off

    tv change channel either by pressing the next channel or previous channel button
    or by typing in the channel number
    * TV cannot change channel when off
*    */
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

    @Test
    void testThatWhenPoweredOnTvSetsToPreviousVolume(){
        TV newTv;

        newTv = new TV();
        newTv.setOn(true);
        newTv.increaseVolume();
        assertEquals(2,newTv.getCurrentVolume());
        newTv.setOn(false);
        newTv.increaseVolume();
        assertEquals(0, newTv.getCurrentVolume());
        newTv.setOn(true);
        assertEquals(2, newTv.getCurrentVolume());
    }

    @Test
    void testThatWhenPoweredOnTvSetsToPreviousChannel(){
        TV newTv;

        newTv = new TV();
        newTv.setOn(true);
        newTv.moveToNextChannel();
        assertEquals(2,newTv.getCurrentChannel());
        newTv.setOn(false);
        newTv.increaseVolume();
        assertEquals(0, newTv.getCurrentVolume());
        newTv.setOn(true);
        newTv.moveToPreviousChannel();
        newTv.setOn(false);
        newTv.setOn(true);
        assertEquals(1, newTv.getCurrentChannel());
    }

    @Test
    void testThatTvCannotIncreaseChannelWhenOff() {
        TV newTv;

        newTv = new TV();
        newTv.setOn(true);
        newTv.setOn(false);
        newTv.setChannel(5);
        assertEquals(0, newTv.getCurrentChannel());
    }
/*
    requirement: Tv volume and channel are set to 0 when off
 */
    @Test
    void testThatTvCannotSetChannelBeyondMaximumWhenOff() {
        TV newTv;

        newTv = new TV();
        newTv.setOn(true);
        newTv.setChannel(8);
        newTv.setOn(false);
        newTv.setChannel(15);
        assertEquals(0,newTv.getCurrentChannel());
        newTv.moveToNextChannel();
        assertEquals(0, newTv.getCurrentChannel());
    }

    @Test
    void testThatTvCannotSetChannelBelowMinimum() {
        TV newTv;

        newTv = new TV();
        newTv.setOn(true);
        newTv.setChannel(8);
        newTv.setOn(false);
        newTv.setOn(true);
        newTv.setChannel(0);
        assertEquals(8, newTv.getCurrentChannel());
    }
}

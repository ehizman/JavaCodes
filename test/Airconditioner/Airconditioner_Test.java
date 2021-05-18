package Airconditioner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Airconditioner_Test {
    @Test
    void testThatConstructorWorks(){
        //given
        Airconditioner newAC;
        //when
        newAC = new Airconditioner("iCool By Ehizman");
        //assert
        assertEquals("iCool By Ehizman", newAC.getProductName());
    }

    @Test
    void testThatAcCanBeTurnedOn() {
        //given
        Airconditioner iCool;
        //when
        iCool = new Airconditioner("iCool By Ehizman");
        iCool.setOn(true);
        //assert
        assertTrue(iCool.isOn());
    }

    @Test
    void thatAcCanBeTurnedOff(){
        //given
        Airconditioner newAC;
        //when
        newAC = new Airconditioner("iCool By Ehizman");
        newAC.setOn(true);
        newAC.setOn(false);
        //assert
        assertFalse(newAC.isOn());
    }

    @Test
    void thatAcIsSetOnTo16DegreesWhenPoweredOnForTheFirstTime(){
        //given
        Airconditioner newAC;
        //when
        newAC = new Airconditioner("iCool By Ehizman");
        newAC.setOn(true);
        //assert
        assertEquals(16, newAC.getTemperature());
    }

    @Test
    void testThatTemperatureCanBeSet(){
        //given
        Airconditioner newAC;
        //when
        newAC = new Airconditioner("iCool By Ehizman");
        newAC.setOn(true);
        newAC.setTemperature(20);
        //assert
        assertEquals(20, newAC.getTemperature());
    }

    @Test
    void testThatAcCannotDisplayTemperatureWhenOff(){
        //given
        Airconditioner newAC;
        //when
        newAC = new Airconditioner("iCool By Ehizman");
        newAC.setOn(true);
        newAC.setOn(false);
        assertEquals(0, newAC.getTemperature());
    }

    @Test
    void testThatAcCannotSetTemperatureWhenOff() {
        //given
        Airconditioner newAC;
        //when
        newAC = new Airconditioner("iCool By Ehizman");
        newAC.setOn(true);
        newAC.setTemperature(20);
        newAC.setOn(false);
        newAC.setTemperature(16);
        assertEquals(0, newAC.getTemperature());
    }

    @Test
    void testThatAcIsSetToPreviousTemperatureWhenTurnedOnForTheSecondTime() {
        //given
        Airconditioner newAC;
        //when
        newAC = new Airconditioner("iCool By Ehizman");
        newAC.setOn(true);
        newAC.setTemperature(20);
        newAC.setOn(false);
        newAC.setOn(true);
        //assert
        assertEquals(20, newAC.getTemperature());
    }

    @Test
    void testThatAcIsSetToPreviousTemperatureWhenTurnedOnMultipleTimes() {
        //given
        Airconditioner newAC;
        //when
        newAC = new Airconditioner("iCool By Ehizman");
        newAC.setOn(true);
        newAC.setTemperature(20);
        newAC.setOn(false);
        newAC.setOn(true);
        newAC.setOn(false);
        newAC.setOn(true);
        newAC.setTemperature(24);
        newAC.setOn(false);
        newAC.setOn(true);
        newAC.setTemperature(28);
        //assert
        assertEquals(28, newAC.getTemperature());
    }

    @Test
    void thatAcCanIncreaseTemperature(){
        //given
        Airconditioner newAC;
        //when
        newAC = new Airconditioner("iCool By Ehizman");
        newAC.setOn(true);
        newAC.setTemperature(20);
        newAC.increaseTemperature();
        //assert
        assertEquals(21, newAC.getTemperature());
    }

}

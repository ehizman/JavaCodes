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
}

package com.service.scntestgit.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestSndtest {

        SndtestDelegate sndtestDelegate = new SndtestDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = sndtestDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
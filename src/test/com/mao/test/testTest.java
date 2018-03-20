package com.mao.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by x on 2018/3/14.
 */
public class testTest {



    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void chooseMagic() throws Exception {

    }

    @Test(timeout = 1)
    public void sum() throws Exception {
        assertEquals(490666094,new test().sum1(420234070));

    }

}
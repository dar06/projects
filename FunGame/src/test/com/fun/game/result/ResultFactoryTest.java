package com.fun.game.result;

import com.fun.game.Shape;
import com.fun.game.result.impl.PaperResult;
import com.fun.game.result.impl.RockResult;
import com.fun.game.result.impl.ScissorResult;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Darshana on 2017-09-22.
 */
public class ResultFactoryTest {

    private ResultFactory resultFactory;

    @Before
    public void setUp() {
        resultFactory = new ResultFactory();
    }

    @Test
    public void shouldCreateScissorResult() {
        //when
        Result result = resultFactory.createResult(Shape.SCISSOR);

        //then
        assertTrue(result instanceof ScissorResult);
    }

    @Test
    public void shouldCreatePaperResult() {
        //when
        Result result = resultFactory.createResult(Shape.PAPER);

        //then
        assertTrue(result instanceof PaperResult);
    }

    @Test
    public void shouldCreateRockResult() {
        //when
        Result result = resultFactory.createResult(Shape.ROCK);

        //then
        assertTrue(result instanceof RockResult);
    }


}
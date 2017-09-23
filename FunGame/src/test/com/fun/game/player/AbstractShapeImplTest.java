package com.fun.game.player;

import com.fun.game.Shape;
import com.fun.game.player.impl.AbstractShapeImpl;
import com.fun.game.player.impl.Human;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Darshana on 2017-09-22.
 */
public class AbstractShapeImplTest {
    @Test
    public void shouldEvaluateToScissor() throws Exception {
        //given
        final AbstractShapeImpl player = new Human();

        //when
        final Shape shape =player.toShapeEnum("0");

        //then
        assertEquals(Shape.SCISSOR, shape);
    }

    @Test
    public void shouldEvaluateToRock() throws Exception {
        //given
        final AbstractShapeImpl player = new Human();

        //when
        final Shape shape =player.toShapeEnum("1");

        //then
        assertEquals(Shape.ROCK, shape);
    }

    @Test
    public void shouldEvaluateToPaper() throws Exception {
        //given
        final AbstractShapeImpl player = new Human();

        //when
        final Shape shape =player.toShapeEnum("2");

        //then
        assertEquals(Shape.PAPER, shape);
    }

}
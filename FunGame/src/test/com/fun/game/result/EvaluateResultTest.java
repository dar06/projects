package com.fun.game.result;

import com.fun.game.Shape;
import com.fun.game.player.Player;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static com.fun.game.result.Constants.PLAYER1_WINNER;
import static com.fun.game.result.Constants.PLAYER2_WINNER;
import static com.fun.game.result.Constants.TIE;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Created by Darshana on 2017-09-22.
 */
@RunWith(MockitoJUnitRunner.class)
public class EvaluateResultTest {

    @Mock
    private Player player1;
    @Mock
    private Player player2;


    @Test
    public void shouldEvaluateResultAsTie() {
        //given
        when(player1.getShape()).thenReturn(Shape.SCISSOR);
        when(player2.getShape()).thenReturn(Shape.SCISSOR);
        final EvaluateResult evaluateResult = new EvaluateResult(player1, player2);

        //when
        String result = evaluateResult.getResult();

        //then
        assertEquals(TIE, result);
    }

    @Test
    public void shouldEvaluateResultForScissor_case1(){
        //given
        when(player1.getShape()).thenReturn(Shape.SCISSOR);
        when(player2.getShape()).thenReturn(Shape.ROCK);
        final EvaluateResult evaluateResult = new EvaluateResult(player1, player2);

        //when
        String result = evaluateResult.getResult();

        //then
        assertEquals(PLAYER2_WINNER, result);

    }

    @Test
    public void shouldEvaluateResultForScissor_case2(){
        //given
        when(player1.getShape()).thenReturn(Shape.SCISSOR);
        when(player2.getShape()).thenReturn(Shape.PAPER);
        final EvaluateResult evaluateResult = new EvaluateResult(player1, player2);

        //when
        String result = evaluateResult.getResult();

        //then
        assertEquals(PLAYER1_WINNER, result);

    }

    @Test
    public void shouldEvaluateResultForRock_case1(){
        //given
        when(player1.getShape()).thenReturn(Shape.ROCK);
        when(player2.getShape()).thenReturn(Shape.PAPER);
        final EvaluateResult evaluateResult = new EvaluateResult(player1, player2);

        //when
        String result = evaluateResult.getResult();

        //then
        assertEquals(PLAYER2_WINNER, result);

    }

    @Test
    public void shouldEvaluateResultForRock_case2(){
        //given
        when(player1.getShape()).thenReturn(Shape.ROCK);
        when(player2.getShape()).thenReturn(Shape.SCISSOR);
        final EvaluateResult evaluateResult = new EvaluateResult(player1, player2);

        //when
        String result = evaluateResult.getResult();

        //then
        assertEquals(PLAYER1_WINNER, result);

    }

    @Test
    public void shouldEvaluateResultForPaper_case1(){
        //given
        when(player1.getShape()).thenReturn(Shape.PAPER);
        when(player2.getShape()).thenReturn(Shape.ROCK);
        final EvaluateResult evaluateResult = new EvaluateResult(player1, player2);

        //when
        String result = evaluateResult.getResult();

        //then
        assertEquals(PLAYER1_WINNER, result);

    }

    @Test
    public void shouldEvaluateResultForPaper_case2(){
        //given
        when(player1.getShape()).thenReturn(Shape.PAPER);
        when(player2.getShape()).thenReturn(Shape.SCISSOR);
        final EvaluateResult evaluateResult = new EvaluateResult(player1, player2);

        //when
        String result = evaluateResult.getResult();

        //then
        assertEquals(PLAYER2_WINNER, result);

    }





}
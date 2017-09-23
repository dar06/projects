package com.fun.game.result.impl;

import com.fun.game.Shape;
import com.fun.game.result.Result;

import static com.fun.game.result.Constants.PLAYER1_WINNER;
import static com.fun.game.result.Constants.PLAYER2_WINNER;

/**
 * Created by Darshana on 2017-09-22.
 */
public class PaperResult implements Result {
    @Override
    public String getResult(Shape shape) {
        return Shape.SCISSOR == shape ? PLAYER2_WINNER : PLAYER1_WINNER;
    }
}

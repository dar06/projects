package com.fun.game.result;

import com.fun.game.Shape;
import com.fun.game.result.impl.PaperResult;
import com.fun.game.result.impl.RockResult;
import com.fun.game.result.impl.ScissorResult;

/**
 * Created by Darshana on 2017-09-22.
 */
public class ResultFactory {

    public Result createResult(final Shape shape) {

        if (Shape.SCISSOR == shape) {
            return new ScissorResult();
        } else if (Shape.ROCK == shape) {
            return new RockResult();
        } else {
            return new PaperResult();
        }

    }
}

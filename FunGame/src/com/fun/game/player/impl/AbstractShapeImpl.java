package com.fun.game.player.impl;

import com.fun.game.Shape;
import com.fun.game.player.Player;

/**
 * Created by Darshana on 2017-09-20.
 */
public abstract class AbstractShapeImpl implements Player {

    public Shape toShapeEnum(String choice) {
        switch (choice) {
            case "0":
                return Shape.SCISSOR;
            case "1":
                return Shape.ROCK;
            case "2":
                return Shape.PAPER;
        }
        System.out.println("Invalid choice try again");
        return getShape();
    }

    public abstract Shape getShape();

}

package com.fun.game.player.impl;

import com.fun.game.Shape;

import java.util.Random;

/**
 * Created by Darshana on 2017-09-20.
 */
public class Computer extends AbstractShapeImpl {

    public Shape getShape() {
        final Random random = new Random();
        return toShapeEnum(String.valueOf(random.nextInt(3)));
    }

}

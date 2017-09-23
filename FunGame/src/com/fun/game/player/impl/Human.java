package com.fun.game.player.impl;

import com.fun.game.Shape;

import java.util.Scanner;

/**
 * Created by Darshana on 2017-09-20.
 */
public class Human extends AbstractShapeImpl {
    @Override
    public Shape getShape() {
        System.out.println("Choose shape\n 0:Scissor\n 1:Rock\n 2:Paper\n");
        return toShapeEnum(new Scanner(System.in).nextLine());
    }

}

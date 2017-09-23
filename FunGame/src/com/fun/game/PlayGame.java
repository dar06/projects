package com.fun.game;

import com.fun.game.player.impl.Computer;
import com.fun.game.result.EvaluateResult;
import com.fun.game.player.impl.Human;

import java.util.Scanner;

/**
 * Created by Darshana on 2017-09-19.
 */
public class PlayGame {
    public static void main(String[] args) {
        getGameType();
    }

    private static void getGameType() {
        System.out.println("Choose game type\n 1:PlayerVsPlayer\n 2:PlayerVsComputer\n 3:NewGame\n");
        String choice = new Scanner(System.in).nextLine();
        switch (choice) {
            case "1":
                new EvaluateResult(new Human(), new Human()).getResult();
                return;
            case "2":
                new EvaluateResult(new Human(), new Computer()).getResult();
                return;
            case "3":
                getGameType();
                return;

        }
        System.out.println("InvalidChoice");
        getGameType();
    }
}

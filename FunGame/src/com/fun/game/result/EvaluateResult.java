package com.fun.game.result;

import com.fun.game.Shape;
import com.fun.game.player.Player;

import static com.fun.game.result.Constants.TIE;

/**
 * Created by Darshana on 2017-09-20.
 */
public class EvaluateResult {
    private final Player player1;
    private final Player player2;
    private final ResultFactory resultFactory;

    public EvaluateResult(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.resultFactory = new ResultFactory();
    }

    public String getResult() {
        System.out.println("Player1 choose shape");
        final Shape choice1 = player1.getShape();
        System.out.println("Player2 choose shape");
        final Shape choice2 = player2.getShape();
        if (choice1 == choice2) {
            System.out.println(String.format("Player1 choice[%s]: Player2 choice[%s]",choice1.name(),choice2.name()));
            System.out.println(TIE);
            return TIE;
        }
        final Result result = resultFactory.createResult(choice1);
        final String winner = result.getResult(choice2);
        System.out.println(String.format("Player1 choice[%s]: Player2 choice[%s]",choice1.name(),choice2.name()));
        System.out.println(winner);
        return winner;
    }

}
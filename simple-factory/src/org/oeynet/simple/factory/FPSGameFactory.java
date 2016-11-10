package org.oeynet.simple.factory;

import org.oeynet.simple.game.FPSGame;
import org.oeynet.simple.game.Game;

/**
 * Created by zhaojunlike on 2016/11/1.
 */
public class FPSGameFactory extends GameFactory {
    @Override
    public Game createGame() {
        return new FPSGame();
    }
}

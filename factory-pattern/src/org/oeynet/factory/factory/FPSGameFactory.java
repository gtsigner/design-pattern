package org.oeynet.factory.factory;

import org.oeynet.factory.game.FPSGame;
import org.oeynet.factory.game.Game;

/**
 * Created by zhaojunlike on 2016/11/1.
 */
public class FPSGameFactory extends GameFactory {
    @Override
    public Game createGame() {
        return new FPSGame();
    }
}

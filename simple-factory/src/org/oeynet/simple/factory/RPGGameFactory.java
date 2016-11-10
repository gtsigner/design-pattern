package org.oeynet.simple.factory;

import org.oeynet.simple.game.Game;
import org.oeynet.simple.game.RPGGame;

/**
 * Created by zhaojunlike on 2016/11/1.
 */
public class RPGGameFactory extends GameFactory {
    @Override
    public Game createGame() {
        return new RPGGame();
    }
}

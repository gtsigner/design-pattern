package org.oeynet.factory.factory;

import org.oeynet.factory.game.Game;
import org.oeynet.factory.game.RPGGame;

/**
 * Created by zhaojunlike on 2016/11/1.
 */
public class RPGGameFactory extends GameFactory {
    @Override
    public Game createGame() {
        return new RPGGame();
    }
}

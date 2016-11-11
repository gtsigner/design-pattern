package org.oeynet.factory;

import org.oeynet.factory.factory.FPSGameFactory;
import org.oeynet.factory.factory.GameFactory;
import org.oeynet.factory.game.Game;

import java.lang.*;

public class Start {
    public static void main(String[] args) {
        System.out.println();
        GameFactory factory = new FPSGameFactory();
        Game game = factory.createGame();
    }
}




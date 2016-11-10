package org.oeynet.simple;

import org.oeynet.simple.factory.FPSGameFactory;
import org.oeynet.simple.factory.GameFactory;
import org.oeynet.simple.game.Game;

import java.lang.*;

public class Start {
    public static void main(String[] args) {
        System.out.println();
        GameFactory factory = new FPSGameFactory();
        Game game = factory.createGame();
    }
}




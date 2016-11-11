
//import libs

public class GameFactory {

    public static void main(String[] args) {
        System.out.println("demo");
        try {

            GameFactory factory = new GameFactory();
            Game game1 = factory.createGame(1);
            Game game2 = factory.createGame(2);
        } catch (Exception ex) {

        }
    }


    public Game createGame(int gameType) {
        //JAVA8 支持switch String
        Game entry = null;
        switch (gameType) {
            case 1:
                entry = new LoL();
                break;
            case 2:
                entry = new CF();
                break;
            default:
                break;
        }
        if (null == entry) {
            //TODO
        }
        return entry;
    }
}

class Game {
    private String _gameName;

    public String getGameName() {
        return this._gameName;
    }
}

class LoL extends Game {
    private String _gameName = "LOL";

}

class CF extends Game {
    private String _gameName = "CF";

}
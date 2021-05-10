package Entities;

public class Game {
    private String gameName;
    private String gameId;
    private int gamePrice;

    public Game(String name, String gameId, int gamePrice) {
        this.gameName = name;
        this.gameId = gameId;
        this.gamePrice = gamePrice;
    }

    public String getGameName() {
        return gameName;
    }

    public String getGameId() {
        return gameId;
    }

    public int getGamePrice() {
        return gamePrice;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public void setGamePrice(int gamePrice) {
        this.gamePrice = gamePrice;
    }
}

import Adapter.MernisServiceAdapter;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Entities.Player;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("12332112321","Omer","Bulut", LocalDate.parse("2000-01-11"));
        GameManager gameManager = new GameManager();
        PlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
        playerManager.add(player);

    }
}

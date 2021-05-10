package Concrete;

import Abstract.PlayerCheckService;
import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService {
    private PlayerCheckService playerCheckService;

    @Override
    public void add(Player player) {
        if (playerCheckService.checkIfRealPerson(player))
            System.out.println("The player has been added: " + player.getFirstName());
        else {
            System.out.println("Can not verifed.");
        }
    }

    @Override
    public void delete(Player player) {
        System.out.println("The player has been deleted from the database: " + player.getFirstName());
    }

    @Override
    public void update(Player player) {
        System.out.println("Player informations have been updated");

    }
}

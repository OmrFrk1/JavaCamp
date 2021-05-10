package Concrete;

import Abstract.SellerService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class SellerManager implements SellerService {
    @Override
    public void sell(Game game, Player player) {
        System.out.println("The game "+ game.getGameName()+ "has been sold to "+ player.getFirstName()+". Amount of money paid: "+game.getGamePrice());

    }

    @Override
    public void sellWithDiscount(Game game, Player player, Campaign campaign) {
        System.out.println("The game "+ game.getGameName()+ "has been sold to "+ player.getFirstName()+"with % "+campaign.getDiscount()+" discount. Amount of money paid: "+(game.getGamePrice()-(game.getGamePrice())*campaign.getDiscount()));
    }
}

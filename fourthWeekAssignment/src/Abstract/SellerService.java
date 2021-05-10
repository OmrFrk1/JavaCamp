package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface SellerService {
    void sell(Game game, Player player);
    void sellWithDiscount(Game game, Player player, Campaign campaign);
}

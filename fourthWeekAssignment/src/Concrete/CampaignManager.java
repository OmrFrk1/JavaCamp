package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService {

    @Override
    public void add(Campaign campaign) {
        System.out.println("The campaign has started!! check this: " + campaign.getCampaingName()+" "+campaign.getDetail()+"% "+campaign.getDiscount()+"discount");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("The campaign has been deleted: " + campaign.getCampaingName());

    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("The campaign has been updated: " + campaign.getCampaingName());

    }
}

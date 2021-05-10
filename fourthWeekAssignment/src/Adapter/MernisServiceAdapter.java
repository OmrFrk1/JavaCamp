package Adapter;

import Abstract.PlayerCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

import java.util.Locale;

public class MernisServiceAdapter implements PlayerCheckService {
    @Override
    public boolean checkIfRealPerson(Player player) {
        KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
        try {
            return kpsPublicSoapProxy.TCKimlikNoDogrula(Integer.parseInt(player.getNationalityId()),player.getFirstName().toUpperCase(),player.getLastName().toUpperCase(),player.getDateOfbirth().getDayOfYear());


        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}

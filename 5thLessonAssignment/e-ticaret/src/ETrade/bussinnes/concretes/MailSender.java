package bussinnes.concretes;

import Entities.concretes.User;
import bussinnes.abstracts.VerificationService;

public class MailSender implements VerificationService {
    @Override
    public void clickLink() {

        System.out.println("Lutfen size gelen mailde dogrula butonuna tiklayiniz. ");
        System.out.println("Mail dogrulamasi yapildi.");

    }
}

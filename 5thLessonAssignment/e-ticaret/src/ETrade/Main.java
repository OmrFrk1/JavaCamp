import Entities.concretes.User;
import GoogleAuth.GoogleLogin;
import bussinnes.concretes.AuthManager;
import bussinnes.concretes.MailSender;
import core.GoogleAuthAdapter;
import dataAccess.concretes.HibernateUserDao;

public class Main {


    public static void main(String[] args) {
        User kullanici1 = new User(1, "Omer", "Bulut", "aa@gmail.com", "1111321321");
        AuthManager authManager = new AuthManager(new HibernateUserDao(),new MailSender(),new GoogleAuthAdapter());

        authManager.register(kullanici1);

    }
}

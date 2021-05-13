package bussinnes.concretes;

import Entities.concretes.User;
import bussinnes.abstracts.AuthService;
import bussinnes.abstracts.UserService;
import bussinnes.abstracts.VerificationService;
import core.LoginService;
import core.control.EmailRegex;
import dataAccess.abstracts.UserDao;

public class AuthManager implements AuthService {
    private UserService userService;

    private UserDao userDao;
    private VerificationService verificationService;
    private LoginService loginService;


    public AuthManager(UserDao userDao, VerificationService verificationService, LoginService loginService) {
        this.userDao=userDao;
        this.verificationService = verificationService;
        this.loginService = loginService;
    }

    @Override
    public void register(User user) {
        ValidationManager validationManager = new ValidationManager();
        if (validationManager.checkFirstName(user.getFirstName())&&
            validationManager.checkLastName(user.getLastName()) &&
            validationManager.checkPassword(user.getPassword()) &&
            validationManager.checkIfEmailExists(user.geteMail()) &&
                EmailRegex.eMailValidate(user.geteMail())) {
            this.userDao.add(user);
            System.out.println("Basariyla kayit olusturuldu");
        } else System.out.println("Girilen bilgiler hatali lutfen kontrol edin");


    }

    @Override
    public void login(String Email, String Password) {
        ValidationManager validationManager = new ValidationManager();
        if (validationManager.chekPassEmailPasword(Email, Password)) System.out.println("Basariyla giris yapildi");
        this.loginService.login(this.userDao.get(Email));

    }


    @Override
    public void verify(User user) {

    }

    @Override
    public boolean validation(User user) {
        return false;
    }
}


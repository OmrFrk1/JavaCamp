package core;

import Entities.concretes.User;
import GoogleAuth.GoogleLogin;

public class GoogleAuthAdapter implements LoginService{
    @Override
    public void login(User user) {
        GoogleLogin googleLogin = new GoogleLogin();
        googleLogin.login(user);
    }

    @Override
    public void register(User user) {
        GoogleLogin googleLogin = new GoogleLogin();
        googleLogin.register(user);

    }
}

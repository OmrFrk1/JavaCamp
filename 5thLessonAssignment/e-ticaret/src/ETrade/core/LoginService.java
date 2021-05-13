package core;

import Entities.concretes.User;

public interface LoginService {
    void login(User user);
    void register(User user);
}

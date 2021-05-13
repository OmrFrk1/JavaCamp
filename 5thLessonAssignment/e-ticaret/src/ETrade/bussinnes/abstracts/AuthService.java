package bussinnes.abstracts;

import Entities.concretes.User;

public interface AuthService {
    void register(User user);

    void verify(User user);

    boolean validation(User user);

    void login(String email, String password);
}

package bussinnes.abstracts;

import Entities.concretes.User;

import java.util.List;

public interface UserService {

    void update(User user);

    void delete(User user);

    void add(User user);



    List<User> getAll();
}

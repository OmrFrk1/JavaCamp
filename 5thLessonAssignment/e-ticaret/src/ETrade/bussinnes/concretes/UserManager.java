package bussinnes.concretes;

import Entities.concretes.User;
import bussinnes.abstracts.UserService;
import dataAccess.abstracts.UserDao;

import java.util.List;

public class UserManager implements UserService {
    private UserDao userDao;


    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void update(User user) {
        System.out.println("Basariyla guncellendi");
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
        System.out.println("Hesap basariyla silindi.");

    }

    @Override
    public void add(User user) {
        userDao.add(user);
        System.out.println("Kullanici bilgileri basariyla eklendi.");
    }




    @Override
    public List<User> getAll() {
        return null;
    }
}

package dataAccess.concretes;

import Entities.concretes.User;
import dataAccess.abstracts.UserDao;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {
    private static List<User> users = new ArrayList<>();


    @Override
    public void add(User user) {
        this.users.add(user);
        System.out.println("Kullanici eklendi");

    }

    @Override
    public void delete(User user) {
        this.users.removeIf(user1 -> user1.getId()==user.getId());

    }

    @Override
    public User get(String email) {
       return users.stream().filter(user -> user.geteMail()==email).findFirst().orElse(null);
    }

    @Override
    public List<User> getAll() {
        return null;
    }

}

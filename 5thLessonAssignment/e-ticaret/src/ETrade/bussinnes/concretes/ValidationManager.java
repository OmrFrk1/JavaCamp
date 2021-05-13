package bussinnes.concretes;

import Entities.concretes.User;
import bussinnes.abstracts.UserService;
import dataAccess.abstracts.UserDao;

public class ValidationManager {
    private UserDao userDao;
    private UserService userService;



    public boolean checkIfEmailExists(String email) {
        User user1 = userDao.get(email);
        if (user1 != null) {
            System.out.println("E-mail sisteme kayitli.");
            return false;
        } else return true;

    }



    public boolean checkFirstName(String firstame) {
        if (firstame.length() < 2) {
            System.out.println("Minimum 2 harften olusmalidir");
            return false;
        } else return true;
    }


    public boolean checkLastName(String lastName) {
        if (lastName.length() < 2) {
            System.out.println("Minimum 2 harften olusmalidir");
            return false;
        } else return true;
    }


    public boolean checkPassword(String password) {
        if (password.length() < 6) {
            System.out.println("Minimum 6 harften olusmalidir");
            return false;
        } else return true;


    }


    public boolean chekPassEmailPasword(String email, String password) {
        User user1 = userDao.get(email);
        if (email == "" || password == "") {
            System.out.println("Lutfen bos birakmayin.");
            return false;
        } else if (user1 == null) {
            System.out.println("Bu email adresi sisteme kayitli degil " + email);
            return false;
        } else if (user1.getPassword() != password) {
            System.out.println("Parola yanlis");
            return false;
        } else return true;
    }
}

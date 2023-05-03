package hu.unideb.inf.sfm.ij.theplaybook.model;

import java.util.List;

public interface UserDAO extends AutoCloseable{
    void saveUser(User u);
    void removeUser(User u);
    void updateUser(User u);
    List<User> getUsers();

    //Login with ID and PW encrypt on backend very unsafe but it works for now.
    User Login(String username, String password) throws Exception;
}

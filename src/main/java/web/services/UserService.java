package web.services;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    public void saveUser(User user);
//
//    void deleteUser();
//
//    void updateUser();

}

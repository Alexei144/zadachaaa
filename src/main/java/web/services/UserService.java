package web.services;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();



    User getUserById(int id);

    void saveUser(User user);

    void deleteUser(int id);

    void updateUser(int id, User updatedUser);
}

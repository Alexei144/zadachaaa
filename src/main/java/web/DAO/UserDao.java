package web.DAO;

import web.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();



    public void saveUser(User user);
//
//    void deleteUser();
//
//    void updateUser();

}

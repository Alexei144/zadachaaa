package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.DAO.UserDao;
import web.model.User;


import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {


    private final UserDao userDao;    //@Autowierd - Надо?

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {   // на методах уже не надо @Transactional  ?
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);

    }

    public User getUserById(int id) {
        return userDao.getUserById(id);
    }



    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    public void updateUser(int id, User updatedUser) {
        userDao.updateUser(id, updatedUser);
    }



}

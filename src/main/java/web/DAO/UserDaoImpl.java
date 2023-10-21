package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> getAllUsers() {
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

//    @PersistenceContext
//    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("em");
//
//    @Override
//    public List<User> getAllUsers() {
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        String query = "SELECT e FROM users e";
//        List<User> entities = entityManager.createQuery(query, User.class).getResultList();
//
//        entityManager.close();
//        entityManagerFactory.close();
//        return null;
//    }
//
//    @Override
//    public void createUser() {
//
//    }
//
//    @Override
//    public void deleteUser() {
//
//    }
//
//    @Override
//    public void updateUser() {
//
//    }
}

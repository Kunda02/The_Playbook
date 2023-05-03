package hu.unideb.inf.sfm.ij.theplaybook.model;
//import org.json.JSONObject;
import javax.persistence.*;
import java.util.List;

public class JpaUserDAO implements UserDAO {

    //java shit.


    private final EntityManagerFactory entityManagerFactory;
    private final EntityManager entityManager;

    public JpaUserDAO() {
        entityManagerFactory = Persistence.createEntityManagerFactory("pbPersistence");
        entityManager = entityManagerFactory.createEntityManager();
    }

    //Save user to Database.
    @Override
    public void saveUser(User u) {
        entityManager.getTransaction().begin();
        entityManager.persist(u);
        entityManager.getTransaction().commit();
    }

    //Remove user from Database.
    @Override
    public void removeUser(User u) {
        entityManager.getTransaction().begin();
        entityManager.remove(u);
        entityManager.getTransaction().commit();
    }

    //Update user in Database
    @Override
    public void updateUser(User u) {
        entityManager.getTransaction().begin();
        entityManager.persist(u);
        entityManager.getTransaction().commit();
    }

    //Get ALL Users from Database. (GDPR LOL)
    @Override
    public List<User> getUsers() {
        TypedQuery<User> query = entityManager.createQuery(
                "SELECT u FROM Users u", User.class);
        List<User> users = query.getResultList();
        return users;
    }

    //Login with ID and PW encrypt on backend very unsafe, but it works for now.
    @Override
    public User Login(String username, String password) throws Exception {
        User u;
        TypedQuery<User> query = entityManager.createQuery(
                "SELECT u FROM USERS u Where username = '" +username+ "' AND password = '" +password+ "'", User.class);

        u = query.getSingleResult();

        return u;
    }

    private User Exceptions(String s) {
        return null;
    }


    //Register method w/ username, password, email, name, userLevel.
    //
    //java shit.
    @Override
    public void close() throws Exception {
        entityManager.close();
        entityManagerFactory.close();
    }
}
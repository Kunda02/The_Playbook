package hu.unideb.inf.sfm.ij.theplaybook.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class JpaPageDAO implements PageDAO {

    private final EntityManagerFactory entityManagerFactory;
    private final EntityManager entityManager;

    public JpaPageDAO() {
        entityManagerFactory = Persistence.createEntityManagerFactory("pbPersistence");
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public List<Page> getPages() {
        TypedQuery<Page> query = entityManager.createQuery(
                "SELECT p FROM PAGES p", Page.class);
        List<Page> pages = query.getResultList();
        return pages;
    }

    @Override
    public void savePage(Page page) {
        entityManager.getTransaction().begin();
        entityManager.persist(page);
        entityManager.getTransaction().commit();
    }

    @Override
    public void updatePage(Page page) {
        entityManager.getTransaction().begin();
        entityManager.persist(page);
        entityManager.getTransaction().commit();
    }

    @Override
    public Page getPage(int id) {
        Page p;
        TypedQuery<Page> query = entityManager.createQuery(
                "SELECT p FROM PAGES p Where id = " +id, Page.class);

        p = query.getSingleResult();

        return p;
    }

    @Override
    public void removePage(Page page) {
        entityManager.getTransaction().begin();
        entityManager.remove(page);
        entityManager.getTransaction().commit();
    }
}

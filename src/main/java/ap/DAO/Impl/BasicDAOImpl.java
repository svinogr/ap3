package ap.DAO.Impl;

import ap.DAO.BasicDAO;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;

@Component
public class BasicDAOImpl<T> implements BasicDAO<T> {

    @Autowired
    SessionFactory sessionFactory;

    private Class<T> type;

    public BasicDAOImpl() {
    }

    public BasicDAOImpl(Class<T> type) {
        this.type = type;
    }

    /**The Method return list of entity
     * @return
     */
    @Override
    @Transactional
    public List<T> getAll() {
        List<T> result = new ArrayList<>();
        try(Session session = sessionFactory.openSession()) {
            result = session.createCriteria(type).list();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return result;
    }

    /** The Method saves entity ib BD
     * @param object
     */
    @Override
    @Transactional
    public void add(T object) {
        try {
            Session session = sessionFactory.getCurrentSession();
            session.save(object);
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    /**The Method deletes entity in BD
     * @param object
     */
    @Override
    @Transactional
    public void delete(T object) {
        try {
            Session session = sessionFactory.getCurrentSession();
            session.delete(object);
        } catch (HibernateException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void update(T object) {

    }

    @Override
    public T getById(int id) {
        return null;
    }
}

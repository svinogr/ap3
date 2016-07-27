package ap.DAO.Impl;

import ap.DAO.SearchDAO;
import ap.config.HibernateConfig;
import ap.entity.BDriver;
import ap.entity.Search;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;

@Component
@Import(HibernateConfig.class)
public class SearchDAOImpl implements SearchDAO {
    @Autowired
    SessionFactory sessionFactory;

    /**The controller return list of searched drivers by number
     * @param search
     * @return
     */
    @Override
    @Transactional
    public List getAllByNumber(Search search) {
        List<BDriver> result = new ArrayList();
        try {
            Session session = sessionFactory.getCurrentSession();
            Criteria criteria = session.createCriteria(BDriver.class);
            String searchNumber =search.getNumber().toLowerCase();
            criteria.add(Restrictions.eq("number", searchNumber));
            result.addAll(criteria.list());

        }catch (HibernateException e) {
            e.printStackTrace();
        }
        return result;
    }
}

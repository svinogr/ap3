package ap.DAO.Impl;

import ap.DAO.BasicDAO;
import ap.DAO.DriverDAO;
import ap.config.HibernateConfig;
import ap.entity.BDriver;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.Lifecycle;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
@Import(HibernateConfig.class)
public class DriverDAOImpl extends BasicDAOImpl<BDriver> implements DriverDAO {

    @Autowired
    SessionFactory sessionFactory;

    public DriverDAOImpl() {
        super(BDriver.class);
    }

    @Transactional
    @Override
    public List<BDriver> getDriverByInterval(int start){
        List<BDriver> bDriverList =new ArrayList<>();
        Session session = sessionFactory.getCurrentSession();
        Criteria criteria = session.createCriteria(BDriver.class);
        criteria.setMaxResults(20);
        criteria.setFirstResult(start);
        bDriverList.addAll(criteria.list());
        return bDriverList;
    }
}

package ap.DAO.Impl;

import ap.DAO.DriverDAO;
import ap.config.HibernateConfig;
import ap.entity.BDriver;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
@Import(HibernateConfig.class)
public class DriverDAOImpl extends BasicDAOImpl<BDriver> implements DriverDAO {

    @Autowired
    SessionFactory sessionFactory;

    public DriverDAOImpl() {
        super(BDriver.class);
    }
}

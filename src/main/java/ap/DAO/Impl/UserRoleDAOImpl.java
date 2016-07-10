package ap.DAO.Impl;

import ap.DAO.UserRoleDAO;
import ap.entity.UserRole;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserRoleDAOImpl extends BasicDAOImpl<UserRole> implements UserRoleDAO {

    @Autowired
    SessionFactory sessionFactory;

    public UserRoleDAOImpl() {
        super(UserRole.class);
    }
}

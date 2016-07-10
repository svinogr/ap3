package ap.DAO.Impl;

import ap.DAO.UserDAO;
import ap.DAO.UserRoleDAO;
import ap.config.HibernateConfig;
import ap.entity.Role;
import ap.entity.User;
import ap.entity.UserRole;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import java.util.Date;


@Component
@Import(HibernateConfig.class)
public class UserDAOImpl extends BasicDAOImpl<User> implements UserDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Autowired
    UserRoleDAO userRoleDAO;

    public UserDAOImpl() {
        super(User.class);
    }

    /**The Method registers new user
     * @param user
     */
    @Override
    @Transactional
      public void registration(User user) {
            user.setDate(new Date());
            String password = new BCryptPasswordEncoder().encode(user.getPassword());
            user.setPassword(password);
            UserRole userRole = new UserRole(user.getLogin(), Role.ROLE_USER);
            this.add(user);
            userRoleDAO.add(userRole);
    }

    /**The Method returns ID of record of entity in BD
     * @param login
     * @return
     */
    @Override
    @Transactional
    public int getIdByLogin(String login) {
        User user = new User();
        user.setId(0);
        try {
            Session session = this.sessionFactory.getCurrentSession();
            Criteria criteria = session.createCriteria(User.class);
            criteria.add(Restrictions.eq("login", login));
            user = (User) criteria.uniqueResult();

        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return user.getId();


    }

}

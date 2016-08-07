package ap.DAo;

import ap.DAO.UserDAO;
import ap.config.HibernateConfig;
import ap.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = HibernateConfig.class)
public class UserDaoImplTest {

    @Autowired
    UserDAO userDAO;

    @Test
    public void testAddAndDeleteUser(){
        User user = new User();
        user.setName("testName");
        user.setLogin("testLogin");
        user.setPassword("testPassword");
        user.setEmail("test@mail.com");
        userDAO.registration(user);
        userDAO.delete(user);
    }
}

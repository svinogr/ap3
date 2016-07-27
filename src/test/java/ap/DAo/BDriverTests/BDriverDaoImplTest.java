package ap.DAo.BDriverTests;

import ap.DAO.DriverDAO;
import ap.config.HibernateConfig;
import ap.entity.BDriver;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = HibernateConfig.class)
public class BDriverDaoImplTest {
    BDriver bDriver;
    @Autowired
    DriverDAO driverDAO;

    @Test
    public void addNewDriverInBd(){
        bDriver = new BDriver();
        bDriver.setNumber("a555aaa178");
        bDriver.setDescription("test");
        driverDAO.add(bDriver);

    }
    @After
    public void deleteNewTestDriver(){
        driverDAO.delete(bDriver);
    }



}



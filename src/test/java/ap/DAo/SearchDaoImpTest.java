package ap.DAo;

import ap.DAO.DriverDAO;
import ap.DAO.SearchDAO;
import ap.config.HibernateConfig;
import ap.entity.BDriver;
import ap.entity.Search;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static org.junit.Assert.assertEquals;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = HibernateConfig.class)
public class SearchDaoImpTest {
    BDriver driver;
    @Autowired
    DriverDAO driverDAO;

    @Autowired
    SearchDAO searchDAO;

    @Before
    public void addTestDriverInBD(){
        driver = new BDriver();
        driver.setNumber("a555aa178");
        driver.setDescription("test");
        driver.setDate(new Date());
        driverDAO.add(driver);
    }

    @Test
    public void searchByNumber(){
        Search search = new Search();
        search.setNumber(driver.getNumber());
        List<BDriver> list= new ArrayList<>();
        list = searchDAO.getAllByNumber(search);
        assertEquals(list.get(0).getId(),driver.getId());
    }

    @After
    public void deleteTestDriverFromBD(){
       driverDAO.delete(driver);
    }
}

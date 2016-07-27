package ap.DAo.BDriverTests;

import ap.DAO.DriverDAO;
import ap.config.HibernateConfig;
import ap.entity.BDriver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = HibernateConfig.class)
public class BDriverDaoImpl100records {

    BDriver bDriver;

    @Autowired
    DriverDAO driverDAO;

    @Test
    public void create100records(){
        for(int i=0; i<100; i++ ){
            bDriver = new BDriver();
            bDriver.setNumber(i+"a555aaa178");
            bDriver.setDescription("test");
            driverDAO.add(bDriver);

        }
    }

    @Test
    public  void delete100records(){
        List<BDriver> list = new ArrayList<>();
        list.addAll(driverDAO.getAll());
        for(int i=0; i<list.size();i++) {
            driverDAO.delete(list.get(i));
        }
    }
}

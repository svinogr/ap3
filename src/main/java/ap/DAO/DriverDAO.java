package ap.DAO;

import ap.entity.BDriver;
import java.util.List;

public interface DriverDAO extends BasicDAO<BDriver> {
   List<BDriver> getDriverByInterval(int start);
}

package ap.config;

import ap.DAO.DriverDAO;
import ap.DAO.Impl.DriverDAOImpl;
import ap.DAO.Impl.SearchDAOImpl;
import ap.DAO.Impl.UserDAOImpl;
import ap.DAO.Impl.UserRoleDAOImpl;
import ap.DAO.SearchDAO;
import ap.DAO.UserDAO;
import ap.DAO.UserRoleDAO;
import ap.service.UploadService;
import ap.service.UploadServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration
@PropertySource("classpath:util.properties")
@PropertySource(value = {"classpath:auth.properties"})
public class AppContext {
    @Autowired
    Environment environment;

    @Autowired
    HibernateConfig hibernateConfig;

    @Bean
    public UserDetailsService userDetailsService() {
        JdbcDaoImpl jdbcImpl = new JdbcDaoImpl();
        jdbcImpl.setDataSource(hibernateConfig.dataSource());
        jdbcImpl.setUsersByUsernameQuery(environment.getRequiredProperty("usersByQuery"));
        jdbcImpl.setAuthoritiesByUsernameQuery(environment.getRequiredProperty("rolesByQuery"));
        return jdbcImpl;
    }

    @Bean
    public UserDAO userDAO(){
        return new UserDAOImpl();
    }

    @Bean
    public UserRoleDAO userRoleDAO(){
        return new UserRoleDAOImpl();
    }

    @Bean
    public DriverDAO driverDAO(){return new DriverDAOImpl();
    }

    @Bean
    public SearchDAO searchDAO(){
        return new SearchDAOImpl();
    }

    @Bean
    public UploadService uploadService(){
        return new UploadServiceImpl();
    }

    @Bean(name = "multipartResolver")
    public CommonsMultipartResolver multipartResolver() {
        return new CommonsMultipartResolver();
    }
}

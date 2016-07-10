package ap.DAO;

import ap.entity.User;

public interface UserDAO extends BasicDAO<User> {
    void registration(User user);
    public int getIdByLogin(String login);

}

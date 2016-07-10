package ap.DAO;

import java.util.List;

public interface BasicDAO<T> {
    public List<T> getAll();
    public void add(T object);
    public void delete(T object);
    public void update(T object);
    public T getById(int id);
}

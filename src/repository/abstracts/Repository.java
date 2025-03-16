package repository.abstracts;


import java.util.List;

public interface Repository<T, Long> {
    void add(T t);
    void deleteAll();
    void update();
    void GetById(int id);
    List<T> GetAll();
}

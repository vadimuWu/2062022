package first.crud.dao;

import first.crud.model.Person;

import javax.persistence.EntityManager;
import java.util.List;

public interface DAO {
    EntityManager getEntityManager();

    List<Person> index();

    Person show(int id);

    void save(Person person);

    void update(Person person);

    void delete(int id);
}

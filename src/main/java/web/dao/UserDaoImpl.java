package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;


    public UserDaoImpl() {
    }

    //получить всех пользователей
    @Override
    public List<User> findAll() {
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    // найти пользователя по ID.
    @Override
    public User findById(Long id) {
        return entityManager.find(User.class, id);
    }
    //Cохранить нового пользователя или обновить существующего.

    @Override
    @Transactional
    public void add(User user) {
        if (user.getId() == null) {
            entityManager.persist(user);
        } else {
            entityManager.merge(user);
        }
    }
    //Обновляет данные существующего пользователя.

    @Override
    @Transactional
    public void update(User user) {
        entityManager.merge(user);
    }

    // удалить пользователя по ID
    @Override
    @Transactional
    public void delete(Long id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);

    }

}

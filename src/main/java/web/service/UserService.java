package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
    void add(User user);
    void delete(Long id);
    void update(User user);


}

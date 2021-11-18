package app.dao;

import app.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    User getUser(int id);

    void create(User user);

    void update(User user);

    void delete(int id);

}

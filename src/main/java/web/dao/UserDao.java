package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    int getCountUsers();

    void saveUser(User user);

    User getUserById(Long id);
    void removeUserById(Long id);

}

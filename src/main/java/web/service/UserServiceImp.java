package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImp implements UserService {

    private final UserDao userDAO;

    @Autowired
    public UserServiceImp(UserDao userDAO) {
        this.userDAO = userDAO;
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
    @Transactional
    @Override
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }
    @Transactional(readOnly = true)
    @Override
    public User getUserById(Long id) {
        return userDAO.getUserById(id);
    }

    @Transactional
    @Override
    public void removeUserById(Long id) {
        userDAO.removeUserById(id);
    }
}

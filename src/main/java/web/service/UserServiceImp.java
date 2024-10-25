package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImp implements UserService {

    private final UserDao userDAO;

    @Autowired
    public UserServiceImp(UserDao userDAO) {
        this.userDAO = userDAO;
    }


    @Override
    public List<User> getUsersOfCount(int count) {
        if (count == 0 || count > 5) return userDAO.getAllUsers();
        return userDAO.getAllUsers().stream().limit(count).collect(Collectors.toList());
    }

    @Override
    public int getCountUsers() {
        return userDAO.getCountUsers();
    }
}

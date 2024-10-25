package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsersOfCount(int count);
    int getCountUsers();
}

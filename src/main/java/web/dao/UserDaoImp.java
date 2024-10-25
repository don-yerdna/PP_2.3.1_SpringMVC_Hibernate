package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {
    private static long CARS_COUNT;
    private final List<User> users;

    {
        users = new ArrayList<>();
        User user1 = new User();
        user1.setId(++CARS_COUNT);
        user1.setFirstName("User1");
        user1.setLastName("Last1");
        user1.setEmail("User1@mail.ru");
        user1.setAge(30);
        users.add(user1);
        User user2 = new User();
        user2.setId(++CARS_COUNT);
        user2.setFirstName("User2");
        user2.setLastName("Last2");
        user2.setEmail("User2@mail.ru");
        user2.setAge(40);
        users.add(user2);
        User user3 = new User();
        user3.setId(++CARS_COUNT);
        user3.setFirstName("User3");
        user3.setLastName("Last3");
        user3.setEmail("User3@mail.ru");
        user3.setAge(50);
        users.add(user3);
        User user4 = new User();
        user4.setId(++CARS_COUNT);
        user4.setFirstName("User4");
        user4.setLastName("Last4");
        user4.setEmail("User4@mail.ru");
        user4.setAge(60);
        users.add(user4);
        User user5 = new User();
        user5.setId(++CARS_COUNT);
        user5.setFirstName("User5");
        user5.setLastName("Last5");
        user5.setEmail("User5@mail.ru");
        user5.setAge(70);
        users.add(user5);
        User user6 = new User();
        user6.setId(++CARS_COUNT);
        user6.setFirstName("User6");
        user6.setLastName("Last6");
        user6.setEmail("User6@mail.ru");
        user6.setAge(80);
        users.add(user6);
    }


    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public int getCountUsers() {
        return users.size();
    }
}

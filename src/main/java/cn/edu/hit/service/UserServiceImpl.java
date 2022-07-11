package cn.edu.hit.service;

import cn.edu.hit.dao.UserDao;
import cn.edu.hit.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class UserServiceImpl implements UserService {


    @Autowired
    UserDao userDao;

    @Override
    public void test() {
        System.out.println(userDao.test());
    }

    @Override
    public int changeName(String name) {
        return userDao.changeName(name);
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.login(user);
    }
}
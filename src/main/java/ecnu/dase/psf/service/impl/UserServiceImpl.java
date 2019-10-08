package ecnu.dase.psf.service.impl;

import ecnu.dase.psf.dao.IUserDao;
import ecnu.dase.psf.entity.User;
import ecnu.dase.psf.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author MartyPang
 * @version 1.0
 * @date 2019/10/8 16:46
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    private IUserDao userDao;

    @Override
    public User login(User user) {
        return userDao.login(user);
    }

    @Override
    public List<User> searchUsers(Map<String, Object> map) {
        return userDao.searchUsers(map);
    }

    @Override
    public Long getTotalUsers(Map<String, Object> map) {
        return userDao.getTotalUsers(map);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public int deleteUser(Integer uid) {
        return userDao.deleteUser(uid);
    }
}

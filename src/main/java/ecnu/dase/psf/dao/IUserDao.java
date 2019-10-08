package ecnu.dase.psf.dao;

import ecnu.dase.psf.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @author MartyPang
 * @version 1.0
 * @date 2019/10/8 16:44
 */
public interface IUserDao {
    /**
     * user login
     * @return
     */
    User login(User user);

    /**
     * search certain users by given parameters
     * @param map
     * @return
     */
    List<User> searchUsers(Map<String, Object> map);

    /**
     * get the number of all users under given conditions
     * @param map
     * @return
     */
    Long getTotalUsers(Map<String, Object> map);

    /**
     * update information of a certain user
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * add a new user
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * delete a certain user who owns uid
     * @param uid
     * @return
     */
    int deleteUser(Integer uid);
}

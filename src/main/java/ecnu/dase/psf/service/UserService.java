package ecnu.dase.psf.service;

import ecnu.dase.psf.entity.User;

import java.util.List;
import java.util.Map;


public interface UserService {
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

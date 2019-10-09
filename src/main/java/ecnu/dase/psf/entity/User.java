package ecnu.dase.psf.entity;

/**
 * @author MartyPang
 * @version 1.0
 * @date 2019/10/8 16:27
 */
public class User {
    private Integer id;
    private String userName;
    private String password;
    private String roleName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + userName + '\'' +
                ", password=" + password +
                ", role='" + roleName + '\'' +
                '}';
    }
}

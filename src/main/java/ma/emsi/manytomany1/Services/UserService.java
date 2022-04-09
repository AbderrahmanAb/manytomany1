package ma.emsi.manytomany1.Services;

import ma.emsi.manytomany1.entities.Role;
import ma.emsi.manytomany1.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String username);
    Role findRoleByRoleName(String RoleName);
    void addRoleToUser(String username,String roleName);

}

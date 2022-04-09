package ma.emsi.manytomany1.Services;

import ma.emsi.manytomany1.entities.Role;
import ma.emsi.manytomany1.entities.User;
import ma.emsi.manytomany1.repositories.RoleRepository;
import ma.emsi.manytomany1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional

public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    @Override
    public User addNewUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Role addNewRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public User findUserByUserName(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public Role findRoleByRoleName(String RoleName) {
        return roleRepository.findByRoleName(RoleName);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {

    }
}

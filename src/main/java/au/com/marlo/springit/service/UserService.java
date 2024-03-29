package au.com.marlo.springit.service;

import au.com.marlo.springit.model.User;
import au.com.marlo.springit.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final Logger logger = LoggerFactory.getLogger(UserService.class);
    //private final RoleService roleService;
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        //this.roleService = roleService;
        this.userRepository = userRepository;
    }

    public User register(User user) {
        return user;
    }

    public User save(User user) {
        return userRepository.save(user);
    }

}
package com.aficionado.sevice;

import com.aficionado.models.User;
import com.aficionado.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserService {
    private UserRepository userRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserService(UserRepository userRepository,
                       BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

//    public User findByUserId(Long Id) {
//        return userRepository.findUserById(Id);
//    }

    public void save(User user) {
        userRepository.save(user);
    }

    public User saveNewUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public User getLoggedInUser() {
        String loggedInUserName = SecurityContextHolder.
                getContext().getAuthentication().getName();

        return findByUserName(loggedInUserName);
    }


}

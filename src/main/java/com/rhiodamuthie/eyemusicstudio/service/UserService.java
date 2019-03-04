//package com.rhiodamuthie.eyemusicstudio.service;
//
//
//import com.rhiodamuthie.eyemusicstudio.model.User;
//import com.rhiodamuthie.eyemusicstudio.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class UserService {
//
//
//    private final UserRepository userRepository;
//
//    @Autowired
//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    public List<User> getAllUsers() {
//        return this.userRepository.findAll();
//    }
//
//    public User addUser(User user) {
//        return this.userRepository.save(user);
//    }
//
//    //other methods omitted for brevity
//}
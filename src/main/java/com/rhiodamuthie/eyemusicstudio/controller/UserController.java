package com.rhiodamuthie.eyemusicstudio.controller;

import com.rhiodamuthie.eyemusicstudio.dao.UserDao;
import com.rhiodamuthie.eyemusicstudio.model.User;
import com.rhiodamuthie.eyemusicstudio.repository.UserRepository;
//import com.rhiodamuthie.eyemusicstudio.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;
//    private final UserRepository userRepository;

//    private final UserService userService;

//    @Autowired
//    private UserDao userDao;

//    @Autowired
//    public UserController(UserRepository userRepository, UserService userService) {
//        this.userRepository = userRepository;
//        this.userService = userService;
//    }

    @GetMapping("/user")
    public List<User> getAllUser(){
        List<User> users = userRepository.findAll();
        return users;
    }

//    @GetMapping("/users")
//    public List<User> getAllUser(){
//        List<User> users = userDao.findAll();
//        User
//        return users;
//    }

    @GetMapping("/user")
    public User getUser(){
//        List<User> users = userDao.findAll();
        User user = new User();
        user.setFullname("AAA");
        user.setId(1L);
        user.setUsername("asasa");
        return user;
    }
//
//    @PostMapping("/user")
//    public String createUser(User user){
//        userRepository.save(user);
//        return "User created";
//    }
//    @RequestMapping(value = "/all", method = RequestMethod.GET)
//    public List<User> getAllUsers() {
//        return userService.getAllUsers();
//    }
//
//    @RequestMapping(value = "/adduser", method = RequestMethod.POST,
//            consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseBody()
//    public User addNewUser(@RequestBody User user) {
//        return this.userService.addUser(user);
//    }


}

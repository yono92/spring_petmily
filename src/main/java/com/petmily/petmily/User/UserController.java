package com.petmily.petmily.User;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @PostMapping(path = "/signup")
    public User signup(@RequestBody User user) {
        System.out.println(user);
        return userRepository.save(user);
    }
}

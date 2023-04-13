package com.petmily.petmily.User;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    
    //회원 가입
    @PostMapping(path = "/signup")
    public User signup(@RequestBody User user) {
        System.out.println(user);
        return userRepository.save(user);
    }



    // 회원 탈퇴
    @DeleteMapping(path = "/{userkey}")
    public void deleteUser(@PathVariable("userkey") Long userkey) {
        User user = userRepository.findById(userkey).orElseThrow(() -> new IllegalArgumentException("Invalid user ID"));
        userRepository.delete(user);
    }


    // 회원 정보 수정
    @PutMapping(path = "/{userkey}")
    public User updateUser(@PathVariable("userkey") Long userkey, @RequestBody User newUser) {
        User user = userRepository.findById(userkey).orElseThrow(() -> new IllegalArgumentException("Invalid user ID"));
        user.setUserid(newUser.getUserid());
        user.setPassword(newUser.getPassword());
        user.setUsername(newUser.getUsername());
        user.setNickname(newUser.getNickname());
        user.setAddress(newUser.getAddress());
        user.setZipcode(newUser.getZipcode());
        user.setPhonenum(newUser.getPhonenum());
        user.setEmail(newUser.getEmail());
        user.setUsertype(newUser.getUsertype());
        return userRepository.save(user);
    }
}

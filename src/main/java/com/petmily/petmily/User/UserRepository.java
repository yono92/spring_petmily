package com.petmily.petmily.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserid(String userid);

    User save(User user);

    void delete(User user);


}

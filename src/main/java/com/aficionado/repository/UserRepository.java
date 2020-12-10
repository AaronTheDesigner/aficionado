package com.aficionado.repository;


import com.aficionado.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUserName(String userName);

}

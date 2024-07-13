package com.digi.repository;

import com.digi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    List<User>getUserByNameAndSurname(String name,String surname);
}
